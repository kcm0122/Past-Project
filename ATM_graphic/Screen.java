// Screen.java
// Represents the screen of the ATM

public class Screen
{
   // displays a message without a carriage return
   public void displayMessage( String message ) 
   {
      System.out.print( message ); 
   } // end method displayMessage

   // display a message with a carriage return
   public void displayMessageLine( String message ) 
   {
      System.out.println( message );   
   } // end method displayMessageLine

   // display a dollar amount
   public void displayDollarAmount( double amount )
   {
      System.out.printf( "HK$%,.2f", amount );   
   } 
   
   // display a lnterest rate 
   public void displayInterest( double value )
   {
      System.out.print( value*100 + "%" );   
   } // end method displayDollarAmount 
} // end class Screen

