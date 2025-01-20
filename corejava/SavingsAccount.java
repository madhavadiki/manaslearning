public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate){
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }
    public void deposit(double amount) {
        double newBalance = getBalance() + amount + (amount * interestRate / 100);
        //setBalance(newBalance);
        System.out.println("Deposited: " + amount + ". New Balance: " + newBalance);
    }
    
}
