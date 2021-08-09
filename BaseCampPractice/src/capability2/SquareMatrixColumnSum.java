package capability2;

import java.util.Scanner;

public class SquareMatrixColumnSum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int n= sc.nextInt();
		System.out.println("enter the elements of matrix");
		int[][] arr = new int[n][n];
		int result[]=new int[n];
		int result1[]= new int[n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original matrix");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		int s=0;
		int p=-1;
		for (int i = 0; i < arr.length; i++) {
			s=0;
			for (int j = 0; j < arr.length; j++) {
				s=s+arr[j][i];
			}
			result[++p]=s;
			
		}
		int s1=0;
		int p1=-1;
		for (int i = 0; i < arr.length; i++) {
			s1=0;
			for (int j = 0; j < arr.length; j++) {
				s1=s1+arr[i][j];
			}
			result1[++p1]=s1;
			
		}
		System.out.println("row sum");
		for (int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
		}
		System.out.println("column sum");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
