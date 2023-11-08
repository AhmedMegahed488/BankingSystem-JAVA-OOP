public class Withdraw extends Transaction implements Rollback{
    double amount;

    @Override
    public double execute(Account a) {
        a.balance=a.balance-amount;
        return a.balance;
    }

    @Override
    public double cancelTransaction(Account a) {
        a.balance=a.balance+amount;
        return a.balance;
    }
}
