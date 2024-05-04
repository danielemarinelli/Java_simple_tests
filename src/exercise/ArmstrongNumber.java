package exercise;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = scanner.nextInt();
		
		if(isArmstrong(n)) {
			System.out.println("Armstrong number!");
		}else {
			System.out.println("Not an Armstrong number!");
		}
		
		scanner.close();

	}
	
	public static boolean isArmstrong(int n) {
		int originalNumber=n;
		int d=0;
		
		while(originalNumber!=0) {  //find the total digits
			d++;
			originalNumber=originalNumber/10;
		}
		
		int resultNumber=0;
		int on=n;
		int r;
		
		while(on!=0) {
			r=on%10;
			resultNumber=(int) (resultNumber + Math.pow(r, d));
			on=on/10;
		}
		
		if(n==resultNumber) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
