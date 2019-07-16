import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		System.out.println("It's the echo machine! It just echoes back what you tell it.");
		
		do {
			String input = scan.nextLine();
			System.out.println(input);
			System.out.println("Would you like to continue? (y/n)");
			if (scan.nextLine().equals("y")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
		}
		while (keepGoing);
		
		System.out.println("Goodbye!");
		scan.close();
	}
}
