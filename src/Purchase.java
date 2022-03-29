import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		
		System.out.println("===============================================");
		System.out.println("==== Welcome to the SkyLine Renting System ====");
		System.out.println("===============================================");
		System.out.println("What would you like to do?");
		System.out.println("1. See a list of the cars and the prices\n2. "
				+"Purchase a car\n3. Register");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1)
		{
			System.out.println("Here is a list of our cars and their prices:");
			for (int i=0; i<CarList.masini().length; i++)
			{
				System.out.println(i+1+". "+ CarList.masini()[i]+" "+CarList.modele()[i]+" "+CarList.year()[i]+" priced at "+CarList.price()[i]+ " EUR");
			}
		}
		if (choice == 2)
		{
			System.out.println("You need to log in before using our Purchasing System");
			if (Account.isLoggedIn())
			{
				System.out.println("Please choose one of the cars");
				for (int i=0; i<CarList.masini().length; i++)
				{
					System.out.println(i+1+". "+ CarList.masini()[i]+" "+CarList.modele()[i]+" "+CarList.year()[i]+" priced at "+CarList.price()[i]+ " EUR");
				}
				
				int choice2 = scanner.nextInt();
				
				switch(choice2)
				{
				case 1: System.out.println("You have now successfully purchased " + CarList.masini()[0]+ " "+CarList.modele()[0]+ " "+CarList.year()[0]+" priced at " +CarList.price()[0]+ " EUR");
				break;
				
				case 2: System.out.println("You have now successfully purchased " + CarList.masini()[1]+ " "+CarList.modele()[1]+ " "+CarList.year()[1]+" priced at " +CarList.price()[1]+ " EUR");
				break;
				
				case 3: System.out.println("You have now successfully purchased " + CarList.masini()[2]+ " "+CarList.modele()[2]+ " "+CarList.year()[2]+" priced at " +CarList.price()[2]+ " EUR");
				break;
				
				case 4: System.out.println("You have now successfully purchased " + CarList.masini()[3]+ " "+CarList.modele()[3]+ " "+CarList.year()[3]+" priced at " +CarList.price()[3]+ " EUR");
				break;
				
				case 5: System.out.println("You have now successfully purchased " + CarList.masini()[4]+ " "+CarList.modele()[4]+ " "+CarList.year()[4]+" priced at " +CarList.price()[4]+ " EUR");
				break;
				
				case 6: System.out.println("You have now successfully purchased " + CarList.masini()[5]+ " "+CarList.modele()[5]+ " "+CarList.year()[5]+" priced at " +CarList.price()[5]+ " EUR");
				break;
				}
			}
			
		}
		if (choice == 3)
		{
			Account.registerAccount();
			Account.isLoggedIn();
		}

	}

}
