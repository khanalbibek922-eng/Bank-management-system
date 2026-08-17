package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class signIn extends JFrame implements ActionListener {

    JButton quickDeposit, quickWithdraw, quickTransfer;
    JButton hamburger;
    JPanel mainContent;

    String pincode;
    double balance;

    signIn(String pincode) {
        this.pincode=pincode;
        setLayout(null);

        // TOP BAR (logo + hamburger)
        JPanel topBar = new JPanel();
        topBar.setLayout(null);
        topBar.setBounds(0, 0, 800, 60);
        topBar.setBackground(Color.BLACK);
        add(topBar);

        JLabel bankLogo = new JLabel("🏦 MyBank");
        bankLogo.setFont(new Font("SansSerif", Font.BOLD, 20));
        bankLogo.setForeground(Color.WHITE);
        bankLogo.setBounds(20, 15, 160, 30);
        topBar.add(bankLogo);

        hamburger = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(Color.WHITE);
                int w = getWidth();
                int h = getHeight();
                int lineWidth = 18;
                int x = (w - lineWidth) / 2;
                int thickness = 2;

                g2.fillRect(x, h / 2 - 7, lineWidth, thickness);// top bar
                g2.fillRect(x, h / 2, lineWidth, thickness);// middle bar
                g2.fillRect(x, h / 2 + 7, lineWidth, thickness);// buttom bar
            }
        };
        hamburger.setBackground(Color.BLACK);
        hamburger.setBorderPainted(false);
        hamburger.setOpaque(true);
        hamburger.setFocusPainted(false);
        hamburger.setContentAreaFilled(true);
        hamburger.setBounds(740, 15, 30, 30);
        hamburger.addActionListener(e -> {
            JPopupMenu menu = buildDropdownMenu();
            menu.show(hamburger, -170, hamburger.getHeight());
        });
        topBar.add(hamburger);

        // MAIN CONTENT PANEL (full width, below top bar)
        mainContent = new JPanel();
        mainContent.setLayout(null);
        mainContent.setBounds(0, 60, 800, 640);
        mainContent.setBackground(Color.WHITE);
        add(mainContent);

        JLabel welcome = new JLabel("Welcome ," );
        welcome.setFont(new Font("SansSerif", Font.BOLD, 24));
        welcome.setBounds(30, 30, 500, 35);
        mainContent.add(welcome);

        JLabel accInfo = new JLabel("Account: " + pincode);
        accInfo.setFont(new Font("SansSerif", Font.PLAIN, 15));
        accInfo.setForeground(Color.GRAY);
        accInfo.setBounds(30, 68, 400, 25);
        mainContent.add(accInfo);

        //  BALANCE CARD
        JPanel balanceCard = new JPanel();
        balanceCard.setLayout(null);
        balanceCard.setBounds(30, 110, 740, 110);
        balanceCard.setBackground(new Color(245, 245, 245));
        balanceCard.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220), 1));// to draw a outline border around the blance card panel
        mainContent.add(balanceCard);

        JLabel balanceLabel = new JLabel("Available Balance");
        balanceLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
        balanceLabel.setForeground(Color.GRAY);
        balanceLabel.setBounds(20, 15, 300, 25);
        balanceCard.add(balanceLabel);

        balance = fetchBalance(pincode);

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
        quickDeposit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        quickDeposit.addActionListener(this);
        mainContent.add(quickDeposit);

        quickWithdraw = new JButton("Withdraw");
        styleQuickButton(quickWithdraw);
        quickWithdraw.setBounds(205, 295, 160, 45);
        quickWithdraw.setCursor(new Cursor(Cursor.HAND_CURSOR));
        quickWithdraw.addActionListener(this);
        mainContent.add(quickWithdraw);

        quickTransfer = new JButton("Transfer");
        styleQuickButton(quickTransfer);
        quickTransfer.setBounds(380, 295, 160, 45);
        quickTransfer.setCursor(new Cursor(Cursor.HAND_CURSOR));
        quickTransfer.addActionListener(this);
        mainContent.add(quickTransfer);

        setTitle("AUTOMATED TELLER MACHINE - Main Menu");
        setSize(800, 700);
        setLocation(400, 100);
        setVisible(true);
        setResizable(false);
    }

    // Builds the dropdown menu shown when the hamburger is clicked
    private JPopupMenu buildDropdownMenu() {
        JPopupMenu menu = new JPopupMenu();
        menu.setBackground(Color.BLACK);
        menu.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

        String[] items = {"Dashboard", "Deposit", "Withdraw", "Transfer", "Statement", "Change Pin", "Logout"};

        for (String item : items) {
            JMenuItem menuItem = new JMenuItem(item);
            menuItem.setFont(new Font("SansSerif", Font.PLAIN, 15));
            menuItem.setBackground(Color.BLACK);
            menuItem.setForeground(Color.WHITE);
            menuItem.setOpaque(true);
            menuItem.setBorderPainted(false);
            menuItem.setPreferredSize(new Dimension(180, 35));

            menuItem.addActionListener(e -> handleMenuClick(item));

            menu.add(menuItem);
        }
        return menu;
    }

    private void handleMenuClick(String item) {
        switch (item) {
            case "Dashboard":
                // already on dashboard, nothing to do (or refresh)
                break;
            case "Deposit":
                // open deposit screen
                break;
            case "Withdraw":
                // open withdraw screen
                break;
            case "Transfer":
                // open transfer screen
                break;
            case "Statement":
                // open mini statement screen
                break;
            case "Change Pin":
                // open change pin screen
                break;
            case "Logout":
                dispose();
                // new Login();
                break;
        }
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
         if(ae.getSource()== quickDeposit ) {
             setVisible(false);
             new Deposit(pincode).setVisible(true);

         }
        }


    public static void main(String args[]) {
        new signIn("");
    }
}