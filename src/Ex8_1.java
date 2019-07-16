import java.util.Scanner;

public class Ex8_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		
		do {
			System.out.println("Please enter a number: ");
			double input = scan.nextDouble();
			scan.nextLine();
			double result = input + 1;
			
			if (result % 1 == 0) {
				String formattedResult = String.format("%.0f", result);
				System.out.println("That number plus one is " + formattedResult + ".");
			}
			else {
				String formattedResult = Double.toString(result);
				System.out.println("That number plus one is " + formattedResult + ".");
			}
			System.out.println("Would you like to keep going? (y/n) ");
			if (scan.nextLine().equals("y")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
			
		}	
		while (keepGoing == true);
			
		
		
		
		
		scan.close();
		}
}

