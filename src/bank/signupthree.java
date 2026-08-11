package bank;

import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class signupthree  extends JFrame implements ActionListener {
JButton submit,cancel;
JCheckBox c1,c2,c3,c4,c5,c6,c7;
JRadioButton savingAccount,FixedDeposit,CurrentAccount,DepositAccount;
String formno;

    signupthree(String formno){
 this.formno=formno;
    setLayout(null);
        // for the header
        JLabel header=new JLabel("Page 3: Account Details");
        header.setFont(new Font("Helvetica Neue",Font.BOLD,25));
        header.setBounds(200,20,300,50);
        add(header);

        //for the sub header of first part
        JLabel subheader=new JLabel("Account Type");
        subheader.setFont(new Font("Helvetica Neue",Font.BOLD,23));
        subheader.setBounds(85,110,300,50);
        add(subheader);

        //for the radiobutton
        savingAccount=new JRadioButton("Saving Account");
        savingAccount.setFont(new Font("Helvetica Neue",Font.PLAIN,15));
        savingAccount.setBounds(85,150,200,50);
        savingAccount.setBackground(Color.WHITE);
        savingAccount.setOpaque(true);
        savingAccount.setFocusPainted(false);
        add(savingAccount);

        FixedDeposit=new JRadioButton("Fixed Deposit ");
        FixedDeposit.setFont(new Font("Helvetica Neue",Font.PLAIN,15));
        FixedDeposit.setBounds(350,150,300,50);
        FixedDeposit .setBackground(Color.WHITE);
        FixedDeposit.setOpaque(true);
        FixedDeposit.setFocusPainted(false);
        add(FixedDeposit);

        CurrentAccount=new JRadioButton("Current Account");
        CurrentAccount.setFont(new Font("Helvetica Neue",Font.PLAIN,15));
        CurrentAccount.setBounds(85,200,200,50);
        CurrentAccount.setBackground(Color.WHITE);
        CurrentAccount.setOpaque(true);
        CurrentAccount.setFocusPainted(false);
        add(CurrentAccount);

        DepositAccount=new JRadioButton("Recurring Deposit Account");
        DepositAccount.setFont(new Font("Helvetica Neue",Font.PLAIN,15));
        DepositAccount.setBounds(350,200,300,50);
        DepositAccount.setBackground(Color.WHITE);
        DepositAccount.setOpaque(true);
        DepositAccount.setFocusPainted(false);
        add(DepositAccount);

        ButtonGroup Account=new ButtonGroup();
        Account.add(savingAccount);
        Account.add(FixedDeposit);
        Account.add(CurrentAccount);
        Account.add(DepositAccount);

        //for the card number
        JLabel cardnumber=new  JLabel("Card Number:");
        cardnumber.setFont(new Font("Helvetica Neue",Font.BOLD,20));
        cardnumber.setBounds(85,270,200,30);
        add(cardnumber);

        JLabel cardno=new JLabel("XXXX-XXXX-XXXX-4148");
        cardno.setFont(new Font("Helvetica Neue",Font.PLAIN,20));
        cardno.setBounds(350,270,250,50);
        add(cardno);

        JLabel card=new JLabel("Your 16 digit card number");
        card.setFont(new Font("Helvetica Neue",Font.BOLD,14));
        card.setBounds(85,300,200,30);
        add(card);

        //for the pin code
        JLabel pin=new JLabel("PIN :");
        pin.setFont(new Font("Helvetica Neue",Font.BOLD,20));
        pin.setBounds(85,340,100,30);
        add(pin);

        JLabel pincode=new JLabel("XXXX");
        pincode.setFont(new Font("Helvetica Neue",Font.PLAIN,20));
        pincode.setBounds(350,340,100,30);
        add(pincode);

        JLabel message=new JLabel("Your 4 digit pin code");
        message.setFont(new Font("Helvetica Neue",Font.BOLD,14));
        message.setBounds(85,370,200,30);
        add(message);



        // for the services portion
        JLabel service=new JLabel("Services Required :");
        service.setFont(new Font("Helvetica Neue",Font.BOLD,23));
        service.setBounds(85,430,300,30);
        add(service);

        //for the checkbox
        c1=new JCheckBox("ATM CARD");
        c1.setFont(new Font("Helvetica Neue",Font.PLAIN,18));
        c1.setBounds(85,480,200,20);
        c1.setBackground(Color.WHITE);
        c1.setOpaque(true);
        c1.setFocusPainted(false);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setFont(new Font("Helvetica Neue",Font.PLAIN,18));
        c2.setBounds(350,480,200,20);
        c2.setBackground(Color.WHITE);
        c2.setOpaque(true);
        c2.setFocusPainted(false);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Helvetica Neue",Font.PLAIN,18));
        c3.setBounds(85,520,200,20);
        c3.setBackground(Color.WHITE);
        c3.setOpaque(true);
        c3.setFocusPainted(false);
        add(c3);

        c4=new JCheckBox("Email & SMS Alert");
        c4.setFont(new Font("Helvetica Neue",Font.PLAIN,18));
        c4.setBounds(350,520,200,20);
        c4.setBackground(Color.WHITE);
        c4.setOpaque(true);
        c4.setFocusPainted(false);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setFont(new Font("Helvetica Neue",Font.PLAIN,18));
        c5.setBounds(85,560,200,20);
        c5.setBackground(Color.WHITE);
        c5.setOpaque(true);
        c5.setFocusPainted(false);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setFont(new Font("Helvetica Neue",Font.PLAIN,18));
        c6.setBounds(350,560,200,20);
        c6.setBackground(Color.WHITE);
        c6.setOpaque(true);
        c6.setFocusPainted(false);
        add(c6);

        c7=new JCheckBox("I hereby declares that the above details are correct to the best of my knowledge");
        c7.setFont(new Font("Helvetica Neue",Font.BOLD,18));
        c7.setBounds(85,640,800,30);
        c7.setBackground(Color.WHITE);
        c7.setOpaque(true);
        c7.setFocusPainted(false);
        add(c7);

        //for the next button
        submit=new JButton("Submit");
        submit.setFont(new Font("Helvetica Neue",Font.BOLD,20));
        submit.setBounds(100,740,150,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setOpaque(true);
        submit.setFocusPainted(false);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Helvetica Neue",Font.BOLD,20));
        cancel.setBounds(450,740,150,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setOpaque(true);
        cancel.setFocusPainted(false);
        cancel.addActionListener(this);
        add(cancel);


        setTitle("New Account Form Three ");
        setSize(850,820);
        setVisible(true);
        setLocation(400,100);
        getContentPane().setBackground(Color.WHITE);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (savingAccount.isSelected()) {
                accountType = "saving Account";
            } else if (FixedDeposit.isSelected()) {
                accountType = "Fixed Deposit";
            } else if (CurrentAccount.isSelected()) {
                accountType = "Current Account";
            } else if (DepositAccount.isSelected()) {
                accountType = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardno = "" + Math.abs((random.nextLong() % 90000000L) + 57980640000000L);
            String pincode = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String service = "";
            if (c1.isSelected()) service += "ATM CARD";
            else if (c2.isSelected()) service += "Internet Banking";
            else if (c3.isSelected()) service += "Mobile Banking";
            else if (c4.isSelected()) service += "Email & SMS Alert";
            else if (c5.isSelected()) service += "Cheque Book";
            else if (c6.isSelected()) service += "E-Statement";

            if (accountType == null) {
                JOptionPane.showMessageDialog(null, "Please enter your account type");
                return; // stop here if invalid
            }

            try {
                connection c = new connection();
                String query = "insert into signupthree values('" + formno + "','" + accountType + "','" + cardno + "','" + pincode + "','" + service + "')";
                String query2 = "insert into login values('" + formno + "','" + cardno + "','" + pincode + "')";
                c.s.executeUpdate(query);
                c.s.executeUpdate(query2);

                JOptionPane.showMessageDialog(null, "Card Number:"+cardno+"\nPin"+pincode);
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == cancel) {
            dispose();
        }
    }
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new signupthree("");

    }}
