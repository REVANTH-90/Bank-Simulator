import java.util.*;
import java.io.*;

public class Bank {

     public int menu(Scanner sc){
        System.out.println("----------Welcome to OOPS Banking----------");
        System.out.println("Choose your Operation");
        System.out.println("1.) Add an Account");
        System.out.println("2.) Find Your Account");
        System.out.println("3.) WithDraw Amount");
        System.out.println("4.) Display All Accounts");
        System.out.println("5.) Exit Programme");
        System.out.print("Please Enter Your choice : ");
         int choice = sc.nextInt();
         return choice;
    }
    // int[] arr = new int[];

    ArrayList<Account> Bl = new ArrayList<>();

    void addAccount(String option,int Accno,String name,double amount){
        Account account1 =null;
        if(option.equalsIgnoreCase("a")||option.equalsIgnoreCase("Savings account")){
             account1= new SavingsAccount(Accno,name,amount);
             System.out.println("Savings Account Added Successfully");
        }
        else if(option.equalsIgnoreCase("b")||option.equalsIgnoreCase("Current Account")){
            account1=new CurrentAccount(Accno,name,amount);
            System.out.println(" Account Added Successfully");
        }
        else{
            System.out.println("Invalid choice Entered , Enter again");
        }
        Bl.add(account1);
    }

    Account findAccount(int accountno){
        for(Account acc: Bl){
            if(acc.getAccountNumber()==accountno){
                return acc;
            }
        }
        return null;
    }
    void findanddisplayaccount(int accountno){
        Account acc = findAccount(accountno);
        if(acc==null){
            System.out.println("No account available with thi account no!!!");
        }else{
            acc.displayDetails();
        }
    }

    void withdraw(int accountno, double amount){
        Account acc = findAccount(accountno);
        if(acc==null){
            System.out.println("Some kind of error no user found END");
        }
        boolean success= acc.withdraw(amount);
        if(success){
            System.out.println("Withdrawal Successfull");
            acc.displayDetails();
        }else{
            System.out.println("Withdrawal UnSuccessfull");
        }

    }

    void displayallAccounts(){
        for(Account accs:Bl){
            accs.displayDetails();
            System.out.println();
        }
    }
    void exit(){
        System.out.println("Programme Exited");
    }

}
