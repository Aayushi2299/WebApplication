package capability2;

import java.util.Scanner;

public class transpose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int n= sc.nextInt();
		System.out.println("enter the elements of matrix");
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int[][] tanspose=getTranspose(arr);
		System.out.println("Original matrix");
		printArray(arr);
		System.out.println("Transposed matrix");
		printArray(tanspose);
	}

	private static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

	private static int[][] getTranspose(int[][] arr) {
		int n=arr.length;
		int[][] transpose=new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				transpose[i][j]=arr[j][i];
			}
		}
		return transpose;
	}

}
