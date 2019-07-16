import java.util.Scanner;

public class Ex8_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		
		do {
			System.out.println("Please enter a number. ");
			double input1 = scan.nextDouble();
			System.out.println("Please enter another number. ");
			double input2 = scan.nextDouble();
			double product = input1 * input2;
			System.out.println("The product is " + product + ".");
			scan.nextLine();
			
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
