import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Naga Assefa
 *  Class:          CS30S
 * 
 *  Assignment:      A3.0
 * 
 *  Description:   The driver for the bank accounts
 * 
 *************************************************************/

public class Bank_account_Driver {

public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    
    
    // ***** print banners *****
    
        ProgramInfo PI = new ProgramInfo ("A3.0");
        System.out.println(PI.getBanner());
    // ***** Get Input *****
    // ***** Main Processing *****
     // BankAccount
      
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Chuck", "Norris", 30000);
        System.out.println(b1.getName());
        System.out.println(b2);
        
        // example of setting a deposite
        System.out.println( "**********************");
            System.out.println("example of setting a deposite");
            b2.setDebosite(1000);
            System.out.println(b2.getBalance()+nl); 
           
     //Checking
        
        Checking ch = new Checking("leia", "Organa", 10000);
        System.out.println(ch.getInfo());
        //Example of withdrawl
        System.out.println( "**********************");
            System.out.println("example of Cheque");
            System.out.println(ch.getCashCheque(10001) +nl);       
    
     //Savings 
        Saving Sv = new Saving("Green", "duck", 1000);
        System.out.println(Sv.getInfo()+nl);
        
        //Example of withdrawl
        System.out.println( "**********************");
            System.out.println("example of Withdrawl");
            System.out.println(Sv.getWithdraw(1001)+nl);
        // Example of increasing savings 
        System.out.println( "**********************");
            System.out.println("Intrest");
            System.out.println(Sv.getAppliedInterest()+nl);
     //Array list     
        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(ch);
        list.add(Sv);
        list.add(new Checking("Han", "Solo", 89000));
        
        System.out.println("******************");
        for(BankAccount b: list){
            System.out.println(b);
        }// end inhanced for loop
        System.out.println("******************");
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
 } // end main 
} // end FormatTemplate
