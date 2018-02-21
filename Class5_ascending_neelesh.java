import java.util.Scanner;

 class Class5_ascending_neelesh{

public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner data= new Scanner(System.in);
    int value[]= new int[10];
    int temp=0,i=0,j=0;
    System.out.println("Enter 10 element of array");
    for(i=0;i<10;i++)
    value[i]=data.nextInt();
     for(i=0;i<10;i++)
     {
     for(j=i;j<10;j++)
     {
      if(value[i]>value[j])
      {
       temp=value[i];
       value[i]=value[j];
       value[j]=temp;
      }
     }

     }
      System.out.println("asending Order:");
      for(i=0;i<10;i++)
           System.out.println(""+value[i]); 
    }
  }