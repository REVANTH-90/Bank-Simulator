import java.util.Scanner;

abstract class Account{
    private int accountNumber;
    private String holderName;
    private double balance;
    Account(int accountNumber, String holderName, double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    int getAccountNumber(){
        return accountNumber;
    }
    String getHolderName(){
        return holderName;
    }
    double getBalance(){
        return balance;
    }
    void deposit(double amount){
         balance= amount +balance;
    }
    abstract boolean withdraw(double amountr);

    abstract void displayDetails();
}

public class Main{
    public static  void main(String[] args){
//        Session 9
//        CurrentAccount ca = new CurrentAccount(69,"Revanth",420);
//        SavingsAccount sa = new SavingsAccount(96,"Naughty",90);
//        ca.displayDetails();
//        sa.displayDetails();

//        Session 10
//        Account[] acc = new Account[2];
//        acc[0]=new SavingsAccount(96,"Naughty",90);
//        acc[1]=new CurrentAccount(69,"Revanth",420);
//        for(Account loop:acc){
//            loop.displayDetails();
//            System.out.println("Withdraw 2500");
//
//            boolean success = loop.withdraw(2500);
//            System.out.println("WithDraw Success: "+ success);
//
//            loop.displayDetails();
//            System.out.println();
//        }
        //Session 11
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        while(true){
          int   choice= b.menu(sc);
          switch (choice){

              case 1: System.out.println("Please Enter the Account Type:\n" +
                      "A.)SAVINGS ACCOUNT\n" +
                      "B.)CURRENT ACCOUNT");
                      System.out.print("Enter the option: ");
                      String option = sc.next();
                      System.out.print("Enter the Account Number: ");
                      int takeno=sc.nextInt();
                      sc.nextLine();
                      System.out.print("Enter the Account Holder Name: ");
                      String name=sc.nextLine();
                      System.out.print("Enter the Account Balance: ");
                      double amount=sc.nextDouble();
                      b.addAccount(option,takeno,name,amount);
                      break;
              case 2: System.out.print("Enter the Acc No to find: ");
                      int findno=sc.nextInt();
                      b.findanddisplayaccount(findno);
                      break;
              case 3: System.out.print("Enter the Account Number: ");
                       int Wdno=sc.nextInt();
                      System.out.print("Enter Amount to withdraw: ");
                      double WdAm=sc.nextDouble();
                      b.withdraw(Wdno,WdAm);
                      break;
              case 4:b.displayallAccounts();break;
              case 5:b.exit(); return;
              default:if(choice>5)System.out.println("Invalid Operation Choose RE-ENTER");

          }

        }


    }
}