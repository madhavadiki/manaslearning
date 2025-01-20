public class Mmain {
    public static void main(String[] args){
        BankAccount mySavings = new SavingsAccount("manas", 1000, 2.5);
        BankAccount myChecking = new CheckingAccount("bobby", 2000);
        mySavings.deposit(500);
        myChecking.deposit(500);
        mySavings.displayBalance();
        myChecking.displayBalance();
    }
}
