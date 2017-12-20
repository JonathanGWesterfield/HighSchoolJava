import java.util.Scanner;

/**
 * Assume that we have a deck of cards. The cards are numbered from 0 to 51. The first
 * 13 cards are the Ace -> King of Clubs, the next 13 are the Ace -> King of Hearts, then
 * diamonds and finally spades. To determine the rank of a card, given its number value, we
 * simply modulus divide by 13 and add one. Thus numbers 0, 13, 26, and 39 are the four Aces,
 * 1, 14, 27, and 40 are the twos, etc. This program will output the rank of any card whose
 * value is entered from the keyboard.
 **/
public class ErrorProneEllie
{
	private int cardValue;

	public static void main(String[] args) {
    	ErrorProneEllie ellie = new ErrorProneEllie();
    	ellie.input();
    	ellie.output();
    }

    public void input() 
    {
    	Scanner kybd = new Scanner(System.in);
    	System.out.println("Enter the card's value (1 - 52): ");
    	cardValue = kybd.nextInt();
    }

    /**
     * This method calculates the rank of any card by modulus divinding the value of the
     * card by 24.
     * @param value an integer representing the value of the card.
     * @return an integer value representing the rank of the card.
     **/
    public static int calculaterank(int value) {
    	return value % 13 + 1;
    }

    public void output() {
    	System.out.println("Card " + cardValue + " has a rank of " + calculaterank(cardValue));
    }
}