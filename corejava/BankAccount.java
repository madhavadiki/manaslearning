public abstract class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public abstract void deposit(double amount);

    protected void displayBalance(){
        System.out.println("account Holder = " + accountHolder);
        System.out.println("Current Balance = " + balance);

    }

    protected double getBalance(){
        return balance;
    }
    protected void setbalance(double balance){
        this.balance = balance;
    }
}
