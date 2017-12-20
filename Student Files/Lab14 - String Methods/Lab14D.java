//Jonathan Westerfield

import java.util.Scanner;

public class Lab14D
{
	private static String[] threeLetterBlends = { "sch", "scr", "shr", "spl", "spr", "squ", "str", "thr" };
	private static String[] twoLetterBlends =   { "bl", "br", "ch", "cl", "cr", "dr", "dw", "fl",
												  "fr", "gl", "gr", "kl", "ph", "pl", "pr", "qu",
												  "sc", "sh", "sk", "sl", "sn", "sm", "sp", "sq",
												  "st", "sw", "th", "tr", "tw", "wh", "wr"  };
	private String sentence;							
	

	



	/**
	 * Translates the String word into Pig Latin. 
	 * 1. If word starts with a three letter blend then move the blend (the first
	 *    three letters) to the end of the word and add ay.
	 * 2. Otherwise, if the word starts with a two letter blend then move the blend
	 *    (the first two letters) to the end of the word and add ay.
	 * 3. Otherwise, if the word starts with a vowel then add yay.
	 * 4. Otherwise move the first letter of the word to the end of the word and
	 *    add ay.
	 * 5. Return the translated String.
	 **/


	
	
	public static void main(String args[]) 
	{
    	Lab14D lab = new Lab14D();
    	lab.input();
    	lab.output();
    }

	public void input() 
	{
		Scanner kybd = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		sentence = kybd.nextLine().toLowerCase();
	}
	
	/**
	 * Returns true if the String word starts with a three letter blend,
	 * false otherwise. This method is basically a sequential search.
	**/
	private boolean startsWithThreeLetterBlend(String word) 
	{
		
		for(int i = 0; i< threeLetterBlends.length; i++)
		{
			if(word.startsWith(threeLetterBlends[i]))
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns true if the String word starts with a two letter blend,
	 * false otherwise. This method is basically a sequential search.
	**/
	private boolean startsWithTwoLetterBlend(String word) 
	{
		for(int i = 0; i< twoLetterBlends.length; i++)
		{
			if(word.startsWith(twoLetterBlends[i]))
				return true;

		}
		return false;
	}
	
	/**
	 * Returns true if the String word starts with a vowel,
	 * false otherwise.
	**/	
	private boolean startsWithVowel(String word) 
	{
		return("aeiouAeiou".indexOf(word.charAt(0))>-1);
	}

	public String translate(String word) 
	{
		if(startsWithThreeLetterBlend(word))
			return word.substring(3,word.length())+ word.substring(0,3) + "ay";
		else if(startsWithTwoLetterBlend(word))
			return word.substring(2,word.length())+ word.substring(0,2) + "ay";
		else if(startsWithVowel(word))
			return word + "yay";
		else
			return word.substring(1,word.length())+ word.substring(0,1) + "ay";
	}
	
	public void output() {
		System.out.println("The Original Sentence Was:\n" + sentence);
		System.out.println("\n\nTranslated into Pig Latin:");
		Scanner parser = new Scanner(sentence);
		while (parser.hasNext())
			System.out.print(translate(parser.next().toLowerCase()) + " ");
		System.out.println();
	}
	
	
}