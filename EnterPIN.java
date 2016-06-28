import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String typedPassword, realPassword;
		
		pin = 12345;
		realPassword = "boop";
		
		
		System.out.println( "WELCOME TO THE BANK OF JAVA." );
		System.out.println( "ENTER YOUR PASSWORD: " );
		typedPassword = keyboard.next();
		
		while ( ! typedPassword.equals("boop") )
		{
			System.out.println( "\nINCORRECT PASSWORD. TRY AGAIN." );
			System.out.print( "ENTER YOUR PASSWORD: " );
			typedPassword = keyboard.next();
		}
		
		System.out.println( "ENTER YOUR PIN: " );
		entry = keyboard.nextInt();
		
		while ( entry != pin )
		{
			System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
			System.out.print( "ENTER YOUR PIN: " );
			entry = keyboard.nextInt();
		}
		
		System.out.println( "\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17" );
	}
}