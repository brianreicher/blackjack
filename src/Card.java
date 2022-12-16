package src;


public class Card
{
    short rank, suit;
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public Card(short suit, short rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public short getRank()
    {
        return rank;
    }

    public short getSuit()
    {
        return suit;
    }

    public void setRank(short rank)
    {
        this.rank = rank;
    }

    public void setSuit(short suit)
    {
        this.suit = suit;
    }

    public String rankAsString(){
        return ranks[rank];
    }

    public String suitAsString(){
        return suits[suit];
    }

    public String printCard(){
        return rankAsString() + " of " + suitAsString();
    }
}