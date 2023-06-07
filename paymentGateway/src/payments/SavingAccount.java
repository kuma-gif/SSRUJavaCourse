package payments;

public class SavingAccount implements Account {

    private final String ownerName;
    private final String accountNo;
    private double balance;
    private double oldBalance;

    public SavingAccount(String ownerName, String accountNo, double balance) {
        this.ownerName = ownerName;
        this.accountNo = accountNo;
        this.balance = balance;
        this.oldBalance = this.balance;
    }

    // Come back at 10.45

    @Override
    public boolean transferTo(Account dstAccount, double amount) {
        boolean isSucceed = dstAccount.receiveFrom(amount);

        if (isSucceed) {
            this.balance -= amount;
        }

        return  isSucceed;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public boolean setBalance(double amount) {
        this.oldBalance = this.balance;
        this.balance = this.balance + amount;

        boolean isChanged = this.oldBalance != this.balance;

        return isChanged;
    }

    @Override
    public String getOwner() {
        return this.ownerName;
    }
}
