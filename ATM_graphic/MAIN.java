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
import javax.swing.SwingConstants;

public class MAIN extends JFrame {
    private JPanel contentPane;
 
    public MAIN() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 727, 444);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton Button1 = new JButton("1");
        Button1.setBounds(145, 210, 87, 23);
        contentPane.add(Button1);
        
        JButton Button2 = new JButton("2");
        Button2.setBounds(273, 210, 87, 23);
        contentPane.add(Button2);
        
        JButton Button3 = new JButton("3");
        Button3.setBounds(395, 210, 87, 23);
        contentPane.add(Button3);
        
        JButton Button4 = new JButton("4");      
        Button4.setBounds(145, 257, 87, 23);
        contentPane.add(Button4);
        
        JButton Button5 = new JButton("5");
        Button5.setBounds(273, 257, 87, 23);
        contentPane.add(Button5);
        
        JButton Button6 = new JButton("6");     
        Button6.setBounds(395, 257, 87, 23);
        contentPane.add(Button6);
        
        JButton Button7 = new JButton("7");  
        Button7.setBounds(145, 309, 87, 23);
        contentPane.add(Button7);
        
        JButton Button8 = new JButton("8");   
        Button8.setBounds(273, 309, 87, 23);
        contentPane.add(Button8);
        
        JButton Button9 = new JButton("9");  
        Button9.setBounds(395, 309, 87, 23);
        contentPane.add(Button9);
        
        JButton Button0 = new JButton("0");
        Button0.setBounds(273, 348, 87, 23);
        contentPane.add(Button0);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 153, 191));
        panel.setBounds(143, 27, 426, 172);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel Label = new JLabel("Welcome. Which function you want to use? Exit to logout");
        Label.setBounds(23, 21, 351, 35);
        panel.add(Label);
        
        JLabel BalanceInformation = new JLabel("Balance Information:");
        BalanceInformation.setBounds(23, 10, 138, 15);
        panel.add(BalanceInformation);
        BalanceInformation.setVisible(false);
       
        JLabel Label_1 = new JLabel("Available balance:");
        Label_1.setBounds(23, 31, 268, 15);
        panel.add(Label_1);
        Label_1.setVisible(false);
       
        JLabel Label_2 = new JLabel("Total balance: ");
        Label_2.setBounds(23, 66, 268, 15);
        panel.add(Label_2);
        Label_2.setVisible(false);
        
        JLabel Label3 = new JLabel("New label");
        Label3.setBounds(23, 91, 286, 15);
        panel.add(Label3);
        Label3.setVisible(false);
        
        JButton ButtonEnter = new JButton("Enter");
        ButtonEnter.setBackground(new Color(255, 0, 0));
        ButtonEnter.setBounds(507, 309, 87, 23);
        contentPane.add(ButtonEnter);
        
        JButton ButtonCLEAR = new JButton("Clear");
        ButtonCLEAR.setBackground(new Color(255, 255, 0));
        ButtonCLEAR.setBounds(507, 257, 87, 23);
        contentPane.add(ButtonCLEAR);
        
        JButton ButtonTransfer = new JButton("Transfer");//open the transferform
         ButtonTransfer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              dispose();
               Transferform transfer=new Transferform();
          transfer.setVisible(true);
            }   });
        ButtonTransfer.setBounds(579, 148, 122, 23);
        contentPane.add(ButtonTransfer);
        
        JButton ButtonBalance = new JButton("Balance");
        ButtonBalance.addActionListener(new ActionListener() {//show the balance 
        public void actionPerformed(ActionEvent e) {
            Label.setVisible(false);
            Label_2.setText("Total balance:$ "+ATM.totalbank.getTotalBalance(LOGIN.getac()));
            Label_2.setVisible(true);
            Label_1.setText("Available balance:$ "+ATM.totalbank.getAvailableBalance(LOGIN.getac()));
            Label_1.setVisible(true);
            if(ATM.totalbank.getActype(LOGIN.getac())=="Saving"){
           Label3.setText( "Interest rate(per annum): " +Saving.getInterestRate()*100 +"%") ;
            Label3.setVisible(true);
            }else if(ATM.totalbank.getActype(LOGIN.getac())=="Cheque"){
          Label3.setText( "Limit Per cheque:$ "+Cheque.getlimitPerCheque() ) ;
           Label3.setVisible(true);
           } 
            BalanceInformation.setVisible(true);
            } });
        ButtonBalance.setBounds(579, 54, 122, 23);
        contentPane.add(ButtonBalance);
        
        JButton Button_Exit = new JButton("Exit");
        Button_Exit.addActionListener(new ActionListener() {//button to logout 
            public void actionPerformed(ActionEvent e) {
              dispose();
               LOGIN f1=new LOGIN();
              f1.setVisible(true);
            }  });
        Button_Exit.setBounds(9, 54, 111, 23);
        contentPane.add(Button_Exit);
        
        JButton Button_withdrawal = new JButton("Withdrawal");
        Button_withdrawal.addActionListener(new ActionListener() {//open the withdrawal form 
            public void actionPerformed(ActionEvent e) {
                dispose();
                Withdrawalform withdrawal=new Withdrawalform();
                withdrawal.setVisible(true);
            }  });
        Button_withdrawal.setBounds(9, 148, 111, 23);
        contentPane.add(Button_withdrawal);
        
        JButton Button_dot = new JButton(".");
        Button_dot.setBounds(145, 348, 87, 23);
        contentPane.add(Button_dot);
    
        JButton buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(395, 348, 87, 23);
        contentPane.add(buttonCancel);
}
}
        
    

