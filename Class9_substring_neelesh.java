import java.util.Scanner;


public class Class9_substring_neelesh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str=s.next();
	System.out.println(str.substring(0,1));
	System.out.println(str.substring(1,2));
	System.out.println(str.substring(2,3));
	System.out.println(str.substring(0,2));
	System.out.println(str.substring(1,3));
	System.out.println(str.substring(0,3));
	System.out.println("second way of program");
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<str.length();j++)
		{
			System.out.println(str.substring(i,j));
		}
	}
	
	}

}
