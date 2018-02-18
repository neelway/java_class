//write a program in java to check number prime or not.
class Class2_prime_neelesh
{
	public static void main(String args[])
	{
		int n=3;
		int i,m=0,f=0;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println("number not prime");
		}

		else
		{
				for(i=2;i<=m;i++)
				{
					if(n%i==0)
					{
						System.out.println("number is not prime");
						f=1;
						break;

					}
				}	
					if(f==0)
			{
				System.out.println("number is prime");
			}
		}
	}
}