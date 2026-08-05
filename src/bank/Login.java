package bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener {
    JButton login, clear, Signup;//to define globally to use outside the constructor
    JTextField  cardTextField;
    JPasswordField PinTextField;

    //constructor:we have to wrote all the code inside the constructor because while to set up the gui component immediately
    Login(){
     setLayout(null);// to make the all default boundaaries off;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));// CLassLoader say java to load the image from folder
        Image i2=i1.getImage().getScaledInstance(100,100,100);// to change the image scale
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);// component to display the photo or image
        label.setBounds(70,0,100,100);
        add(label);// to add the component into the frame

        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card No:");
        cardno.setFont(new Font("RaleWay",Font.BOLD,25));
        cardno.setBounds(110,150,400,40);
        add(cardno);

        //for the box or textfield
        cardTextField=new JTextField();
        cardTextField.setBounds(300, 150, 400, 40);
        cardTextField.setFont(new Font("Arial",Font.PLAIN,20));
        add(cardTextField);


        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("RaleWay",Font.BOLD,25));
        pin.setBounds(120,230,400,20);
        add(pin);

        //for the box or textfield
        PinTextField=new JPasswordField();
        PinTextField.setBounds(300, 220, 400, 40);
        PinTextField.setFont(new Font("Arial",Font.BOLD,20));
        add(PinTextField);

        //for the sign in button
        login=new JButton("Sign in");
        login.setBounds(300, 300, 100,30);
        login.setForeground(Color.WHITE);
        login.setBackground(Color. BLACK );
        login.setBorderPainted(false);
        login.setOpaque(true);
        login.addActionListener(this);
        login.addActionListener(this); // to give the response to the button what we click
        add(login);

        //for the back button
         clear=new JButton("Clear");
        clear.setBounds(490,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setBorderPainted(false);
        clear.setOpaque(true);
        clear.addActionListener(this);
        add(clear);

        //for sign up button
        Signup=new JButton("Sign up");
        Signup.setBounds(400,350,100,30);
        Signup.setBackground(Color.BLACK);
        Signup.setForeground(Color.WHITE);
        Signup.setBorderPainted(false);
        Signup.setOpaque(true);
        Signup.addActionListener(this);
        add(Signup);

        getContentPane().setBackground(Color.WHITE);// we use get content pane to make the whole panel white including image background also

        setTitle("AUTOMATED TELLER MACHINE"); //to set the title
        setSize(800, 500);// to make the frame width and height
        setVisible(true); // to saw the frame because the frame is default hidden
        setLocation(350,200);
    }
public void actionPerformed(ActionEvent ae){  //when we click the buttons it runs automatically by usong performed
if(ae.getSource()==login){

}
else if(ae.getSource()==clear){
   cardTextField.setText("");
   PinTextField.setText("");
}
else if(ae.getSource()==Signup){
    setVisible(false);// to change the frame when we click signup
    new signupone().setVisible(true);//now it open the signup frame

}
}
public static void main(String[] args) {
    //to make object
    new Login();
}
}
