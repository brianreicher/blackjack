package src;

public class Deck
{
    static Card[] deck = new Card[52];
    boolean shuffle;


    public Deck(boolean shuffle)
    {
        this.shuffle = shuffle;
        int count = 0;
        for(short suit=0; suit<4; suit++)
        {
            for(short card=0; card<13; card++)
            {
                deck[0] = new Card(suit, card);
            }
        }
    }

    public static void printDeck()
    {
        for(int i=0; i<deck.length;i++)
        {
            System.out.println(i+1 + ": " + deck[i].printCard());
        }
        System.out.println("\n");
    }

    public static void main(String[] args)
    {
        printDeck();
    }
}