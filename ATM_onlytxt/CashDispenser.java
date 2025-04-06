// CashDispenser.java
// Represents the cash dispenser of the ATM

public class CashDispenser 
{
   // the default initial number of note in the cash dispenser
   private final static int note_exist[] = {50,50,500}; //1000 500 100
   private int count[]={0,0,0};// count note remaining
   private int note_type[]={1000,500,100};//note type
   private int note_require[]={0,0,0};//note require

   // no-argument CashDispenser constructor initializes count to default
   public CashDispenser()
   {
      for(int i=0;i<note_type.length;i++){//set the note exist
       count[i]=note_exist[i];
        }
          
   } // end CashDispenser constructor

   // simulates dispensing of specified amount of cash
   public void dispenseCash( int amount )
   {
    for(int i=0;i<note_type.length;i++){
        if (amount>=note_type[i]){
            note_require[i]=amount/note_type[i];
            amount=amount%note_type[i];
            
        }
        }
       if(note_require[0]-count[0]>0){
        note_require[1]=note_require[1]+(note_require[0]-count[0])*2;
        note_require[0]=note_require[0]-(note_require[0]-count[0]);
        }
        if(note_require[1]-count[1]>0){
            note_require[2]=note_require[2]+(note_require[1]-count[1])*5;
            note_require[1]=note_require[1]-(note_require[1]-count[1]);
        }
     for(int j=0;j<note_type.length;j++){//minus the exist note
     count[j]-=note_require[j];
    }
  
    
   } // end method dispenseCash

   // indicates whether cash dispenser can dispense desired amount
   public boolean isSufficientCashAvailable( int amount )
   {
     
       for(int i=0;i<note_type.length;i++){//calculate the number of note
        if (amount>=note_type[i]){
            note_require[i]=amount/note_type[i];
            amount=amount%note_type[i];
            
        }
       
        }
       if(note_require[0]-count[0]>0){//HK$1000 transform to HK$500
        note_require[1]=note_require[1]+(note_require[0]-count[0])*2;
        note_require[0]=note_require[0]-(note_require[0]-count[0]);
        }
       if(note_require[1]-count[1]>0){//HK$500 transform to HK$100
            note_require[2]=note_require[2]+(note_require[1]-count[1])*5;
            note_require[1]=note_require[1]-(note_require[1]-count[1]);
        }
        
        if ((count[0]>=note_require[0])&&(count[1]>=note_require[1])&&(count[2]>=note_require[2])){
         for(int i=0;i<note_type.length;i++){//reset value
            note_require[i]=0;}
         return true;}// enough note available
        else{
          for(int i=0;i<note_type.length;i++){//reset value
            note_require[i]=0;}
            return false;} // not enough note available
      
        }// end method isSufficientCashAvailable

}// end class CashDispenser
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