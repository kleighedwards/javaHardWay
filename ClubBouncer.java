public class ClubBouncer
{
	public static void main( String[] args )
	{
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";
		
		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) )
		{
			System.out.println( "You are allowed to enter the club.");
		}
		else
		{
			System.out.println( "You are not allowed to enter the club." );
		}
		
		// Adding an additional line of code between the if and the else
		// statement will cause an error when compiling. The else statement
		// is only valid if directly attached to an if statement.
	}
}