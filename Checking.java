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


        public class Checking extends BankAccount { 
    
    // ********* declaration of constants **********
     private final double FEE = 1.50;// chquing fee
     private final double ODF = 15;  // this is the over draft fee for chequing
    
    //*** Class Variables ***
    
    //*** Instance Variables ***
     
    
    public Checking(String fn, String ln, double b){
        super(fn,ln,b);
        
        
    }// end full-arg constructor
    
    // seters
    
    public String getCashCheque(double amt){
        
        super.balance = super.balance-amt-FEE;
        
        if(amt>balance){
            super.balance = super.balance-amt-FEE - ODF;
        }// end if
        String s = "Cheque: " + amt + " Balance: " + super.balance;
        return s;
    }// end setCheque
    
    }// end main
    
        


