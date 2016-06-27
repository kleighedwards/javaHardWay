import java.util.Scanner;

public class Sequencing 
{
	public static void main( String[] args ) 
	{
		// THIS CODE IS BROKEN UNTIL YOU FIX IT
		
		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;
		
		System.out.print( "How much is the purchase price? " );
		price = keyboard.nextDouble();
		salesTax = price * 0.0825;
		total = price + salesTax;
		
		System.out.println( "Item price:\t" + price );
		System.out.println( "Sales tax:\t" + salesTax );
		System.out.println( "Total cost:\t" + total );
		
		// An error occurs when trying to compile after removing the defined 
		// value for "price" on line 10. It cannot compute a value for salesTax
		// as there is no stored value for price at this point.
		
		// Moving the two lines of code that give values for "salesTax" and 
		// the "total" after a value for "price" has been stated 
		// allows the program to run as expected.
		
		// Removing the "= 0" after price on line 10, at this point, does not
		// cause any errors. 
	}
}