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
import javax.swing.SwingConstants;

public class Transferform extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private boolean stage =false;
    private String ac,value;
    private double amount;
    private int acTo;
    JLabel Label_3 = new JLabel("New label");
  
    public Transferform() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 727, 444);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        Label_3.setVisible(false);
        JButton Button1 = new JButton("1");
        Button1.addActionListener(new ActionListener() {//jbutton for input"1"
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                      ac = textField.getText()+"1";
                      textField.setText(ac);}
                else{
                      value = textField_1.getText()+"1";
                      textField_1.setText(value);}
            }});
        Button1.setBounds(164, 210, 87, 23);
        contentPane.add(Button1);
        
        JButton Button2 = new JButton("2");
        Button2.addActionListener(new ActionListener() {//jbutton for input"2"
            public void actionPerformed(ActionEvent e) {
                 if (stage!=true){
                     ac = textField.getText()+"2";
                     textField.setText(ac);}
                else{
                     value = textField_1.getText()+"2";
                     textField_1.setText(value);}
            } });
        Button2.setBounds(275, 210, 87, 23);
        contentPane.add(Button2);
        
        JButton Button3 = new JButton("3");
        Button3.addActionListener(new ActionListener() {//jbutton for input"3"
            public void actionPerformed(ActionEvent e) {
                 if (stage!=true){
                     ac = textField.getText()+"3";
                     textField.setText(ac);}
                else{
                     value = textField_1.getText()+"3";
                     textField_1.setText(value);}
            } });
        Button3.setBounds(385, 210, 87, 23);
        contentPane.add(Button3);
        
        JButton Button4 = new JButton("4");
        Button4.addActionListener(new ActionListener() {//jbutton for input"4"
            public void actionPerformed(ActionEvent e) {
                 if (stage!=true){
                     ac = textField.getText()+"4";
                     textField.setText(ac);}
                else{
                     value = textField_1.getText()+"4";
                     textField_1.setText(value);}
            }});
        Button4.setBounds(164, 257, 87, 23);
        contentPane.add(Button4);
        
        JButton Button5 = new JButton("5");
        Button5.addActionListener(new ActionListener() {//jbutton for input"5"
            public void actionPerformed(ActionEvent e) {
                 if (stage!=true){
                     ac = textField.getText()+"5";
                     textField.setText(ac);}
                else{
                     value = textField_1.getText()+"5";
                     textField_1.setText(value);}
            }});
        Button5.setBounds(275, 257, 87, 23);
        contentPane.add(Button5);
        
        JButton Button6 = new JButton("6");
        Button6.addActionListener(new ActionListener() {//jbutton for input"6"
        public void actionPerformed(ActionEvent e) {
                 if (stage!=true){
                     ac = textField.getText()+"6";
                     textField.setText(ac);}
                else{
                     value = textField_1.getText()+"6";
                     textField_1.setText(value);}
            }});
        Button6.setBounds(385, 257, 87, 23);
        contentPane.add(Button6);
        
        JButton Button7 = new JButton("7");
        Button7.addActionListener(new ActionListener() {//jbutton for input"7"
            public void actionPerformed(ActionEvent e) {
                 if (stage!=true){
                     ac = textField.getText()+"7";
                     textField.setText(ac);}
                else{
                     value = textField_1.getText()+"7";
                     textField_1.setText(value);}
            }});
        Button7.setBounds(164, 309, 87, 23);
        contentPane.add(Button7);
        
        JButton Button8 = new JButton("8");
        Button8.addActionListener(new ActionListener() {//jbutton for input"8"
            public void actionPerformed(ActionEvent e) {
            if (stage!=true){
              ac = textField.getText()+"8";
              textField.setText(ac);}
            else{
             value = textField_1.getText()+"8";
             textField_1.setText(value);}
            }});
        Button8.setBounds(275, 309, 87, 23);
        contentPane.add(Button8);
        
        JButton Button9 = new JButton("9");
        Button9.addActionListener(new ActionListener() {//jbutton for input"9"
            public void actionPerformed(ActionEvent e) {
                 if (stage!=true){
                    ac = textField.getText()+"9";
                   textField.setText(ac);}
                else{
                    value = textField_1.getText()+"9";
                    textField_1.setText(value);}
            }});
        Button9.setBounds(385, 309, 87, 23);
        contentPane.add(Button9);
        
        JButton Button0 = new JButton("0");
        Button0.addActionListener(new ActionListener() {//jbutton for input"0"
            public void actionPerformed(ActionEvent e) {
                 if (stage!=true){
                     ac = textField.getText()+"0";
                     textField.setText(ac);}
                 else{
                     value = textField_1.getText()+"0";
                     textField_1.setText(value);}
            }});
        Button0.setBounds(275, 348, 87, 23);
        contentPane.add(Button0);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 153, 191));
        panel.setBounds(162, 27, 430, 173);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblTransfer = new JLabel("Transfer (Cancel to return Main menu)");
        lblTransfer.setBounds(10, 10, 286, 35);
        panel.add(lblTransfer);
        
        textField = new JTextField();
        textField.setBounds(149, 55, 135, 21);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel NewLabel_1 = new JLabel("Transfer account to");
        NewLabel_1.setBounds(10, 58, 129, 15);
        panel.add(NewLabel_1);
        
        JLabel NewLabel_2 = new JLabel("Amount");
        NewLabel_2.setBounds(10, 98, 112, 15);
        panel.add(NewLabel_2);
        
        textField_1 = new JTextField();
        textField_1.setBounds(149, 95, 135, 21);
        panel.add(textField_1);
        textField_1.setColumns(10);
        Label_3.setVerticalAlignment(SwingConstants.TOP);
        
        Label_3.setBounds(10, 55, 398, 40);
        panel.add(Label_3);
        
        JButton ButtonEnter = new JButton("Enter");
        ButtonEnter.addActionListener(new ActionListener() {//jbutton for enter to execute
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    amount=Double.parseDouble(value);
                    stage=false ;         
                    textField_1.setVisible(false);
                    textField.setVisible(false);
                    NewLabel_2.setVisible(false);
                    NewLabel_1.setVisible(false);
                    execute();
                    }else {
                        stage=true;
                      acTo=Integer.parseInt(ac);}
            }});
        ButtonEnter.setBackground(new Color(255, 0, 0));
        ButtonEnter.setBounds(492, 309, 87, 23);
        contentPane.add(ButtonEnter);
        
        JButton ButtonCLEAR = new JButton("Clear");
        ButtonCLEAR.addActionListener(new ActionListener() {//jbutton for clear the input
            public void actionPerformed(ActionEvent e) {
            if (stage!=true){textField.setText("");}
            else{textField_1.setText("");}
            }});
        ButtonCLEAR.setBackground(new Color(255, 255, 0));
        ButtonCLEAR.setBounds(492, 257, 87, 23);
        contentPane.add(ButtonCLEAR);
        
        JButton ButtonTransfer = new JButton("Transfer");
        ButtonTransfer.setEnabled(false);
        ButtonTransfer.setBounds(602, 158, 99, 23);
        contentPane.add(ButtonTransfer);
        
        JButton ButtonBalance = new JButton("Balance");
        ButtonBalance.setEnabled(false);
        ButtonBalance.setBounds(602, 58, 99, 23);
        contentPane.add(ButtonBalance);
        
        JButton Button_Exit = new JButton("Exit");
        Button_Exit.addActionListener(new ActionListener() {//jbutton for logout
            public void actionPerformed(ActionEvent e) {
                  dispose();
                  LOGIN f1=new LOGIN();
                  f1.setVisible(true);
            }});
        Button_Exit.setBounds(30, 58, 112, 23);
        contentPane.add(Button_Exit);
        
        JButton Button_withdraw = new JButton("Withdrawal");
        Button_withdraw.addActionListener(new ActionListener() {//jbutton for open withdrawal function
            public void actionPerformed(ActionEvent e) {
                dispose();
                Withdrawalform withdrawal = new Withdrawalform();
                withdrawal.setVisible(true);
            }});
        Button_withdraw.setBounds(30, 158, 112, 23);
        contentPane.add(Button_withdraw);
        
        JButton Button_dot = new JButton(".");
        Button_dot.addActionListener(new ActionListener() {//jbutton for enter "."
            public void actionPerformed(ActionEvent e) {
                if (stage){                 
                     value = textField_1.getText()+".";
                     textField_1.setText(value);}
            }});
        Button_dot.setBounds(164, 348, 87, 23);
        contentPane.add(Button_dot);
        
        JButton ButtonCancel = new JButton("Cancel");
        ButtonCancel.addActionListener(new ActionListener() {//jbutton for return to main
            public void actionPerformed(ActionEvent e) {
                dispose();
                MAIN main=new MAIN();
                main.setVisible(true);
            } });
        ButtonCancel.setBounds(385, 348, 87, 23);
        contentPane.add(ButtonCancel);
    }
    
    private void execute(){
        boolean tranend=false ; //for checking transfer is end or not
        boolean found=false; //for checking account is found or not
    
      for(int k=0;k<ATM.totalbank.getChlength();k++){ //checking Cheque account exist or not
         if(acTo==ATM.totalbank.cheque[k].getAccountNumber()){
            Label_3.setText("\nAccount exist.");Label_3.setText("\nAccount exist.");}
        }
            
      for(int j=0;j<ATM.totalbank.getSvlength();j++){ //checking Saving account exist or not
       if(acTo==ATM.totalbank.saving[j].getAccountNumber()){
          found=true;Label_3.setText("\nAccount exist.");}
         }  
            
    if (acTo==LOGIN.getac()){ 
     Label_3.setText ("\nYou can't transfer to own account.");found=true; tranend=true;}     
    else if(found==false){
        Label_3.setText("Sorry.This account does not exist.");tranend=true;}    
              
       Label_3.setVisible(true);
       
       double availableBalance = ATM.totalbank.getAvailableBalance( LOGIN.getac() );
       while(tranend==false){ 
        if(availableBalance>=amount){
        //change the account balance 
        ATM.totalbank.debit( LOGIN.getac(), amount );
        ATM.totalbank.credit( acTo, amount );         
        Label_3.setText( "\nTransfer Success!You have transfer $" +amount +" to account number " +acTo );
        tranend=true; 
         }else{//If user do not have enough balance
         Label_3.setText("\nSorry.Your account don't have enough balance,Please try again"); 
         tranend=true;
        }
       }
     }
   }


        
    

