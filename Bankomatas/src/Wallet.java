public class Wallet {
    private Card[] cards = new Card[5];
    private int count = 0;

    public Wallet() {}

    public void addCard(Card card) {
        cards[count] = card;
        count++;
    }

    public void removeCardByIndex(int index) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Netinkamas korteles numeris!");
        }
        count--;

        for (int i = index; i < count; i++) {
            cards[i] = cards[i + 1];
        }
        cards[count] = null;
    }

    public Card getCardByIndex(int index) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Netinkamas korteles numeris!");
        }
        return cards[index];
    }

    public Card[] getAllcards() {
        return cards;
    }
}
