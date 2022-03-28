import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		
		System.out.println("===============================================");
		System.out.println("==== Welcome to the SkyLine Renting System ====");
		System.out.println("===============================================");
		System.out.println("What would you like to do?");
		System.out.println("1. See a list of the cars and the prices\n2. "
				+"Purchase a car");
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
			System.out.println("What is your salary per year?");
			int salary = scanner.nextInt();
			String result = (salary < 3500) ? "I am sorry, but your salary is too low for this car" : (salary == 3500) ? "You can barely purchase this car"
					: "Ok, you can purchase it";
			System.out.println(result);
		}

	}

}
