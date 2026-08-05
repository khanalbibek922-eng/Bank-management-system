package bank;
import javax.swing.*;
import java.awt.*;
import java.util.*;

import com.sun.jdi.connect.spi.Connection;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

//import static jdk.internal.org.jline.utils.Colors.s;

public class signupone extends JFrame implements ActionListener {
    long random;
    JTextField nametextfield, fnametextfield, emailtextfield, addresstextfield, statetextfield, citytextfield, pincodetextfield;// to make the variable globally

    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser datechooser;

       signupone() {
        setLayout(null);
        // to make the random application number
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        // to make the random number application panel
        JLabel formno = new JLabel("Application form no:" + random);
        formno.setFont(new Font("Osward", Font.ITALIC, 30));
        formno.setBounds(170, 20, 500, 50);
        add(formno);

        // to make the sub header
        JLabel pageNo = new JLabel("Page 1: Personal details");
        pageNo.setFont(new Font("Osward", Font.BOLD, 25));
        pageNo.setBounds(250, 70, 500, 40);
        add(pageNo);

        // to make the content
        JLabel Name = new JLabel("Name:");
        Name.setFont(new Font("Raleway", Font.BOLD, 20));
        Name.setBounds(100, 140, 100, 40);
        add(Name);

        nametextfield = new JTextField();
        nametextfield.setFont(new Font("Raleway", Font.PLAIN, 20));
        nametextfield.setBounds(280, 140, 300, 30);
        add(nametextfield);


        JLabel fName = new JLabel("Father's Name:");
        fName.setFont(new Font("Raleway", Font.BOLD, 20));
        fName.setBounds(100, 190, 200, 40);
        add(fName);

        fnametextfield = new JTextField();
        fnametextfield.setFont(new Font("Raleway", Font.PLAIN, 20));
        fnametextfield.setBounds(280, 190, 300, 40);
        add(fnametextfield);


        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 40);
        add(dob);

        // to add the clander we have to make the jar file and use JDateChooser
        datechooser = new JDateChooser();
        datechooser.setBounds(280, 240, 300, 30);
        datechooser.setForeground(Color.RED);
        add(datechooser);


        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 40);
        add(gender);

        // to make the radio button for gender male and female
        male = new JRadioButton("Male");
        male.setBounds(280, 290, 100, 40);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(380, 290, 100, 40);
        add(female);

        //for to select the one button like on time
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(male);
        buttongroup.add(female);


        JLabel email = new JLabel("E-mail:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 40);
        add(email);

        emailtextfield = new JTextField();
        emailtextfield.setFont(new Font("Raleway", Font.PLAIN, 20));
        emailtextfield.setBounds(280, 340, 300, 40);
        add(emailtextfield);

        JLabel marital = new JLabel("Marital stauts:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 40);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(280, 390, 100, 40);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(380, 390, 100, 40);
        add(unmarried);

        other = new JRadioButton("Others");
        other.setBounds(500, 390, 100, 40);
        add(other);

        ButtonGroup buttongroup1 = new ButtonGroup();
        buttongroup1.add(married);
        buttongroup1.add(unmarried);
        buttongroup1.add(other);


        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Raleway", Font.BOLD, 20));
        Address.setBounds(100, 440, 200, 40);
        add(Address);

        addresstextfield = new JTextField();
        addresstextfield.setFont(new Font("Raleway", Font.PLAIN, 20));
        addresstextfield.setBounds(280, 440, 300, 40);
        add(addresstextfield);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 490, 200, 40);
        add(state);

        statetextfield = new JTextField();
        statetextfield.setFont(new Font("Raleway", Font.PLAIN, 20));
        statetextfield.setBounds(280, 490, 300, 40);
        add(statetextfield);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 540, 200, 40);
        add(city);

        citytextfield = new JTextField();
        citytextfield.setFont(new Font("Raleway", Font.PLAIN, 20));
        citytextfield.setBounds(280, 540, 300, 40);
        add(citytextfield);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 40);
        add(pincode);

        pincodetextfield = new JTextField();
        pincodetextfield.setFont(new Font("Raleway", Font.PLAIN, 20));
        pincodetextfield.setBounds(280, 590, 300, 40);
        add(pincodetextfield);

        // for the next button
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setOpaque(true);
        next.setContentAreaFilled(true);
        next.setBorderPainted(false);
        next.setFocusPainted(false);
        next.setBounds(520, 700, 100, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.white);
        setTitle("New Account Application From one");
        setSize(700, 800); // to make the form size
        setLocation(500, 100);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nametextfield.getText();
        String fname = fnametextfield.getText();
        if (datechooser.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please select your date of birth.");
            return; // stop here so the rest of the method doesn't run with bad data
        }
        String dob = datechooser.getDate().toString();

        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailtextfield.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Others";
        }

        String address = addresstextfield.getText();
        String state = statetextfield.getText();
        String city = citytextfield.getText();
        String pincode = pincodetextfield.getText();

        try {
            if (name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name is required");
            }

            else {
                connection c = new connection();
                String query = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + email + "','" + dob + "','" + marital + "','" + gender + "','" + address + "','" + state + "','" + city + "','" + pincode + "')";
                c.s.executeUpdate(query);//to run the ddl command

                if(ae.getSource()==next){
                    setVisible(false);
                    new signuptwo().setVisible(true);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }



 public static void main (String args[]){
        new signupone();

    }
}

