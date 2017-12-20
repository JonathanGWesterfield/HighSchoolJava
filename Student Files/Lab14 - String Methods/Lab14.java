import java.util.Scanner;

public class Lab14
{
	private String sentence;
	private String searchWord;
	private String insertWord;
	private int count;
	
	public static void main(String[ ] args) {
		Lab14 lab = new Lab14( );
		lab.input();	// Read data from the keyboard
		lab.process();	// Rebuild the sentence
		lab.output( );	// Display output
	}
	
	public void input() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		sentence = reader.nextLine();
		System.out.print("Enter an expression to search for: ");
		searchWord = reader.nextLine();
		System.out.print("Enter an expression to insert: ");
		insertWord = reader.nextLine();
	}
		
	public void process()
	{
		int index = sentence.indexOf(searchWord);
		while(index!=-1)
		{
			sentence = sentence.substring(0,index)+insertWord + " "
				+ sentence.substring(index);
			count++;
			index = sentence.indexOf(searchWord, index + searchWord.length()
				+ insertWord.length());
		}
	}

	public void output() {
		System.out.println(sentence);
		System.out.println(insertWord + " was inserted before " + searchWord + " " + count + " times.");
	}
}
