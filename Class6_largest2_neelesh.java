import java.util.Scanner;
class Class6_largest2_neelesh
{
	public static  void main(String[] args)
	{	int i;
		Scanner s =new Scanner(System.in);
		System.out.println("enetr the size");
		int size=s.nextInt();
		int a[]=new int[size];
		for(i=0;i<size.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int j=1;i<(size-i);j++)
		{
			if(a[j]<a[j-1])
			{
				int t=a[j-1];
				a[j-1]=a[j];
				a[j]=t;
			}
		
		}
		for( i=0;i<size.;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}