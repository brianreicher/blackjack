package src;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Deck
{
    static Card[] deck = new Card[52];

    public Deck(boolean shuffle)
    {

        // build deck of cards
        int index = 0;
        for(short suit=0; suit<4; suit++)
        {
            for(short c=0; c<13; c++)
            {
                deck[index] = new Card(suit, c);
                index++;
            }
        }

        // shuffle deck if desired
        if(shuffle){
            shuffleDeck();
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

    public void shuffleDeck(){
        List<Card> deckList = Arrays.asList(deck);

        // shuffle as a list
        Collections.shuffle(deckList);

        deck = deckList.toArray(deck);
    }

    public static void main(String[] args)
    {
        Deck d = new Deck(true);
        System.out.println("Deck");
        printDeck();
    }
}