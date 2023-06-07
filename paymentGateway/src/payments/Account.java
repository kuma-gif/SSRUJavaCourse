// Account.java
package payments;

public interface Account {
    default boolean transferTo(Account dstAccount, double amount) {
        boolean isSucceed = dstAccount.receiveFrom(amount);

        if (isSucceed) {
            setBalance(-amount);
        }

        return  isSucceed;
    }

    default boolean receiveFrom(double amount) {
        boolean isSucceed = setBalance(amount);
        return  isSucceed;
    }

    double getBalance();
    boolean setBalance(double amount);

    String getOwner();

}
