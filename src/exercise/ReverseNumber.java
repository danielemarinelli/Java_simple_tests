package exercise;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = scanner.nextInt();
		scanner.close();
		
		int r=0;
		while(n!=0) {
			
			int d=n%10;
			r=r*10+d;
			n=n/10;
		}

		System.out.println("Reverse is: "+r);
	}

}
