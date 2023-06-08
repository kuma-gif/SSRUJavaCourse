package components;

public class Dealer {

    private Card cardToPass;
    public void dealCard() {
         this.cardToPass = Deck.getInstance().getCard();
    }

    public void passCardTo(Player player) {
        if (this.cardToPass == null) {
            System.out.println("Dealer didn't get a card from a deck");
            return;
        }

        player.addCard(cardToPass);
        System.out.println("The player got a card");
    }

    public boolean wantsCard(Player player) {
        return player.askWantCard();
    }
}
