package mid_2.collection.compare.test;

public class Card implements Comparable<Card>{

    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            return this.suit.compareTo(anotherCard.suit);
        }
    }

    @Override
    public String toString() {
        //2(♠)
        return rank + "(" + suit.getIcon() + ")";

    }

    public int getRank() {
        return rank;
    }
}
