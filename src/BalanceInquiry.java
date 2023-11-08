public class BalanceInquiry extends Transaction{
    String currencyType;
    @Override
    public double execute(Account a) {
        if(currencyType.equals("U")) {
            return a.balance*30;
        }
        else if (currencyType.equals("E")) {
            return a.balance*40;
        }
        return 0;
    }
}

