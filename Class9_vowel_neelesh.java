

import java.util.Scanner;


public class Class9_vowel_neelesh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String b = s.next();

		for(int i =0;i<b.length();i++)
		{
			if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u')
				
			{
			   continue;
			}
			else
			{
				System.out.print(b.charAt(i));
			}
			
		}

	}

}
