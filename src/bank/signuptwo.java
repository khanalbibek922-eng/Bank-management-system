package bank;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class signuptwo extends JFrame implements ActionListener {



    signuptwo() {
        setLayout(null);
        // to make the header
        JLabel pageNo1 = new JLabel("Page 2: Additional details");
        pageNo1.setFont(new Font("Oswald", Font.BOLD, 25));
        pageNo1.setBounds(170, 20, 500, 30);
        add(pageNo1);

        JLabel religion=new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(95,105,100,30);
        add(religion);

        JTextField religiontextfield=new JTextField();
        religiontextfield.setFont(new Font("Raleway",Font.PLAIN,20));
        religiontextfield.setBounds(250,105,300,30);
        add(religiontextfield);

        JLabel cate=new JLabel("Category:");
        cate.setFont(new Font ("Raleway",Font.BOLD,20));
        cate.setBounds(95,150,100,30);
        add(cate);

        JTextField catetextfield=new JTextField();
        catetextfield.setFont(new Font("Raleway",Font.PLAIN,20));
        catetextfield.setBounds(250,150,300,30);
        add(catetextfield);

        JLabel income=new  JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(95,195,100,30);
        add(income);

        JTextField incometextfield=new JTextField();
        incometextfield.setFont(new Font("Raleway",Font.PLAIN,20));
        incometextfield.setBounds(250,195,300,30);
        add(incometextfield);

        JLabel quali=new  JLabel("Qualification:");
        quali.setFont(new Font("Raleway",Font.BOLD,20));
        quali.setBounds(95,235,200,30);
        add(quali);

        JTextField qualitextfield=new JTextField();
        qualitextfield.setFont(new Font("Raleway",Font.PLAIN,20));
        qualitextfield.setBounds(250,235,300,30);
        add(qualitextfield);

        JLabel occ=new  JLabel("Occupation:");
        occ.setFont(new Font("Raleway",Font.BOLD,20));
        occ.setBounds(95,280,200,30);
        add(occ);

        JTextField occtextfield=new JTextField();
        occtextfield.setFont(new Font("Raleway",Font.PLAIN,20));
        occtextfield.setBounds(250,280,300,30);
        add(occtextfield);

        JLabel tax=new  JLabel("Tax Number:");
        tax.setFont(new Font("Raleway",Font.BOLD,20));
        tax.setBounds(95,330,200,30);
        add(tax);

        JTextField taxtextfield=new JTextField();
        taxtextfield.setFont(new Font("Raleway",Font.PLAIN,20));
        taxtextfield.setBounds(250,330,300,30);
        add(taxtextfield);

        JLabel citizen = new JLabel("Senior Citizen:");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(95, 375, 200, 30);
        add(citizen);

        JRadioButton yes = new JRadioButton("Yes");
        yes.setFont(new Font("Raleway", Font.BOLD, 16));
        yes.setBounds(300, 375, 80, 30);
        add(yes);

        JRadioButton no = new JRadioButton("No");
        no.setFont(new Font("Raleway", Font.BOLD, 16));
        no.setBounds(420, 375, 80, 30);
        add(no);

        ButtonGroup seniorcitizen = new ButtonGroup();
        seniorcitizen.add(yes);
        seniorcitizen.add(no);

        JLabel account=new JLabel ("Existing Account:");
        account.setFont(new Font("Raleway", Font.BOLD, 20));
        account.setBounds(95, 420, 200, 30);
        add(account);

        JRadioButton yes1=new JRadioButton ("Yes");
        yes1.setFont(new Font("Raleway", Font.BOLD, 16));
        yes1.setBounds(300, 420, 80, 30);
        add(yes1);

        JRadioButton no1=new JRadioButton ("No");
        no1.setFont(new Font("Raleway", Font.BOLD, 16));
        no1.setBounds(420, 420, 80, 30);
        add(no1);

        ButtonGroup accountexist=new ButtonGroup();
        accountexist.add(yes1);
        accountexist.add(no1);


        // for the next button
        JButton next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBounds(550, 570, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBorderPainted(false);
        next.setOpaque(true);
        add(next);










        getContentPane().setBackground(Color.WHITE);// we use get content pane to make the whole panel white including image background also

        setSize(700, 700);// to make the frame width and height
        setVisible(true); // to saw the frame because the frame is default hidden
        setLocation(450,150);
    }

    public static void main(String[] args) {
        new signuptwo();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}