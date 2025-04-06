public class Cheque extends Account
{
    private static double limitPerCheque=10000;//default Limit Per Cheque
    
    public Cheque(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance,String theactype)
   {
      // initialize superclass variables
      super(theAccountNumber, thePIN, theAvailableBalance,  theTotalBalance,theactype);
       
   } 
   
   public void setlimitPerCheque(double newlimitPerCheque){//setter of  Limit Per Cheque
          limitPerCheque = newlimitPerCheque;
     }
   
   public static double getlimitPerCheque(){//getter of Limit Per Cheque
    return limitPerCheque;
    }
}

