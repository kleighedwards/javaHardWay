import java.util.Scanner;

public class RudeQuestions 
{
	public static void main( String[] args) 
	{
		String name;
		int age, ex;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print( "Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		
		System.out.println( "I lied! I have one more question for you!" );
		System.out.print( "How many boyfriends/girlfriends have you had, " + name + "? " );
		ex = keyboard.nextInt();
		
		System.out.print( "Is that so? " );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		
		// The program runs fine if you input an integer where it is expecting
		// a double. It simply converts the integer into a double value.
		// For example, enterting a value of 110 will display as 110.0.
		
		// The program also runs fine if you input a numeric value where the
		// program is expecting a String as anything can be packaged into a String.
		
		// Entering a non-numeric value where the program is expecting an integer
		// or a double will result in the program "blowing up."
		
		
	}
}