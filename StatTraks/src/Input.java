import java.util.Scanner;
public class Input {
	public static Scanner sc = new Scanner(System.in);
	
	public static String getLine(String prompt) {
		
		System.out.print(prompt);
		return sc.nextLine();	
	}
	
	public static int getInt(String prompt) {
		int userInput = 0;
		
		System.out.print(prompt);
		
		while(true) {
			if (sc.hasNextInt())
				break;
			
			System.out.printf("Invalid input! Please enter a number: ");
			sc.next();
			
			}
		userInput = sc.nextInt();
		sc.nextLine();
		
		return userInput;
		
	}
	
	public static int getIntRange(String prompt, int low, int high) {
		int userInput;
	
		System.out.print(prompt);
	
	while (true) {
		if (sc.hasNextInt()) {
			userInput = sc.nextInt();
			
			if (userInput >= low && userInput <= high) {
				break;
			}
			} else {
				sc.next();
			}
			System.out.printf("Invalid input! Please enter a number between (%d - %d); " , low, high);	
			}
		sc.nextLine();
		return userInput;
	}
	}
	
	

