import payments.GateWayManager;
import payments.PaymentMethods;
import payments.PromptpayAccount;
import payments.SavingAccount;

public class Main {
    public static void main(String[] args) {
        PromptpayAccount ada = new PromptpayAccount("Ada D. Monkey", "0912345843", 5000);
        SavingAccount peter = new SavingAccount("Peter B. Parker", "083-123-3845", 100);

        GateWayManager.transfer(ada, peter, 2500, PaymentMethods.Promptpay);
    }
}