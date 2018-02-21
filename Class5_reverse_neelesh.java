import java.util.Scanner;
class Class5_reverse_neelesh
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		
		int rev=0,r;
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;

		}
    System.out.println("reverse number is"+ rev);
	}
}