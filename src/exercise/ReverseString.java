package exercise;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string text: ");
		String original = scanner.nextLine();
		scanner.close();

		StringBuilder sb = new StringBuilder();
		
		for(int i=original.length()-1;i>=0;i--) {
			char c = original.charAt(i);
			sb.append(c);
		}
		
		String reversed = sb.toString();
		System.out.println("Reversed String: "+reversed);
		
	}

}
