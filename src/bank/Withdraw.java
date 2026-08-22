package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

    public class Withdraw extends JFrame implements ActionListener {

        //to declear the variable globally
        JButton backButton, withdrawButton;
        JTextField amountField;
        String pincode;
        // Centralized color palette - change once, applies everywhere
        private static final Color BG_COLOR       = new Color(0x1E1E2E); // dark slate background
        private static final Color LABEL_COLOR    = new Color(0xF5F5F5); // off-white label text
        private static final Color FIELD_BG       = Color.WHITE;
        private static final Color FIELD_TEXT     = new Color(0x1A1A1A);
        private static final Color FIELD_BORDER   = new Color(0x8D99AE);
        private static final Color BUTTON_COLOR   = new Color(0x27AE60); // green = positive action
        private static final Color BUTTON_HOVER   = new Color(0x219150);
        private static final Color BUTTON_TEXT    = Color.WHITE;

        Withdraw(String pincode){
            setLayout(null); // REQUIRED so setBounds() actually works
            this.pincode = pincode;
            // Label (instructional text, non-editable)
            JTextField label = new JTextField("Enter the amount you want to withdraw");
            label.setForeground(LABEL_COLOR);
            label.setBackground(BG_COLOR);
            label.setEditable(false);
            label.setBorder(null);
            label.setFont(new Font("Helvetica Neue", Font.BOLD, 25));
            label.setBounds(50, 30, 600, 40);
            add(label);

            // Actual input field for amount
            amountField = new JTextField();
            amountField.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
            amountField.setForeground(FIELD_TEXT);
            amountField.setBackground(FIELD_BG);
            amountField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(FIELD_BORDER, 2),
                    BorderFactory.createEmptyBorder(5, 10, 5, 10) // inner padding
            ));
            amountField.setBounds(50, 90, 500, 45);
            add(amountField);

            // Deposit button
            withdrawButton = new JButton("withdraw");
            withdrawButton.setFont(new Font("Helvetica Neue", Font.BOLD, 22));
            withdrawButton.setForeground(BUTTON_TEXT);
            withdrawButton.setBackground(BUTTON_COLOR);
            withdrawButton.setBounds(495, 480, 200, 45);
            withdrawButton.setOpaque(true);
            withdrawButton.setBorderPainted(false);   // needed on macOS for bg color to show
            withdrawButton.setFocusPainted(false);
            withdrawButton.setContentAreaFilled(true);
            withdrawButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // for the hand cursor
            withdrawButton.addActionListener(this);
            add(withdrawButton);

            // back button

            backButton = new JButton("Back");
            backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 22));
            backButton.setForeground(BUTTON_TEXT);
            backButton.setBackground(BUTTON_COLOR);
            backButton.setBounds(50, 480, 200, 45);
            backButton.setOpaque(true);
            backButton.setBorderPainted(false);   // needed on macOS for bg color to show
            backButton.setFocusPainted(false);
            backButton.setContentAreaFilled(true);
            backButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // for the hand cursor
            backButton.addActionListener(this);
            add(backButton);

            setTitle("Deposit");
            getContentPane().setBackground(BG_COLOR);
            setSize(700, 600);
            setLocation(400, 100);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()== withdrawButton){
                String number =amountField.getText();
                Date date = new Date();

                if(number.equals(" ")){
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                }
                else{
                    try{
                        connection c=new connection();
                        String query="insert into bank values('"+pincode+"','"+date+"','Withdraw','"+ number+"')";
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Rs "+ number +" withdraw successfully");
                        setVisible(false);
                        new signIn(pincode).setVisible(true);
                    }catch(Exception e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(null, "Deposit failed: " + e.getMessage());

                    }
                }
            }
            else if(ae.getSource()==backButton){
                setVisible(false);
                new signIn(pincode).setVisible(true);
            }

        }

        public static void main(String args[]){
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new Withdraw(" ");
        }
    }
