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
			
			
		}
		
		
	}
	
	
}
