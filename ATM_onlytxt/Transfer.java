// Transfer.java
// Represents a transfer ATM transaction
public class Transfer extends Transaction{
    
    private Keypad keypad;// reference to keypad
    private double tranMoney;// value of transfer money
    private int fromAc,toAc;//account transfer from and transfer to
    
    // transfer constructor
    public Transfer( int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad)
     {
      // initialize superclass variables
      super( userAccountNumber, atmScreen, atmBankDatabase );

      // initialize references to keypad 
      keypad = atmKeypad;  
      
     }
  
   // perform the transactions
    public void execute(){
       double availableBalance ;
       int check=0;//for different situation in account checking
       boolean tranend ; //for checking transfer is end or not
       boolean found; //for checking account is found or not
      
       // get references to bank database and screen
       BankDatabase bankDatabase = getBankDatabase();
       Screen screen = getScreen();
      
       //Account transfer from
       fromAc=getAccountNumber();
      
       do{
           screen.displayMessage("Please enter the account number you want to transfer (enter 0 to exit): ");
           toAc=keypad.getInput();//Account transfer to
           found=false;
            
           for(int k=0;k<bankDatabase.getChlength();k++){ //checking Cheque account exist or not
             if(toAc==bankDatabase.cheque[k].getAccountNumber()){
                 check=2;
                 found=true;
                 break;}
            }
           
           for(int j=0;j<bankDatabase.getSvlength();j++){ //checking Saving account exist or not
             if(toAc==bankDatabase.saving[j].getAccountNumber()){
                 found=true;
                 check=2;
                 break;}
            }  
           
           if (toAc==0){ //If user enter 0,exist to main menu
               found=true;
                return ;
            }
           else if (toAc==fromAc){ 
               check=1;
               found=true;  
            }     
           else if(found==false){
               check=3;
            }    
             
        
           switch(check){
             case 1:screen.displayMessageLine("\nYou can't transfer to own account.");break;
             
             case 2:screen.displayMessageLine("\nAccount exist.");break;
             
             case 3:screen.displayMessageLine("\nSorry.This account does not exist.");break;
             
             default: 
               screen.displayMessageLine( "\nSorry.This account does not exist." );
            }
    
      }while(check==1||check==3||check==0);
      
      availableBalance = bankDatabase.getAvailableBalance( getAccountNumber() );
    
      do{  
       tranend=false;
       //enter value of money to transfer
       screen.displayMessage("How much you want to transfer (enter 0 to exit): ");
       tranMoney=keypad.getInDouble();   
       if(tranMoney==0){ //If user enter 0,exist to main menu
        return;
        }
       if (tranMoney!=0){//If user is not entering 0,exist to main menu
       if(availableBalance>=tranMoney){
          //change the account balance 
          bankDatabase.debit( getAccountNumber(), tranMoney );
          bankDatabase.credit( toAc, tranMoney );
                    
        // display the balance information after transfer
         
         screen.displayMessage( "\nTransfer Success!You have transfer "  );
         screen.displayDollarAmount( tranMoney );
         screen.displayMessage( " to account number: "+toAc );
         screen.displayMessageLine("\nThis is your Balance Information:");
         screen.displayMessage( " \n- Available balance: " ); 
         screen.displayDollarAmount( bankDatabase.getAvailableBalance( getAccountNumber() ) );
         screen.displayMessage( "\n - Total balance:     " );
         screen.displayDollarAmount( bankDatabase.getTotalBalance(getAccountNumber()) );
         screen.displayMessageLine( "" );
         tranend=true; 
        }
        else{//If user do not have enough balance
        screen.displayMessageLine("\nSorry.Your account don't have enough balance,Please try again");
               
       }
      }
    }while(tranend==false);
    
  }
}
