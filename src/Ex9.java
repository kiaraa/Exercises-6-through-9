import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		
		do {
			System.out.println("Please enter a language: ");
			String language = scan.nextLine();
			
			switch(language) {
			
			case "English":
				System.out.println("Hello World!");
				break;
			
			case "Spanish":
				System.out.println("Hola Mundo!");
				break;
				
			case "Dutch":
				System.out.println("Hallo Wereld!");
				break;
				
			case "Chinese":
				System.out.println("你好，世界");
				break;
				
			case "Japanese":
				System.out.println("こんにちは世界");
				break;
				
			case "Arabic": 
					System.out.println("مرحبا بالعالم!");
					break;
			
			default: 
				System.out.println("Sorry, I don't know that one.");
			}
			
			System.out.println("Would you like to keep going? (y/n) ");
			if (scan.nextLine().contentEquals("y")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
		}
		while (keepGoing);
		
		System.out.println("وداعا!");
		
		scan.close();
	}
}
