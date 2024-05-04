package exercise;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int original = scanner.nextInt();
		scanner.close();
		
		int orig = original;
		int reversed = 0;
		
		while(orig!=0) {
			
			int d = orig%10;
			reversed = reversed*10+d;
			orig=orig/10;	
		}
		
		if(original==reversed) {
			System.out.println("Number is a palindrome!");
		}else {
			System.out.println("Number is not a palindrome!");
		}
		
	}

}
