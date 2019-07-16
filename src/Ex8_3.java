import java.util.Scanner;

public class Ex8_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		
		do {
			System.out.println("Please enter a number. ");
			double input1 = scan.nextDouble();
			
			System.out.println("Please enter another number. ");
			double input2 = scan.nextDouble();
			
			boolean input1IsInt;
			boolean input2IsInt;
			double sum = input1 + input2;
			
			if (input1 % 1 == 0) {
				input1IsInt = true;
			}
			else {
				input1IsInt = false;
			}
			
			if (input2 % 1 == 0) {
				input2IsInt = true;
			}
			else {
				input2IsInt = false;
			}
			
			if (input1IsInt && input2IsInt) {
				String formattedSum = String.format("%.0f", sum);
				System.out.println("The sum is " + formattedSum + ".");
			}
			else {
				String formattedSum = String.format("%.2f", sum);
				System.out.println("The sum is " + formattedSum + ".");
			}
			
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
