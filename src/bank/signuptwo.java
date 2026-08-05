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
        religion.setBounds(95,105,150,30);
        add(religion);

        String valuereligion[]={"Select Option","Hindu", "Muslim", "Shikh", "Christian", "Other"};
        JComboBox religion1= new JComboBox(valuereligion);
        religion1.setFont(new Font("Raleway",Font.PLAIN,16));
        religion1.setBackground(Color.WHITE);
        religion1.setBounds(250,105,300,30);
        add(religion1);


        JLabel cate=new JLabel("Category:");
        cate.setFont(new Font ("Raleway",Font.BOLD,20));
        cate.setBounds(95,150,100,30);
        add(cate);

        String valuecate[]={"Select Option","Saving ","Current ", "Fix","NRN"};
        JComboBox cate1=new JComboBox(valuecate);
        cate1.setFont(new Font("Raleway",Font.PLAIN,16));
        cate1.setBackground(Color.WHITE);
        cate1.setBounds(250,150,300,30);
        add(cate1);

        JLabel income=new  JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(95,195,100,30);
        add(income);

        String valueincome[]={"Select Option","< 10,00,000","<25,00,000","<50,00,000","75,00,000","1,00,00,000"};
        JComboBox income1=new JComboBox(valueincome);
        income1.setFont(new Font("Raleway",Font.PLAIN,16));
        income1.setBackground(Color.WHITE);
        income1.setBounds(250,195,300,30);
        add(income1);


        JLabel quali=new  JLabel("Qualification:");
        quali.setFont(new Font("Raleway",Font.BOLD,20));
        quali.setBounds(95,235,200,30);
        add(quali);

        String qualification[]={"Select Option","Non-Graduation","Graduation","Post_Graduations","Doctorial","Other"};
        JComboBox quali1=new JComboBox(qualification);
        quali1.setFont(new Font("Raleway",Font.PLAIN,16));
        quali1.setBounds(250,235,300,30);
        quali1.setBackground(Color.WHITE);
        add(quali1);

        JLabel occ=new  JLabel("Occupation:");
        occ.setFont(new Font("Raleway",Font.BOLD,20));
        occ.setBounds(95,280,200,30);
        add(occ);

        String occupation[]={"Select Option","Student","Employment","Job Seeker","Working student","Other"};
        JComboBox occ1=new JComboBox(occupation);
        occ1.setFont(new Font("Raleway",Font.PLAIN,16));
        occ1.setBackground(Color.WHITE);
        occ1.setBounds(250,280,300,30);
        add(occ1);

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
        yes.setFont(new Font("Raleway", Font.TRUETYPE_FONT, 16));
        yes.setBackground(Color.WHITE);
        yes.setFocusPainted(false);
        yes.setBounds(300, 375, 80, 30);
        add(yes);

        JRadioButton no = new JRadioButton("No");
        no.setFont(new Font("Raleway", Font.TRUETYPE_FONT, 16));
        no.setBackground(Color.WHITE);
        no.setFocusPainted(false);
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
        yes1.setFont(new Font("Raleway", Font.TRUETYPE_FONT, 16));
        yes1.setBounds(300, 420, 80, 30);
        yes1.setFocusPainted(false);
        yes1.setBackground(Color.WHITE);
        add(yes1);

        JRadioButton no1=new JRadioButton ("No");
        no1.setFont(new Font("Raleway", Font.TRUETYPE_FONT, 16));
        no1.setBounds(420, 420, 80, 30);
        no1.setFocusPainted(false);
        no1.setBackground(Color.WHITE);
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
        next.setFocusPainted(false);
        next.setOpaque(true);
        add(next);


        getContentPane().setBackground(Color.WHITE);// we use get content pane to make the whole panel white including image background also
        setTitle("New Account Application From Two");
        setSize(700, 700);// to make the frame width and height
        setVisible(true); // to saw the frame because the frame is default hidden
        setLocation(450,150);
    }
    public void  actionPerformed(ActionEvent e){

    }




    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new signuptwo();
    }

}