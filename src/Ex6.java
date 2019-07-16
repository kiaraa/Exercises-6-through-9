import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		
		do {
			System.out.println("Hello, World!");
			System.out.println("Would you like to continue (y/n)?");
			if (scan.nextLine().equals("y")){
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
