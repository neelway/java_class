import java.util.Scanner;
class Class6_swapnum_neelesh
{  public static void main(String[] args)
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter the size");
    	int size =s.nextInt();
    	int a[]=new int[size];
    	for(int i=0;i<size;i++)
    	{
    		a[i]=s.nextInt();
    	}
    	for(int i=1;i<size;i+=2)
    	{
    		
    		int t=a[i];
    		a[i]=a[i-1];
    		a[i-1]=t;
    	    
    	}
    	for(int i=0;i<size;i++)
    	{
    		System.out.println("the num are");
    		System.out.println(a[i]);
    	}
    }
}    	