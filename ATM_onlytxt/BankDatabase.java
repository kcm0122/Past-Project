// BankDatabase.java
// Represents the bank account information database 

public class BankDatabase
{
   
   Saving  saving[];// array of Saving Account
   Cheque  cheque[];// array of Cheque Account
   
   // no-argument BankDatabase constructor initializes accounts
   public BankDatabase()
   {
    saving= new Saving[4];//4 test saving account
    saving[ 0 ] = new Saving( 12468, 54321, 12327.0, 12327.0 ,"Saving");
    saving[ 1 ] = new Saving( 22222, 55555, 8212.82, 8212.82 ,"Saving"); 
    saving[ 2 ] = new Saving( 9876512, 123789, 7289.0, 7289.0 ,"Saving");
    saving[ 3 ] = new Saving( 22422, 10710, 8200.0, 8200.0 ,"Saving");
    cheque= new Cheque[2];//2 test Cheque account
    cheque[ 0 ] = new Cheque( 33333, 12345,100.0, 100.0,"Cheque" );
    cheque[ 1 ] = new Cheque( 44444, 321123, 3200.0, 3200.0,"Cheque" ); 
   } // end no-argument BankDatabase constructor
   
   // retrieve Account object containing specified account number
   private Account getAccount( int accountNumber )
   {
      for ( Saving currentSavingAccount : saving )
      {
         // return current Saving account if match found
         if ( currentSavingAccount.getAccountNumber() == accountNumber )
            
         return currentSavingAccount;
      } 
       
      for ( Cheque currentChequeAccount : cheque )
      {
         // return current Cheque account if match found
         if ( currentChequeAccount.getAccountNumber() == accountNumber )
            return currentChequeAccount;
      } 
      // if no matching account was found, return null
      return null;
    }
   // end method getAccount
   
   // determine whether user-specified account number and PIN match
   // those of an account in the database
   public boolean authenticateUser( int userAccountNumber, int userPIN )
   {
      // attempt to retrieve the account with the account number
      Account userAccount = getAccount( userAccountNumber );

      // if account exists, return result of Account method validatePIN
      if ( userAccount != null )
         return userAccount.validatePIN( userPIN );
      else
         return false; // account number not found, so return false
   } // end method authenticateUser
   
   // return available balance of Account with specified account number
   public double getAvailableBalance( int userAccountNumber )
   {
      return getAccount( userAccountNumber ).getAvailableBalance();
   } // end method getAvailableBalance

   // return total balance of Account with specified account number
   public double getTotalBalance( int userAccountNumber )
   {
      return getAccount( userAccountNumber ).getTotalBalance();
   } // end method getTotalBalance

   // credit an amount to Account with specified account number
   public void credit( int userAccountNumber, double amount )
   {
      getAccount( userAccountNumber ).credit( amount );
   } // end method credit

   // debit an amount from of Account with specified account number
   public void debit( int userAccountNumber, double amount )
   {
      getAccount( userAccountNumber ).debit( amount );
   } // end method debit
   
   //get the total number of Saving account exist
    public int getSvlength(){
     return saving.length;
    }
    //get the total number of Cheque account exist
    public int getChlength(){
     return cheque.length;
    }
   //get the account type 
    public String getActype( int userAccountNumber )
   {
      return getAccount( userAccountNumber ).getActype();
   } // end method getTotalBalance

} // end class BankDatabase



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