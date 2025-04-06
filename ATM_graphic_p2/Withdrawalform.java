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
import javax.swing.JTextPane;

public class Withdrawalform extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private boolean customize=false;//if user choose to customize the amount
    private String value;
    private int amount;
    CashDispenser cashdispenser= new CashDispenser();
    JLabel Label_1 = new JLabel("1 - HK$100");
    JLabel Label_2 = new JLabel("2 - HK$400");
    JLabel Label_3 = new JLabel("3 - HK$500");
    JLabel Label_4 = new JLabel("4 - HK$800");
    JLabel ChooseTheWithdrawal = new JLabel("Choose the withdrawal amount");
    JLabel WithdrawalMenu   = new JLabel("Withdrawal Menu (Cancel to return Main menu) ");
    JLabel Label_5 = new JLabel("5 - HK$1000");
    JLabel Label_6 = new JLabel("6 - Customised");
    JLabel Label_8 = new JLabel("Amount you want to withdrawal");

        public Withdrawalform() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 727, 444);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        ChooseTheWithdrawal.setFont(new Font("·s²Ó©úÅé", Font.BOLD, 13));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton Button1 = new JButton("1");
        Button1.addActionListener(new ActionListener() {//jbutton for input "1"
            public void actionPerformed(ActionEvent e) {
                if(customize) {
                value = textField.getText()+"1";
                textField.setText(value);}
                else {
                    amount=100;
                    execute();}
            }    });
        Button1.setBounds(151, 210, 87, 23);
        contentPane.add(Button1);
        
        JButton Button2 = new JButton("2");
        Button2.addActionListener(new ActionListener() {//jbutton for input "2"
            public void actionPerformed(ActionEvent e) {
                if(customize) {
                    value = textField.getText()+"2";
                    textField.setText(value);}
                else {
                    amount=400;
                    execute();}
                }    });
        Button2.setBounds(261, 210, 87, 23);
        contentPane.add(Button2);
        
        JButton Button3 = new JButton("3");
        Button3.addActionListener(new ActionListener() {//jbutton for input "3"
            public void actionPerformed(ActionEvent e) {
                if(customize) {
                    value = textField.getText()+"3";
                    textField.setText(value);}
                else {
                amount=500;
                execute();}
            }   });
        Button3.setBounds(374, 210, 87, 23);
        contentPane.add(Button3);
        
        JButton Button4 = new JButton("4");
        Button4.addActionListener(new ActionListener() {//jbutton for input "4"
            public void actionPerformed(ActionEvent e) {
            if(customize) {
            value = textField.getText()+"4";
            textField.setText(value);}
            else {
            amount=800;
            execute();}
            }   });
        Button4.setBounds(151, 257, 87, 23);
        contentPane.add(Button4);
        
        JButton Button5 = new JButton("5");
        Button5.addActionListener(new ActionListener() {//jbutton for input "5"
                public void actionPerformed(ActionEvent e) {
                if(customize) {
                    value = textField.getText()+"5";
                textField.setText(value);}
                else {
                amount=1000;
                execute();}
            }   });
        Button5.setBounds(261, 257, 87, 23);
        contentPane.add(Button5);
        
        JButton Button7 = new JButton("7");
        Button7.addActionListener(new ActionListener() {//jbutton for input "7"
            public void actionPerformed(ActionEvent e) {
            if(customize) {
            value = textField.getText()+"7";
            textField.setText(value);}
            }});
        Button7.setBounds(151, 309, 87, 23);
        contentPane.add(Button7);
        
        JButton Button8 = new JButton("8");
        Button8.addActionListener(new ActionListener() {//jbutton for input "8"
            public void actionPerformed(ActionEvent e) {
            if(customize) {
            value = textField.getText()+"8";
            textField.setText(value);}
            } });
        Button8.setBounds(261, 309, 87, 23);
        contentPane.add(Button8);
        
        JButton Button9 = new JButton("9");
        Button9.addActionListener(new ActionListener() {//jbutton for input "9"
            public void actionPerformed(ActionEvent e) {
            if(customize) {
            value = textField.getText()+"9";
            textField.setText(value);}
            }  });
        Button9.setBounds(374, 309, 87, 23);
        contentPane.add(Button9);
        
        JButton Button0 = new JButton("0");
        Button0.addActionListener(new ActionListener() {//jbutton for input "0"
            public void actionPerformed(ActionEvent e) {
            if(customize) {
            value= textField.getText()+"0";
            textField.setText(value);}
            } });
        Button0.setBounds(261, 348, 87, 23);
        contentPane.add(Button0);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 153, 191));
        panel.setBounds(151, 27, 424, 173);
        contentPane.add(panel);
        panel.setLayout(null);
        
        Label_1.setBounds(10, 45, 151, 15);
        panel.add(Label_1);
        
        Label_2.setBounds(10, 70, 110, 15);
        panel.add(Label_2);
        
        Label_3.setBounds(10, 95, 110, 15);
        panel.add(Label_3);
               
        Label_4.setBounds(10, 120, 99, 15);
        panel.add(Label_4);
       
               
        WithdrawalMenu.setBounds(10, 10, 393, 45);
        panel.add(WithdrawalMenu);
        
        Label_5.setBounds(130, 45, 99, 15);
        panel.add(Label_5);
       
        Label_6.setBounds(130, 70, 156, 15);
        panel.add(Label_6);
               
        ChooseTheWithdrawal.setBounds(116, 148, 170, 15);
        panel.add(ChooseTheWithdrawal);
         
        Label_8.setBounds(10, 45, 299, 15);
        panel.add(Label_8);
        Label_8.setVisible(false);
        JButton Button6 = new JButton("6");
        Button6.addActionListener(new ActionListener() {//jbutton for input "6"
            public void actionPerformed(ActionEvent e) {
                closeALLlb();
                Label_8.setVisible(true);
                textField.setVisible(true);
                if(customize) {
                value = textField.getText()+"6";
                textField.setText(value); }
                customize=true;
            } });
        Button6.setBounds(374, 257, 87, 23);
        contentPane.add(Button6);
        
        textField = new JTextField();
        textField.setBounds(138, 118, 117, 18);
        panel.add(textField);
        textField.setColumns(10);
        textField.setVisible(false);
        
        JButton ButtonEnter = new JButton("Enter");
        ButtonEnter.addActionListener(new ActionListener() {//jbutton for enter 
            public void actionPerformed(ActionEvent e) {
             amount=Integer.parseInt(value);
                if ( (amount % 100) == 0 ) {
                    execute();
                    textField.setVisible(false);}
                else {
                     textField.setVisible(false);
                     Label_8.setText("ATM only provide HK$100, HK$500, HK$1000");}
            }     });
        ButtonEnter.setBackground(new Color(255, 0, 0));
        ButtonEnter.setBounds(488, 309, 87, 23);
        contentPane.add(ButtonEnter);
        
        JButton ButtonCLEAR = new JButton("Clear");
        ButtonCLEAR.addActionListener(new ActionListener() {//jbutton for clear the input
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }   });
        ButtonCLEAR.setBackground(new Color(255, 255, 0));
        ButtonCLEAR.setBounds(488, 257, 87, 23);
        contentPane.add(ButtonCLEAR);
        
        JButton ButtonTransfer = new JButton("Transfer");
        ButtonTransfer.addActionListener(new ActionListener() {//jbutton for open transfer
            public void actionPerformed(ActionEvent e) {
                dispose();
                Transferform transfer=new Transferform();
                transfer.setVisible(true);
            } });
        ButtonTransfer.setBounds(598, 151, 87, 23);
        contentPane.add(ButtonTransfer);
        
        JButton ButtonBalance = new JButton("Balance");
        ButtonBalance.setEnabled(false);
        ButtonBalance.setBounds(598, 50, 87, 23);
        contentPane.add(ButtonBalance);
        
        JButton Button_Exit = new JButton("Exit");
        Button_Exit.addActionListener(new ActionListener() {//jbutton for logout
            public void actionPerformed(ActionEvent e) {
                  dispose();
                  LOGIN f1=new LOGIN();
                    f1.setVisible(true);
                }      });
        Button_Exit.setBounds(31, 50, 110, 23);
        contentPane.add(Button_Exit);
        
        JButton Button_withdrawal = new JButton("Withdrawal");
        Button_withdrawal.setEnabled(false);
        Button_withdrawal.setBounds(31, 151, 110, 23);
        contentPane.add(Button_withdrawal);
        
        JButton Button_dot = new JButton(".");
        Button_dot.setBounds(151, 348, 87, 23);
        contentPane.add(Button_dot);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {//jbutton for return main menu
            public void actionPerformed(ActionEvent e) {
                dispose();
                MAIN main=new MAIN();
                main.setVisible(true);
            }   });
        btnCancel.setBounds(374, 348, 87, 23);
        contentPane.add(btnCancel);
    }
    public void closeALLlb(){//function for close all label
        Label_1.setVisible(false);
        Label_2.setVisible(false);
        Label_3.setVisible(false);
        Label_4.setVisible(false);
        Label_5.setVisible(false);
        Label_6.setVisible(false);
        ChooseTheWithdrawal.setVisible(false);}
    private void execute(){
      boolean cashDispensed = false; // cash was not dispensed yet
      closeALLlb();
      // check whether the user has enough money in the account 
     if ( amount <= ATM.totalbank.getAvailableBalance(LOGIN.getac() )){ 
        if ( cashdispenser.isSufficientCashAvailable(amount ) ){// check whether the cash dispenser has enough money
                  // update the account involved to reflect withdrawal
                  ATM.totalbank.debit(LOGIN.getac(),amount);
                  cashdispenser.dispenseCash( amount ); // dispense cash
                  cashDispensed = true; // cash was dispensed
                  Label_8.setVisible(true);
                  Label_8.setText("Please take your cash now.");} 
        else{ // cash dispenser does not have enough cash
            Label_8.setVisible(true);
            Label_8.setText("Insufficient cash note in ATM");}
    } else{// not enough money available in user's account
        Label_8.setVisible(true);
        Label_8.setText("Insufficient funds in your account.");} // end if
   } // end method execute
      }

        
    

