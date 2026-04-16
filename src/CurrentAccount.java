class CurrentAccount extends Account{
    private static final double Overdraft_Limit=3000;
    public CurrentAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }
    boolean withdraw(double amount){
        if(amount<=getBalance()+Overdraft_Limit){
            deposit(-amount);
            return true;
        }
        return false;
    }
    void displayDetails(){
        System.out.println("CURRENT ACCOUNT");
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Holder Name: "+getHolderName());
        System.out.println("Balance : "+getBalance());
    }
}
