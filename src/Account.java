import java.util.Scanner;

public class Account {
	

	static boolean isLoggedIn()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your username");
		String username = scanner.nextLine();
		System.out.println("Please enter your password");
		String password = scanner.nextLine();
		
		while (!username.equals(Account.checkAccount()[0]) && !password.equals(Account.checkAccount()[1]))
		{
			System.out.println("Wrong ID and password, try again");
			username = scanner.nextLine();
			System.out.println("Now, please enter your password again");
			password = scanner.nextLine();
		}

		if (username.equals(Account.checkAccount()[0]) && password.equals(Account.checkAccount()[1]))
		{
			System.out.println("Successfully logged in !");
		}
		
		return true;
		
	}
	
	static String[] checkAccount()
	{
		String[] account = {"alexmohor", "parolamea"};
		return account;
	}
	
	static void registerAccount()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose a username");
		String myUserName = scanner.nextLine();
		System.out.println("Please choose a password");
		String password = scanner.nextLine();
		System.out.println("Account successfully registered");		
		
	}
}
