public class Account {
    private long accountNo;
    private double balance;
    private String acctType;
    private double interestRate;
    public Account(long accountNo, double balance, String acctType, double interestrate) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.acctType = acctType;
        this.interestRate = interestrate/100;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful: $" + amount);
    }

    public boolean withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

    public void applyMonthlyInterest() {
        double monthlyInterest = balance * interestRate /12;
        balance += monthlyInterest;
        System.out.println("Monthly interest applied: $" + monthlyInterest);
    }
    
    public double getBalance() {
        return balance;
    }
    public void setbalance(double amount) {
        balance = amount;

    }


    

    public void printAccountInfo() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Type: " + acctType);
        System.out.println("Balance: $" + balance);
    }


}
