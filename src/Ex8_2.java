import java.util.Scanner;

public class Ex8_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		
		do {
			System.out.println("Please enter a number.");
			double input = scan.nextDouble();
			System.out.println("That number plus 0.5 is " + (input + 0.5) + ".");
			
			System.out.println("Would you like to keep going? (y/n) ");
			if (scan.nextLine().equals("y")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
		}
		while (keepGoing);
		
		scan.close();
	}
}
