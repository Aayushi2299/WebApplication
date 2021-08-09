package Capability1;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number to calculate the diffrence between the even and odd digit");
		int num = sc.nextInt();
		int result = getDifferenceOfOddAndEvenDigit(num);
		System.out.println("Difference:"+result);
	}

	private static int getDifferenceOfOddAndEvenDigit(int num) {
		
		int evensum=0;
		int oddsum=0;
		while (num != 0) {
			int digit = num%10;
			if(digit%2==0)
			{
				evensum+=digit;
			}
			else {
				oddsum+=digit;
			}
			num=num/10;
		}
		
		return (evensum-oddsum);
	}

}
