public class Account {
    int accountNumber;
    String ownerName;
    double balance;
    int transactionId;
    public Account(int accountID,String name,double balance)
    {
        this.accountNumber=accountID;
        this.ownerName=name;
        this.balance=balance;
    }
}
