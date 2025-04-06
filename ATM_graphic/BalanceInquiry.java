// BalanceInquiry.java
// Represents a balance inquiry ATM transaction

public class BalanceInquiry extends Transaction
{
   // BalanceInquiry constructor
   public BalanceInquiry( int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase )    
   {
      super( userAccountNumber, atmScreen, atmBankDatabase );
   } // end BalanceInquiry constructor

   // performs the transaction
   public void execute()
   {
      // get references to bank database and screen
      BankDatabase bankDatabase = getBankDatabase();
      Screen screen = getScreen();
      
      // get the available balance for the account involved
      double availableBalance = bankDatabase.getAvailableBalance( getAccountNumber() );
         
      // get the total balance for the account involved
      double totalBalance = bankDatabase.getTotalBalance( getAccountNumber() );
      
      // display the balance information on the screen
      screen.displayMessageLine( "\nBalance Information:" );
      screen.displayMessage( " - Available balance: " ); 
      screen.displayDollarAmount( availableBalance );
      screen.displayMessage( "\n - Total balance:     " );
      screen.displayDollarAmount( totalBalance );
      screen.displayMessageLine( "" );
      
      if(bankDatabase.getActype(getAccountNumber())=="Saving"){
           screen.displayMessage( " - Interest rate(per annum):" ) ;
          screen.displayInterest( Saving.getInterestRate() );
          screen.displayMessage( "\n - Interest(per annum):     " ) ;
          screen.displayDollarAmount( totalBalance * Saving.getInterestRate() );
          screen.displayMessageLine( "" );
        }
      else if(bankDatabase.getActype(getAccountNumber())=="Cheque"){
          screen.displayMessage( " - Limit Per cheque:  " ) ;
          screen.displayDollarAmount( Cheque.getlimitPerCheque());
          screen.displayMessageLine( "" );
        } 
   } // end method execute
} // end class BalanceInquiry

