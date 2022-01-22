package Awt_programs;
import java.awt.*;

import javax.swing.JLabel;
public class Registration {
	
	Registration(){
		  
	Frame f = new Frame();
//    
     Label l = new Label("Registration Form");
     l.setBounds(180,300,150,50);
     l.setFont(new Font("Arial", Font.PLAIN, 15));
     f.add(l);
     
	Label l1 = new Label("Enter First Name:-");
	l1.setBounds(20, 40, 150, 20);
	l1.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Label l2 = new Label("Enter Last Name:-");
    l2.setBounds(20, 60, 150, 20);
	l2.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Label l3 = new Label("Enter Contact No:-");
    l3.setBounds(20, 80, 150, 20);
	l3.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Label l4 = new Label("Enter Your Address:-");
    l4.setBounds(20, 100, 150, 20);
	l4.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Label l5 = new Label("Enter Your City:-");
    l5.setBounds(20, 120, 150, 20);
	l5.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Label l6 = new Label("Enter Your State:-");
    l6.setBounds(20, 140, 150, 20);
	l6.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Label l7 = new Label("Your Hobbies:-");
    l7.setBounds(20, 160, 150, 20);
	l7.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Label l8 = new Label("Your Gender:-");
    l8.setBounds(20, 180, 150, 20);
	l8.setFont(new Font("Arial", Font.PLAIN, 15));
	
    CheckboxGroup cg1 = new CheckboxGroup();
    Checkbox c1 = new Checkbox("Male", cg1, true);
	c1.setFont(new Font("Arial", Font.PLAIN, 15));
    c1.setBounds(170, 180, 45, 20);

    Checkbox c2 = new Checkbox("Female", cg1, false);
	c2.setFont(new Font("Arial", Font.PLAIN, 15));
    c2.setBounds(215, 180, 65, 20);

   
    Label l9 = new Label("Choose Your Year:-");
    l9.setBounds(20, 200, 130, 20);
	l9.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Choice ch1 = new Choice();
    ch1.add("First");
    ch1.add("Second");
    ch1.add("Third");
    ch1.setBounds(170, 200, 150, 20);
	ch1.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Label  l10 = new Label("Select Your Semester");
    l10.setBounds(20,220,150,20);
	l10.setFont(new Font("Arial", Font.PLAIN, 15));
	
    Choice ch2 = new Choice();
    ch2.add("1st");
    ch2.add("2nd");
    ch2.add("3rd");
    ch2.add("4th");
    ch2.add("5th");
    ch2.add("6th");
    ch2.setBounds(170, 220, 150, 20);
	ch2.setFont(new Font("Arial", Font.PLAIN, 15));
	
    TextField tf1 = new TextField();
    tf1.setBounds(170, 40, 150, 20);
    TextField tf2 = new TextField();
    tf2.setBounds(170, 60, 150, 20);
    TextField tf3 = new TextField();
    tf3.setBounds(170, 80, 150, 20);
    TextField tf4 = new TextField();
    tf4.setBounds(170, 100, 150, 20);
    TextField tf5 = new TextField();
    tf5.setBounds(170, 120, 150, 20);
    TextField tf6 = new TextField();
    tf6.setBounds(170, 140, 150, 20);
    TextField tf7 = new TextField();
    tf7.setBounds(170, 160, 150, 20);

    Button b1=new Button("Submit");
    b1.setBounds(160,260,60,20);
	b1.setFont(new Font("Arial", Font.PLAIN, 15));
	
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l5);
    f.add(l6);
    f.add(l7);
    f.add(l8);
    f.add(l9);
    f.add(l10);
    
    f.add(tf1);
    f.add(tf2);
    f.add(tf3);
    f.add(tf4);
    f.add(tf5);
    f.add(tf6);
    f.add(tf7);

    f.add(c1);
    f.add(c2);
   

    f.add(ch1);
    f.add(ch2);
    
    f.add(b1);
    f.setLayout(null);
    f.setSize(500, 500);
    f.setVisible(true);
}


	public static void main(String[] args) {
Registration sc = new Registration();
	}

}
