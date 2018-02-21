class Class5_even1_neelesh
{
	public static void main(String args[])
	{   int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		


		if((i%2==0)&&(j%2==0))
		{
			System.out.println("my number is even"+i);
			System.out.println("my number is even"+j);
		}
		else
		{
			if(i%2==0)
				System.out.println("my number is even"+i);
			else
				if(j%2==0)
					System.out.println("my number is even"+j);
			else
				System.out.println("both are odd");
		}
	
	}
}