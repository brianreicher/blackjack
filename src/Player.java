package src;


public class Player {
    String name;
    Card[] playerCards = new Card[2];
    Deck d = new Deck(true);

    public Player(String name){
        this.name = name;
        dealPlayer();
    }

    public void dealPlayer(){
        this.playerCards[0] = d.deck[0];
        this.playerCards[1] = d.deck[1];
    }

    public void showCards(){
        for(Card i: this.playerCards){
            System.out.println(i.printCard());
        }
    }

    public static void main(String[] args){
        Player p = new Player("Brian");
        System.out.println("Player Details");
        p.showCards();
    }
}