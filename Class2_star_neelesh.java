//write a program in java to print star.
class Class2_star_neelesh
{
	public static void main(String args[])
	{
		int rows=5,i=1,j=1;
		while(i <= rows)
		{
			while(j <= i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j=1;

		}
	}
}