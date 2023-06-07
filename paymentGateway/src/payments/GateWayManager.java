package payments;

public class GateWayManager {

    public static void transfer(Account srcAccount, Account dstAccount, double amount, PaymentMethods paymentMethods) {
        boolean isSucceed = srcAccount.transferTo(dstAccount, amount);

        if (isSucceed) {
            System.out.printf("Successfully transfer, from %s to %s\n", srcAccount.getOwner(), dstAccount.getOwner());
        } else {
            System.out.println("Unsuccessful transfer, something went wrong!");
        }

    }
}
