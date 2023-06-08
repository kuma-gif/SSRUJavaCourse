package components;

import java.util.ArrayList;
import java.util.Random;

public class Player {

    private ArrayList<Card> cardsOnHand;

    public Player() {
        cardsOnHand = new ArrayList<>();
    }

    public void addCard(Card card) {
        cardsOnHand.add(card);
    }

    public boolean askWantCard() {
        Random random = new Random();
        int rand = random.nextInt(10 - 1) + 1;
        return rand < 5;
    }
}
