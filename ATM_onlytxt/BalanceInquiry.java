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



/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/