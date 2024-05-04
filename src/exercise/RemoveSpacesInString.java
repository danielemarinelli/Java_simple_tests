package exercise;

import java.util.Scanner;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any sting text: ");
		String userInput = scanner.nextLine();
		
		System.out.println(userInput);
		
		String finalText = userInput.trim();
		System.out.println(finalText);
		scanner.close();

	}

}
