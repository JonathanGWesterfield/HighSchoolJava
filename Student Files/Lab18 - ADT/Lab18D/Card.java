//Jonathan Westerfield

import java.awt.Image;
import java.awt.Graphics;

public class Card
{
	private static final String[] theSuits = {"Clubes" , "Diamonds" , "Hearts" , "Spades"};
	private static final String[] theRank = {"Ace" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "Queen" , "King"};
    private Image image;
    private int rank;
    private int suit;
    private static final byte Clubs = 0;
    private static final byte Diamonds = 1;
    private static final byte Hearts = 2;
    private static final byte Height = 107;
    private static final byte Spades = 3;
    private static final byte Width = 71;
    private int card;
    
    public Card(){}
    
    public Card(Image image, int rank, int suit)
    {
        this.image = image;
        this.rank = rank;
        this.suit = suit;
    }
    public int getRank(){
        return rank;
    }
    public int getSuit(){
        return suit;
    }
    public void drawCard(Graphics g, int x, int y)
    {
        g.drawImage(image, x, y, null);
    }
    @Override
    public String toString(){
        return theRank[rank - 1] + " of " + theSuits[suit];
    }
}
