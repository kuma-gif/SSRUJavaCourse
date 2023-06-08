package components;

public class Card {
    private final int value;
    private final CardFaces face;

    public Card(int value, CardFaces cardFaces) {
        this.value = value;
        this.face = cardFaces;
    }

    public int getValue() {
        return value;
    }

    public CardFaces getFace() {
        return face;
    }
}
