package exercise;

import java.util.Scanner;

public class FindAllSubStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string text: ");
		String inputStringText = scanner.nextLine();
		generateSubString(inputStringText);
		
		scanner.close();

	}
	
	public static void generateSubString(String InputString) {
		
		int size = InputString.length();
		
			for(int b=0;b<size;b++) {
				
				for(int e=b+1;e<=size;e++) {
					String subString = InputString.substring(b, e);
					System.out.println(subString);
				}
				
			}
		
		
	}

}
