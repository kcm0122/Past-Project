import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class LOGIN extends JFrame {
        ATM theATM = new ATM(); 
        private boolean userAuthenticated; // whether user is authenticated
        private int currentAccountNumber;
        private JPanel contentPane;
        private JPasswordField passwordField; 
        private JTextField textField;
        String ac,pin;
        static int acno,pass;
        boolean stage =false;
        JLabel Label = new JLabel("Welcome. Please insert your card or enter your account number and pin");

    public LOGIN() {
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 727, 444);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        passwordField=null;
        textField=null;
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton Button1 = new JButton("1");
        Button1.addActionListener(new ActionListener() {//jbutton for input "1"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                ac = textField.getText()+"1";
                textField.setText(ac);}
             else {
                pin = passwordField.getText()+"1";
                passwordField.setText(pin);
                }    
            }  });
        Button1.setBounds(165, 210, 87, 23);
        contentPane.add(Button1);
        
        JButton Button2 = new JButton("2");
        Button2.addActionListener(new ActionListener() {//jbutton for input "2"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"2";
                    textField.setText(ac);}
                else {
                    pin = passwordField.getText()+"2";
                    passwordField.setText(pin);
                    }
            }    });
        Button2.setBounds(277, 210, 87, 23);
        contentPane.add(Button2);
        
        JButton Button3 = new JButton("3");
        Button3.addActionListener(new ActionListener() {//jbutton for input "3"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"3";
                    textField.setText(ac);}
              else {
                    pin = passwordField.getText()+"3";
                    passwordField.setText(pin);
                    }
            }        });
        Button3.setBounds(391, 210, 87, 23);
        contentPane.add(Button3);
        
        JButton Button4 = new JButton("4");
        Button4.addActionListener(new ActionListener() {//jbutton for input "4"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"4";
                    textField.setText(ac);}
                 else {
                    pin = passwordField.getText()+"4";
                    passwordField.setText(pin);}
            }   });
        Button4.setBounds(165, 257, 87, 23);
        contentPane.add(Button4);
        
        JButton Button5 = new JButton("5");
        Button5.addActionListener(new ActionListener() {//jbutton for input "5"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"5";
                    textField.setText(ac);}
                 else {
                    pin = passwordField.getText()+"5";
                    passwordField.setText(pin);}
            }   });
        Button5.setBounds(277, 257, 87, 23);
        contentPane.add(Button5);
        
        JButton Button6 = new JButton("6");
        Button6.addActionListener(new ActionListener() {//jbutton for input "6"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"6";
                    textField.setText(ac);}
                  else {
                    pin = passwordField.getText()+"6";
                    passwordField.setText(pin);}
            }    });
        Button6.setBounds(391, 257, 87, 23);
        contentPane.add(Button6);
        
        JButton Button7 = new JButton("7");
        Button7.addActionListener(new ActionListener() {//jbutton for input "7"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"7";
                    textField.setText(ac);}
                   else {
                    pin = passwordField.getText()+"7";
                    passwordField.setText(pin);}
            }    });
        Button7.setBounds(165, 309, 87, 23);
        contentPane.add(Button7);
        
        JButton Button8 = new JButton("8");
        Button8.addActionListener(new ActionListener() {//jbutton for input "8"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"8";
                    textField.setText(ac);}
                 else {
                    pin = passwordField.getText()+"8";
                    passwordField.setText(pin);}
                }        });
        Button8.setBounds(277, 309, 87, 23);
        contentPane.add(Button8);
        
        JButton Button9 = new JButton("9");
        Button9.addActionListener(new ActionListener() {//jbutton for input "9"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"9";
                    textField.setText(ac);}
                else {
                pin = passwordField.getText()+"9";
                passwordField.setText(pin);}
            }   });
        Button9.setBounds(391, 309, 87, 23);
        contentPane.add(Button9);
        
        JButton Button0 = new JButton("0");
        Button0.addActionListener(new ActionListener() {//jbutton for input "0"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"0";
                    textField.setText(ac);}
                    else {
                    pin = passwordField.getText()+"0";
                    passwordField.setText(pin);}
            }   });
        Button0.setBounds(277, 358, 87, 23);
        contentPane.add(Button0);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 153, 191));
        panel.setBounds(155, 27, 420, 173);
        contentPane.add(panel);
        panel.setLayout(null);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(151, 142, 145, 21);
        panel.add(passwordField);
        
        textField = new JTextField();
        textField.setBounds(151, 112, 145, 21);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel LabelPIN = new JLabel("PIN");
        LabelPIN.setBounds(28, 145, 73, 15);
        panel.add(LabelPIN);
        
        JLabel LabelAC = new JLabel("Account Number");
        LabelAC.setBounds(28, 115, 98, 15);
        panel.add(LabelAC);
        
        Label.setFont(new Font("·s²Ó©úÅé", Font.BOLD, 13));
        Label.setBounds(23, 21, 387, 35);
        panel.add(Label);
       
        JButton ButtonEnter = new JButton("Enter");
        ButtonEnter.setBackground(new Color(255, 0, 0));
        ButtonEnter.addActionListener(new ActionListener() {//jbutton for enter 
            public void actionPerformed(ActionEvent e) {
                if (stage ) {
                pass=Integer.parseInt(pin);
                stage=false ;  
                authenticateUser();
                }else {stage=true;
                  acno=Integer.parseInt(ac);}  
                }   });
        ButtonEnter.setBounds(488, 309, 87, 23);
        contentPane.add(ButtonEnter);
        
        JButton ButtonCLEAR = new JButton("Clear");
        ButtonCLEAR.setBackground(new Color(255, 255, 0));
        ButtonCLEAR.addActionListener(new ActionListener() {//jbutton for input clear all input
            public void actionPerformed(ActionEvent e) {
                 if (stage!=true){
                     textField.setText("");}
                else{ 
                     passwordField.setText("");}
            }      });
        ButtonCLEAR.setBounds(488, 257, 87, 23);
        contentPane.add(ButtonCLEAR);
        
        JButton ButtonTransfer = new JButton("Transfer");
        ButtonTransfer.setEnabled(false);
        ButtonTransfer.setBounds(582, 145, 87, 23);
        contentPane.add(ButtonTransfer);
        
        JButton ButtonBalance = new JButton("Balance");
        ButtonBalance.setEnabled(false);
        ButtonBalance.setBounds(582, 49, 87, 23);
        contentPane.add(ButtonBalance);
        
        JButton Button_exit = new JButton("Exit");
        Button_exit.setEnabled(false);
        Button_exit.setBounds(24, 49, 100, 23);
        contentPane.add(Button_exit);
        
        JButton Button_withdrawal = new JButton("Withdrawal");
        Button_withdrawal.setEnabled(false);
        Button_withdrawal.setBounds(24, 145, 107, 23);
        contentPane.add(Button_withdrawal);
        
        JButton Button_dot = new JButton(".");
        Button_dot.setBounds(165, 358, 87, 23);
        contentPane.add(Button_dot);
        
        JButton buttonCancel = new JButton("Cancel");
        buttonCancel.addActionListener(new ActionListener() {//jbutton for reset the input
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                passwordField.setText("");
                stage=false;
            } });
        buttonCancel.setBounds(391, 358, 87, 23);
        contentPane.add(buttonCancel);
    }
    public static int getac(){//return current user account
        return acno;}
    private void authenticateUser(){
      int accountNumber = acno;
      int pin = pass; 
      // set userAuthenticated to boolean value returned by database
      userAuthenticated = ATM.totalbank.authenticateUser( accountNumber, pin );
     
      if ( userAuthenticated ){ // check whether authentication succeeded
         currentAccountNumber = accountNumber; // save user's account 
         dispose();
         MAIN f2=new MAIN();
        f2.setVisible(true);}         
        else{//if user login fail 
            Label.setText("Login fail.Please try again.");
            passwordField.setText("");
            textField.setText("");};// end if
   } // end method authenticateUser
}
        
    

