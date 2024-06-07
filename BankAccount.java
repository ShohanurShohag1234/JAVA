import java.util.Scanner;
public class BankAccount {
    
    

    String AccountNumber;
    double Balance;
           
   public BankAccount(String AccountNumber,double Balance)
   {
       this.AccountNumber=AccountNumber;
       this.Balance=Balance;
   }
   
    public void deposit(double amount)
   {
      if(amount>0)
      {
          Balance=Balance+amount;
          System.out.println("Deposit "+amount+" in Account Number "+AccountNumber+" And Total Balance is "+Balance);
      }
      else{
          System.out.println("Not Sufficient Amount");
      }
   }
    
     
    public  void withdraw(double amount)
   {
      
       
       if(amount<=Balance && amount>0)
       {
           Balance=Balance-amount;
           System.out.println("withdraw "+amount+" from Account Number "+AccountNumber+" And Total Balance is "+Balance);
           
       }
   }
   
   
   
   
   
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Ener Account Number:");
       String AccountNumber;
      AccountNumber=input.nextLine();
      System.out.println("Ener Balance:");
      double Balance;
     Balance=input.nextDouble();
     
     BankAccount customer1=new BankAccount(AccountNumber,Balance);
     customer1.deposit(1000.0);
     customer1.deposit(5000.0);
     customer1.withdraw(500);
     
        
    }
    
}
