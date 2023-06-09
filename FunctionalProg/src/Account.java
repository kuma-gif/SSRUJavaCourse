interface  AccountFunctional {
    public double getNetBalance(int balance);
}

public class Account {

    public AccountFunctional getNetBalance(int balance) {
        return (_balance) -> _balance * 1.03;
    }
}
