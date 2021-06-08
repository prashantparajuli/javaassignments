/*
Define a class to represent a bank account. Include the following members:
i. Data members:
    a.Name of account holder
    b.Account number
    c.Account type
    d.Balance amount
ii. Member functions:
    a.To assign initial values from user
    b.To deposit an amount
    c.To withdraw an amount
    d.To display name and balance

*/

import java.util.*;
public class Main{
    
    public static void main(String[] args) {
        char ch;
        Bank_trans bt = new Bank_trans();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("***** Choose the operation:(a-d)✅ *****");
            System.out.println("a.Initialize an account");
            System.out.println("b.Deposit amount");
            System.out.println("c.Withdraw balance");
            System.out.println("d.View Details");
            System.out.println("e.EXIT");
            ch = sc.next().charAt(0);
            System.out.println("\n\n\n");
            if (ch=='a'){
                bt.initializeAccount();
            }
            else if (ch=='b'){
                bt.depositAmt();
            }
            else if(ch=='c'){
                bt.withdrawAmt();
            }
            else if(ch == 'd'){
                bt.displayAc();
            }
        }
        while(ch !='e');
    
        
        sc.close();
    }
   

}
public class Bank_trans {
    private String name, acc_type, acc_no;
    private long blc, tot_blc;
    Scanner sc = new Scanner(System.in);
    void initializeAccount() {
        System.out.println("Enter the name:");
        name = sc.next();
        System.out.println("Enter account number:");
        acc_no = sc.next();
        System.out.println("Enter the initial amount to deposit:");
        blc = sc.nextLong();
        tot_blc = blc;
        System.out.println("\n\n\n");
        
    }
    void depositAmt(){
        System.out.println("Enter the amount to deposit, "+name+"::");
        blc = sc.nextLong();
        tot_blc = tot_blc+blc;
        System.out.println("\n\n\n");
    }
    void withdrawAmt(){
        System.out.println("How much do you want to withdraw, "+name +"??");
        blc =sc.nextLong();
        tot_blc = tot_blc - blc;
        System.out.println("\n\n\n");
    }
    void displayAc(){
        System.out.println("************** Acoount Details📖 **************");
        System.out.println("Account Number: "+acc_no);
        System.out.println("Name: "+name);
        System.out.println("Total balance: "+tot_blc);
        System.out.println("\n\n\n");
        
    }
}