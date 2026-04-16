class SavingsAccount extends Account{
    private static final double Min_Balance=500;
    public SavingsAccount(int number,String holdN, double bal){
        super(number,holdN,bal);
    }
    boolean withdraw(double amount){
        if(getBalance()-amount>=Min_Balance){
            deposit(-amount);
            return true;
        }
        return false;
    }
    public void applyInterest(){
        double interest = getBalance()*0.05;
        deposit(interest);
    }
    void displayDetails(){
        System.out.println("SAVINGS ACCOUNT");
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Holder Name: "+getHolderName());
        System.out.println("Balance : "+getBalance());
    }
}