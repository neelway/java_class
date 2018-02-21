class Class5_prime1_neelesh
{
	public static void main(String args[])
	{    int a = Integer.parseInt(args[0]);
		
		int i,m=0,f;
	
		for(int j=0;j<=a;j++)
		{f=0;
	           m=j/2;
				if(j==0||j==1)
				{
					//System.out.println("number not prime");
				}

				else
				{
						for(i=2;i<=m;i++)
						{
							if(j%i==0)
							{
								System.out.println("number is not prime"+j);
								f=1;
								break;

							}
						}
							if(f==0)
							{
								System.out.println("number is prime"+j);
							}	
				}
		}		
	}
}