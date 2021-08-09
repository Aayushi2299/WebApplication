package capability2;

import java.util.Scanner;

public class RemoveFirstAndLast {
public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		String[] ar= new String[10];
		str=str+' ';
		String p="";
		int count=-1;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			
			if(ch!=' ')
			{
				p=p+ch;
			}
			else
			{
			ar[++count]=p;
			
			p="";
			}
	}
		for (int i = 1; i < count; i++) {
			String temp=ar[i];
			temp=convertCamelcase(temp);
			System.out.print(temp+" ");
			
		}
}

private static String convertCamelcase(String temp) {
	char c= temp.charAt(0);
	int ascii=(int)c;
	if(ascii>=65 && ascii<=90)
	{
		ascii=ascii+32;
	}
	String temp1=(char)ascii+"";
	for (int i = 1; i < temp.length(); i++) {
		
	temp1=temp1+""+temp.charAt(i);
	}
	
	
	return temp1;
}
}


