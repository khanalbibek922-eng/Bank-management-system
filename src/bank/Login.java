package bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
   JButton login, clear, Signup;
   JTextField cardTextField;
   JPasswordField PinTextField;
   String pincode;
   Login( String pincode){

      this.pincode=pincode;
      setLayout(null);
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
      Image i2=i1.getImage().getScaledInstance(100,100,100);
      ImageIcon i3=new ImageIcon(i2);
      JLabel label=new JLabel(i3);
      label.setBounds(70,0,100,100);
      add(label);

      JLabel text=new JLabel("Welcome to Bank Account");
      text.setFont(new Font("Osward",Font.BOLD,30));
      text.setBounds(220,40,500,50);
      add(text);

      JLabel cardno=new JLabel("Card No:");
      cardno.setFont(new Font("RaleWay",Font.BOLD,25));
      cardno.setBounds(110,150,400,40);
      add(cardno);

      cardTextField=new JTextField();
      cardTextField.setBounds(300, 150, 400, 40);
      cardTextField.setFont(new Font("Arial",Font.PLAIN,20));
      add(cardTextField);

      JLabel pin=new JLabel("PIN:");
      pin.setFont(new Font("RaleWay",Font.BOLD,25));
      pin.setBounds(120,230,400,20);
      add(pin);

      PinTextField=new JPasswordField();
      PinTextField.setBounds(300, 220, 400, 40);
      PinTextField.setFont(new Font("Arial",Font.BOLD,20));
      add(PinTextField);

      login=new JButton("Sign in");
      login.setBounds(300, 300, 100,30);
      login.setForeground(Color.WHITE);
      login.setBackground(Color.BLACK);
      login.setBorderPainted(false);
      login.setFocusPainted(false);
      login.setOpaque(true);
      login.addActionListener(this);
      add(login);

      clear=new JButton("Clear");
      clear.setBounds(490,300,100,30);
      clear.setBackground(Color.BLACK);
      clear.setForeground(Color.WHITE);
      clear.setBorderPainted(false);

      clear.setOpaque(true);
      clear.addActionListener(this);
      add(clear);

      Signup=new JButton("Sign up");
      Signup.setBounds(400,350,100,30);
      Signup.setBackground(Color.BLACK);
      Signup.setForeground(Color.WHITE);
      Signup.setBorderPainted(false);
      Signup.setFocusPainted(false);
      Signup.setOpaque(true);
      Signup.addActionListener(this);
      add(Signup);

      getContentPane().setBackground(Color.WHITE);

      setTitle("AUTOMATED TELLER MACHINE");
      setSize(800, 500);
      setVisible(true);
      setLocation(350,200);
   }

   public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==login){
         connection c=new connection();
         String cardno=cardTextField.getText();
         String pincode=PinTextField.getText();
         String query="select * from login where cardno='"+cardno+"' and pincode='"+pincode+"'";

         try{
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
               setVisible(false);
               new signIn(pincode).setVisible(true);
            } else {
               JOptionPane.showMessageDialog(null, "Invalid card number or PIN");
            }
         }
         catch (Exception e){
            System.out.println(e);
         }
      }
      else if(ae.getSource()==clear){
         cardTextField.setText("");
         PinTextField.setText("");
      }
      else if(ae.getSource()==Signup) {
         setVisible(false);
         new signupone().setVisible(true);
      }
   }

   public static void main(String[] args) {
      new Login("");
   }
}