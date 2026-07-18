package bank;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class signupone extends JFrame {
    signupone(){
        setLayout(null);
        // to make the random application number
        Random ran=new Random();
        long random=Math.abs((ran.nextLong()%9000L)+1000L);

        // to make the random number application panel
        JLabel formno=new JLabel("Application form no:"+ random);
        formno.setFont(new Font("Osward",Font.BOLD,35));
        formno.setBounds(170,20,500,40);
        add(formno);

        // to make the sub header
        JLabel pageNo=new JLabel("Page 1: Personal details");
        pageNo.setFont(new Font("Osward",Font.BOLD,25));
        pageNo.setBounds(250,70,500,40);
        add(pageNo);

        // to make the content
        JLabel Name=new JLabel("Name:");
        Name.setFont(new Font("Raleway",Font.BOLD,20));
        Name.setBounds(100,140,100,40);
        add(Name);

        JTextField nametextfield=new JTextField();
        nametextfield.setFont(new Font("Raleway",Font.BOLD,20));
        nametextfield.setBounds(280,140,300,30);
        add(nametextfield);


        JLabel fName=new JLabel("Father's Name:");
        fName.setFont(new Font("Raleway",Font.BOLD,20));
        fName.setBounds(100,190,200,40);
        add(fName);

        JTextField fnametextfield=new JTextField();
        fnametextfield.setFont(new Font("Raleway", Font.BOLD,20));
        fnametextfield.setBounds(280,190,300,40);
        add(fnametextfield);


        JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,40);
        add(dob);

        // to add the clander we have to make the jar file and use JDateChooser
       JDateChooser datechooser=new JDateChooser();
       datechooser.setBounds(280,245,310,30);
       datechooser.setForeground(Color.RED);
       add(datechooser);


        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,40);
        add(gender);

        // to make the radio button for gender male and female
        JRadioButton male =new JRadioButton("Male");
        male.setBounds(280,290,100,40);
        add(male);

        JRadioButton female =new JRadioButton("Female");
        female.setBounds(380,290,100,40);
        add(female);

        //for to select the one button like on time
        ButtonGroup buttongroup=new ButtonGroup();
        buttongroup.add(male);
        buttongroup.add(female);



        JLabel email=new JLabel("E-mail:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,40);
        add(email);

        JTextField emailtextfield=new JTextField();
        emailtextfield.setFont(new Font("Raleway",Font.BOLD, 20));
        emailtextfield.setBounds(280,340,300,40);
        add(emailtextfield);

        JLabel marital=new JLabel("Marital stauts:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,40);
        add(marital);

        JRadioButton married=new JRadioButton("Married");
        married.setBounds(280,390,100,40);
        add(married);

        JRadioButton unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(380,390,100,40);
        add(unmarried);

        JRadioButton other =new JRadioButton("Others");
        other.setBounds(500,390,100,40);
        add(other);

        ButtonGroup buttongroup1=new ButtonGroup();
        buttongroup1.add(married);
        buttongroup1.add(unmarried);
        buttongroup1.add(other);


        JLabel Address=new JLabel("Address:");
        Address.setFont(new Font("Raleway",Font.BOLD,20));
        Address.setBounds(100,440,200,40);
        add(Address);

        JTextField addresstextfield=new JTextField();
        addresstextfield.setFont(new Font("Raleway",Font.BOLD, 20));
        addresstextfield.setBounds(280,440,300,40);
        add(addresstextfield);

        JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,490,200,40);
        add(state);

        JTextField statetextfield=new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD, 20));
        statetextfield.setBounds(280,490,300,40);
        add(statetextfield);

        JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,540,200,40);
        add(city);

        JTextField citytextfield=new JTextField();
        citytextfield.setFont(new Font("Raleway",Font.BOLD, 20));
        citytextfield.setBounds(280,540,300,40);
        add(citytextfield);

        JLabel pincode=new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,40);
        add(pincode);

        JTextField pincodetextfield=new JTextField();
        pincodetextfield.setFont(new Font("Raleway",Font.BOLD, 20));
        pincodetextfield.setBounds(280,590,300,40);
        add(pincodetextfield);

        // for the next button
        JButton next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setOpaque(true);
        next.setContentAreaFilled(true);
        next.setBorderPainted(false);
        next.setBounds(520,700,100,30);
        add(next);

        getContentPane().setBackground(Color.white);
        setSize(800, 900);
        setLocation(350,150);
        setVisible(true);


    }

    public static void main(String[] args){
        new signupone();

    }

}
