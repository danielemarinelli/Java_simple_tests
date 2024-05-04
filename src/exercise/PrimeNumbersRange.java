package exercise;

import java.util.Scanner;

public class PrimeNumbersRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}
	
	public static boolean isPrimeNumber(int n) {
		
		if(n<=1) {
			return false;
		}else {
			int count=0;
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
					count++;
				}
			}
			
			if(count>2) {
				return false;
			}
		}
		
		
		
		return true;
	}
	
	

}
