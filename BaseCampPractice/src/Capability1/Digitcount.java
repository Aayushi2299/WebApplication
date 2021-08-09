package Capability1;

import java.util.Scanner;

public class Digitcount {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		sc.nextLine();
		String n = number+"";
		String result = solve(n);
		System.out.println("Result after processing: " + result);
		
	}
	public static String solve(String n){
		 int len = n.length();
		   if(len % 2 == 1) return n;
		   else{
		       int mid = len / 2;
		       String first = "";
		       for(int i = 0; i < mid; i++)
		           first += n.charAt(i);
		       first += "0";
		       for(int i = mid; i < len; i++)
		           first += n.charAt(i);
		       return first;

	}
}
}
