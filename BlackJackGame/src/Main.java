import components.Dealer;
import components.Player;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Dealer dealer = new Dealer();
            Player player1 = new Player();

            for (int i = 0; i < 2; i++) {
                dealer.dealCard();
                dealer.passCardTo(player1);
            }

            boolean isWantsCard = dealer.wantsCard(player1);
            while (isWantsCard) {
                if (isWantsCard) {
                    dealer.dealCard();
                    dealer.passCardTo(player1);
                }
                isWantsCard = dealer.wantsCard(player1);
            }

            dealer.showHand(player1);
        }
    }