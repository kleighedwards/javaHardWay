import java.util.Scanner;

public class WeaselOrNot 
{
	public static void main( String[] args ) 
	{
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;
		
		System.out.println( "Type the word \"weasel\", please." );
		word = keyboard.next();
		
		yep = word.equals("weasel");
		nope = ! word.equals("weasel");
		
		System.out.println( "You typed what was requested: " + yep );
		System.out.println( "You ignored polite instructions: " + nope );
		
		// Altering line 14 to read: yep = "weasel".equals(word);
		// does not result in an error. Everything runs fine with this change.
	}
}