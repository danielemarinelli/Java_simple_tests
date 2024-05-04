package exercise;

public class AddTwoMatrix {

	public static void main(String[] args) {
		
		int[][] ar1 = {{6,7,2,1},{4,0,9,3},{7,0,3,1}};
		int[][] ar2 = {{1,9,2,1},{7,7,0,9},{4,0,5,1}};
		
		System.out.println("First Matrix: ");
		
		/*for(int[]a:ar1) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}*/
		printMatrix(ar1);
		System.out.println("Second Matrix: ");
		
		/*for(int[]a:ar2) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}*/
		printMatrix(ar2);
		
		System.out.println("Result Matrix after addition: ");
		int [][] result = addMatrix(ar1, ar2);
		printMatrix(result);
	}

	public static int[][] addMatrix(int[][] ao, int[][] at) {
		
		int rows = ao.length;
		int cols = ao[0].length;
		int[][] res = new int[rows][cols];
		
			for(int i=0; i<rows;i++) {
				for(int j=0; j<cols;j++) {
					res[i][j] = ao[i][j]+at[i][j];
					
				}
						
			}
			
			return res;
	
	}
	
	
	public static void printMatrix(int[][] ar) {
		for(int[]a:ar) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
	}
	
		
}
