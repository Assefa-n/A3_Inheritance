/********************************************************************
 * Programmer:    Naga Assefa
 * Class:  CS30S
 *
 * Assignment: BankAccount hierarchey example
 *
 * Description: Example Super Class
 ***********************************************************************/

// import libraries as needed here

public class BankAccount {
    //*** Class Variables *** 
     protected static int ID = 1000;   // the Id that is diffrent for every imployee

    //*** Instance Variables ***
     protected String firstName;
     protected String lastName;
     protected double balance = 0.0; // the amount of money curently in account
     protected int id;                 // the ID of an employee
    //*** Constructors ***
    
    public BankAccount(){
        id = ID++; // the Id updating every time
        
        firstName = "Unknown";
        lastName = "unknown";
        balance = 0.0;
    }// end no-arg constructor
    
    public BankAccount( String fn, String ln, double b){
        id = ID++; // the Id updating every time
        this.firstName = fn;
        this.lastName = ln;
        this.balance = b;
       
    }// end full-arg constructor
    
    // getters
    
    public String getName(){
        String st = this.lastName + " " + this.firstName ;
        return st;
        
    }// end getName()
    
    public double getBalance(){
        double b = this.balance;
        return b;
        
    }// end getbalance()
     
      public double getId(){
        int id = this.id;
        return id;
        
    }// end getbalance()
    
    public String getInfo(){
        String info = "Name: " + getName() + " Id: "+ getId() 
                    + " Current balance: "+ getBalance();
           return info;
    }// end getInfor()
    //*** Setters ***
    
     public void setName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
        
    }// end getName()
    
    public void setBalance( double s){
        this.balance = s;
        
    }// end getbalance()
    
    
    //*** Other*******
    
    @Override
    public String toString(){
         String s =  "Name: " + firstName + " "+ lastName + " Id: "+ getId();;
    
         return s;
      
    }// end if 
    
    public void setDebosite (double amt){
        
        double dep = this.balance + amt;
        
    }// end setDeposite (double amt)
    
} // end of public class
