import java.util.Scanner;

public class ComparingNumbers
{
	public static void main( String[] args ) 
	{
		Scanner keyboard = new Scanner(System.in);
		double first, second;
		
		System.out.print( "Give me two numbers. First: " );
		first = keyboard.nextDouble();
		System.out.print( "Second: " );
		second = keyboard.nextDouble();
		
		if ( first < second )
		
			System.out.println( first + " is LESS THAN " + second );
		
		if ( first <= second )
		
			System.out.println( first + " is LESS THAN/EQUAL TO " + second );
		
		if ( first == second )
		
			System.out.println( first + " is EQUAL TO " + second );
		
		if ( first >= second )
		
			System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
		
		if ( first > second )
		
			System.out.println( first + " is GREATER THAN " + second );
		
		if ( first != second )
		{
			System.out.println( first + " is NOT EQUAL TO " + second );
			System.out.println( "Hey." );
		}
		
		// Adding an additional line of code to print "Hey." after the final
		// if statement will print whether or not that particular if statement
		// is true if it is not encased in curly braces.
		
		// Including that print "Hey." command in the same curly braces as the final
		// if statement, however, links the two together.
	}
}