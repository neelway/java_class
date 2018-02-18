//write a program in java to check number pallindrome or not
class Class2_pallindrome_neelesh
{
	public static void main(String args[])
	{
		int r,sum=0,t,n=121;
		t=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(t==sum)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}
}