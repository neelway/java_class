import java.util.Scanner;
class Class6_2ndlarge_neelesh {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[sc.nextInt()];
        int n=ar.length;
        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        
        for(int i=n-1;i>0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                 if(ar[i]<ar[j])
                 {
                     int temp = ar[i];
                     ar[i]=ar[j];
                     ar[j] = temp;
                 }
            }
        }
        //for (int i:ar)
        {
            System.out.print(ar[ar.length-2]+" ");
        }
    }
}

