package js0420.test3;

public class Account {
    private long balace;

    public Account() { }

    public long getBalance() {
        return balace;
    }
    public void deposit(int money) {
        balace += money;
    }
    public void withdraw(int money) throws BalanceInsufficientException {
        if(balace < money) {
            throw new BalanceInsufficientException("잔고부족 : " + (money-balace) + " 모자람");
        }
        balace -= money;
    }
}
