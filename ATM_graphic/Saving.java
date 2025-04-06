public class Saving extends Account
{
    private static double interestRate=0.001;//default interest rate
    
    public Saving (int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance,String theActype )
   {
      // initialize superclass variables
      super(theAccountNumber, thePIN, theAvailableBalance,  theTotalBalance, theActype);
      
   } 
   
   public void setInterestRate(double newRate) {//setter of interest rate
      interestRate = newRate;
     }
   
   public static double getInterestRate(){//getter of interest rate
    return interestRate;
    }
   
}