package exercise;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows for Floyd's triangle: ");
		int rows = scanner.nextInt();
		scanner.close();
		
		int n=1;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(n+" ");
				n++;
				
			}
			
			System.out.println();
			
		}

	}

}
