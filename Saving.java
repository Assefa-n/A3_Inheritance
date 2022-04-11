 /********************************************************************
 * Programmer:  naga Assefa
 * Class:  CS30S
 *
 * Assignment: Inheritance examole
 * Program Name:  name of public class
 *
 * Description: Docror sub-class of
 ****************************************************************** *****/
 
  // import java libraries here as needed


        public class Saving extends BankAccount { 
    
  // ********* declaration of constants **********
    private final double intrest = 0.02;
    //*** Class Variables ***
    
    //*** Instance Variables ***
     
     
     // constructors
    public Saving(){
        super.id = ID++; // the Id updating every time
        
        super.firstName = "Unknown";
        super.lastName = "unknown";
        super.balance = 0.0;
        
    }// end no-arg constructor
    
    public Saving(String fn, String ln, double s){
        super(fn,ln,s);
        
    }// end full-arg constructor
    
    
    // geters
    public String getWithdraw(double amt){
        super.balance = super.balance - amt;
        String s = "Withdrawl: "+ amt + " remaing balance" + balance; // string for the return variables
        
        if( balance < amt){
        s = "requested: " + amt + " |denied becouse your broke son!";
        super.balance += amt;
      }// end if
            
        return s;
    }// end setSpecialty();
    
    public String getAppliedInterest(){
        double ib = super.balance * this.intrest;
        ib += super.balance;
        String s = "Intrest applied balance: "+ ib;
        return s;
    } // end if
    
    }// end main
    
        


