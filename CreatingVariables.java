public class CreatingVariables 
{
	public static void main( String[] args ) 
	{
		int x, y, age, year;
		double seconds, e, checking, pi;
		String firstName, lastName, title, hs, college;
		
		x = 10;
		y = 400;
		age = 39;
		year = 2016;
		
		seconds = 4.71;
		e = 2.7182818284590452356;
		checking = 1.89;
		pi = 3.14;
		
		firstName = "Kristen";
		lastName = "Edwards";
		title = "Ms.";
		hs = "Regis Jesuit";
		college = "CU Boulder";
		
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + " " + lastName );
		System.out.println( "This years is: " + year );
		System.out.println( "The variable pi contains " + pi );
		System.out.println( "The highschool I attended: " + hs );
		System.out.println( "The university I attended: " + college );
	}
}