public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountholder, double balance){
        super(accountholder, balance);
    }
    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        //setBalance(newBalance);
        System.out.println("Deposited: " + amount + ". New Balance: " + newBalance);
    }
    
}
