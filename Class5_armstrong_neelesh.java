class Class5_armstrong_neelesh
{
	public static void main(String args[])
	{
		int r,sum=0,t,n=152;
		t=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(t==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}