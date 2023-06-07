// PromptpayAccount.java
package payments;

public class PromptpayAccount implements Account {
    private final String ownerName;
    private String mobileNumber;
    private double balance;
    private double oldBalance;

    public PromptpayAccount(String ownerName, String mobileNumber, double balance) {

        this.ownerName = ownerName;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
        this.oldBalance = this.balance;
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
