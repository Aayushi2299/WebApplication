package capability3;

import java.util.Scanner;

public class Insertionsort {
	static int arr[] = { 5, 8, 3, 9, 2 };
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int count=0;
		for(int i = 1;i<arr.length;i++)
		{
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			if (count < 2) {
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[k] + " ");
				}
				count++;
			}
			System.out.println();
		}
	seachNumber();

	}
	
	private static void seachNumber()
	{
		
		System.out.println("Enter the element to be sreached");
		int key = sc.nextInt();

		int first = 0;
		int last = arr.length - 1;

		while(first<=last)
		{
			int mid = (first + last) / 2;
			if (key == arr[mid]) {
				System.out.println(mid + 1 + "  position");
				break;
			} else if (key < arr[mid]) {
				last = mid - 1;
			} else {
				first = mid + 1;
			}
		}
	}
	}
	
