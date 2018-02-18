//write a program in java to reverse num.
class Class2_reverse_neelesh
{
	public static void main(String args[])
	{
		int rev=0,num=123,r;
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;

		}
    System.out.println("reverse number is"+ rev);
	}
}