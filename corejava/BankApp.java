public class BankApp {
    public static void main(String[] args){
        Account a1 = new Account(25725460, 300000., "savings", 3.0);
        Account a2 = new Account(25725460, 40000., "current", 4.0);
        a1.printAccountInfo();
        a1.deposit(10000.);
        a1.printAccountInfo();
        a1.withdraw(20000.);
        a1.printAccountInfo();
        a1.withdraw(300000.);
        a1.applyMonthlyInterest();
        a1.printAccountInfo();


    }
}
