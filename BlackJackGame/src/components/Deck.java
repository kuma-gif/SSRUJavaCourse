package components;

// Singleton Design Pattern
public final class Deck {

    private static volatile Deck instance;
    private int numCards;

    private Deck() {
        this.numCards = 52;
    }

    public static Deck getInstance() {
        Deck result = instance;
        if (result != null) {
            return result;
        }

        synchronized (Deck.class) {
            if (instance == null) {
                instance = new Deck();
            }

            return instance;
        }
    }

    public Card getCard() {

        return new Card(10, CardFaces.Hearts);
    }
}
