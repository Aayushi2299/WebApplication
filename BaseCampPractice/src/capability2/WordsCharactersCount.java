package capability2;

import java.util.Scanner;

public class WordsCharactersCount {
public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		str=str+' ';
		String p="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				p=p+ch;
			}
			else
			{
			String res=(p.charAt(0)+""+p.length());
			System.out.print(res+' ');
			p="";
			}
	}
}

}
