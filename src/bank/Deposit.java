package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener  {

    //to declear the variable globally
    JButton backButton, depositButton;
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

    Deposit(String pincode){
        setLayout(null); // REQUIRED so setBounds() actually works
     this.pincode = pincode;
        // Label (instructional text, non-editable)
        JTextField label = new JTextField("Enter the amount you want to deposit");
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
     depositButton = new JButton("Deposit");
        depositButton.setFont(new Font("Helvetica Neue", Font.BOLD, 22));
        depositButton.setForeground(BUTTON_TEXT);
        depositButton.setBackground(BUTTON_COLOR);
        depositButton.setBounds(495, 480, 200, 45);
        depositButton.setOpaque(true);
        depositButton.setBorderPainted(false);   // needed on macOS for bg color to show
        depositButton.setFocusPainted(false);
        depositButton.setContentAreaFilled(true);
        depositButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // for the hand cursor
        depositButton.addActionListener(this);
        add(depositButton);

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
        if(ae.getSource()== depositButton){
            String number =amountField.getText();
            Date date = new Date();

        if(number.equals(" ")){
            JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
        }
        else{
            try{
                connection c=new connection();
                String query="insert into bank values('"+pincode+"','"+date+"','Deposit','"+ number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs"+ number +"Deposited successfully");
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
        new Deposit(" ");
    }
}