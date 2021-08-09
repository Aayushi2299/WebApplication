package Capability1;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a decimal number");
		double number = s.nextDouble();
		s.nextLine();
		String num = number+"";
		String a = "", b = "";
		boolean flag = false;
		for (int i = 0; i < num.length(); i++) {
			if (flag)
				b += num.charAt(i);
			else if (!flag && num.charAt(i) != '.')
				a += num.charAt(i);
			else
				flag = true;
		}
		System.out.println("Result after processing: " + reverse(a) + "." + reverse(b));
	}

	public static String reverse(String n) {
		String r = "";
		for (int i = 0; i < n.length(); i++)
			r = n.charAt(i) + r;
		return r;
	}
}