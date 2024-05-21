package exercise;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {3,12,2,65,43,16,9,31};
		System.out.println("Before Bubble Sort: "+Arrays.toString(ar));
		
		int[] rar = bubbleSort(ar);
		System.out.println("After Bubble Sort: "+Arrays.toString(rar));
	}

	private static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int k=0;k<n-i-1;k++) {
				if(arr[k]>arr[k+1]) {
					int temp = arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		return arr;
	}

}
