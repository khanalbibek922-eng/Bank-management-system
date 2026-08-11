package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class signIn extends JFrame implements ActionListener {

    JButton sideDashboard, deposit, withdraw, transfer, statement, changePin, sideLogout;
    JButton quickDeposit, quickWithdraw, quickTransfer;
      String name, cardno;
    double balance;

    signIn(String name,String cardno ) {
        this.name = name;
        this.cardno = cardno;
        setLayout(null);

        //  SIDEBAR PANEL
        JPanel sidebar = new JPanel();
        sidebar.setLayout(null);
        sidebar.setBounds(0, 0, 200, 700);
        sidebar.setBackground(Color.BLACK);
        add(sidebar);

        JLabel bankLogo = new JLabel("🏦 MyBank");
        bankLogo.setFont(new Font("SansSerif", Font.BOLD, 20));
        bankLogo.setForeground(Color.WHITE);
        bankLogo.setBounds(20, 25, 160, 30);
        sidebar.add(bankLogo);


         sideDashboard = new JButton("Dashboard");
        sideDashboard.setFont(new Font("SansSerif", Font.PLAIN, 15));
        sideDashboard.setBackground(Color.BLACK);
        sideDashboard.setForeground(Color.WHITE);
        sideDashboard.setOpaque(true);
        sideDashboard.setBorderPainted(false);          //  removes the rounded white border
        sideDashboard.setFocusPainted(false);
        sideDashboard.setContentAreaFilled(true);       // forces background fill to actually render
        sideDashboard.setBounds(15, 100, 160, 30);
        sidebar.add(sideDashboard);

         deposit = new JButton("Deposit");
        deposit.setFont(new Font("SansSerif", Font.PLAIN, 15));
        deposit.setBackground(Color.BLACK);
        deposit.setForeground(Color.WHITE);
        deposit.setOpaque(true);
        deposit.setBorderPainted(false);          //  removes the rounded white border
        deposit.setFocusPainted(false);
        deposit.setContentAreaFilled(true);       // forces background fill to actually render
        deposit.setBounds(15, 150, 160, 30);
        sidebar.add(deposit);

        withdraw = new JButton("Withdraw");
        withdraw.setFont(new Font("SansSerif", Font.PLAIN, 15));
        withdraw.setBackground(Color.BLACK);
        withdraw.setForeground(Color.WHITE);
        withdraw.setOpaque(true);
        withdraw.setBorderPainted(false);
        withdraw.setFocusPainted(false);
        withdraw.setContentAreaFilled(true);
        withdraw.setBounds(15, 200, 160, 30);
        sidebar.add(withdraw);

         transfer = new JButton("Transfer");
        transfer.setFont(new Font("SansSerif", Font.PLAIN, 15));
        transfer.setBackground(Color.BLACK);
        transfer.setForeground(Color.WHITE);
        transfer.setOpaque(true);
        transfer.setBorderPainted(false);
        transfer.setFocusPainted(false);
        transfer.setContentAreaFilled(true);
        transfer.setBounds(15, 250, 160, 30);
        sidebar.add(transfer);

         statement = new JButton("Statement");
        statement.setFont(new Font("SansSerif", Font.PLAIN, 15));
        statement.setBackground(Color.BLACK);
        statement.setForeground(Color.WHITE);
        statement.setOpaque(true);
        statement.setBorderPainted(false);
        statement.setFocusPainted(false);
        statement.setContentAreaFilled(true);
        statement.setBounds(15, 300, 160, 30);
        sidebar.add(statement);

         changePin = new JButton("Change Pin");
        changePin.setFont(new Font("SansSerif", Font.PLAIN, 15));
        changePin.setBackground(Color.BLACK);
        changePin.setForeground(Color.WHITE);
        changePin.setOpaque(true);
        changePin.setBorderPainted(false);
        changePin.setFocusPainted(false);
        changePin.setContentAreaFilled(true);
        changePin.setBounds(15, 350, 160, 30);
        sidebar.add(changePin);

        sideLogout = new JButton("Logout");
        sideLogout.setFont(new Font("SansSerif", Font.PLAIN, 15));
        sideLogout.setForeground(Color.WHITE);
        sideLogout.setBackground(Color.BLACK);
        sideLogout.setBorderPainted(false);
        sideLogout.setFocusPainted(false);
        sideLogout.setContentAreaFilled(false);
        sideLogout.setHorizontalAlignment(SwingConstants.LEFT);
        sideLogout.setBounds(15, 620, 170, 40);
        sideLogout.addActionListener(this);
        sidebar.add(sideLogout);

        // MAIN CONTENT PANEL
        JPanel mainContent = new JPanel();
        mainContent.setLayout(null);
        mainContent.setBounds(200, 0, 600, 700);
        mainContent.setBackground(Color.WHITE);
        add(mainContent);

        JLabel welcome = new JLabel("Welcome ,"+name );
        welcome.setFont(new Font("SansSerif", Font.BOLD, 24));
        welcome.setBounds(30, 30, 500, 35);
        mainContent.add(welcome);

        JLabel accInfo = new JLabel("Account: " +cardno);
        accInfo.setFont(new Font("SansSerif", Font.PLAIN, 15));
        accInfo.setForeground(Color.GRAY);
        accInfo.setBounds(30, 68, 400, 25);
        mainContent.add(accInfo);

        // ===== BALANCE CARD =====
        JPanel balanceCard = new JPanel();
        balanceCard.setLayout(null);
        balanceCard.setBounds(30, 110, 540, 110);
        balanceCard.setBackground(new Color(245, 245, 245));
        balanceCard.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220), 1));
        mainContent.add(balanceCard);

        JLabel balanceLabel = new JLabel("Available Balance");
        balanceLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
        balanceLabel.setForeground(Color.GRAY);
        balanceLabel.setBounds(20, 15, 300, 25);
        balanceCard.add(balanceLabel);

        balance = fetchBalance(cardno); // pulls real value from DB

        JLabel balanceAmount = new JLabel("Rs. " + String.format("%,.2f", balance));
        balanceAmount.setFont(new Font("SansSerif", Font.BOLD, 30));
        balanceAmount.setBounds(20, 45, 400, 45);
        balanceCard.add(balanceAmount);

        // QUICK ACTIONS
        JLabel quickActionsLabel = new JLabel("Quick Actions");
        quickActionsLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        quickActionsLabel.setBounds(30, 250, 300, 30);
        mainContent.add(quickActionsLabel);

        quickDeposit = new JButton("Deposit");
        styleQuickButton(quickDeposit);
        quickDeposit.setBounds(30, 295, 160, 45);
        quickDeposit.addActionListener(this);
        mainContent.add(quickDeposit);

        quickWithdraw = new JButton("Withdraw");
        styleQuickButton(quickWithdraw);
        quickWithdraw.setBounds(205, 295, 160, 45);
        quickWithdraw.addActionListener(this);
        mainContent.add(quickWithdraw);

        quickTransfer = new JButton("Transfer");
        styleQuickButton(quickTransfer);
        quickTransfer.setBounds(380, 295, 160, 45);
        quickTransfer.addActionListener(this);
        mainContent.add(quickTransfer);

        setTitle("AUTOMATED TELLER MACHINE - Main Menu");
        setSize(800, 700);
        setLocation(400, 100);
        setVisible(true);
        setResizable(false);
    }

    // helper: keeps quick-action buttons visually consistent
    private void styleQuickButton(JButton b) {
        b.setFont(new Font("SansSerif", Font.BOLD, 15));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
        b.setBorderPainted(false);
        b.setOpaque(true);
    }

    // helper: fetch real balance from your DB
    private double fetchBalance(String accountNo) {
        double bal = 0.0;
        try {
            connection c = new connection();
            String query = "SELECT balance FROM signupthree WHERE accountno='" + accountNo + "'";
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                bal = rs.getDouble("balance");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return bal;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == quickDeposit || ae.getSource() == deposit) {
            // open deposit screen
        } else if (ae.getSource() == quickWithdraw || ae.getSource() == withdraw) {
            // open withdraw screen
        } else if (ae.getSource() == quickTransfer || ae.getSource() == transfer) {
            // open transfer screen
        } else if (ae.getSource() == statement) {
            // open mini statement screen
        } else if (ae.getSource() == changePin) {
            // open change pin screen
        } else if (ae.getSource() == sideLogout) {
            dispose();
            // new Login(); // adjust to your actual login class
        }
    }
    public static void main(String args[]){
        new signIn("","");
    }
}