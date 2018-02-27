import java.util.Scanner;
class Class6_img_neelesh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
      Class6_img_neelesh c = new Class6_img_neelesh();
         
       c.display();
    } 
        
        
       void display()
       {
            Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b>0)
            System.out.println(a+"+"+b+'i');
        else
            System.out.println(a+""+b+'i');
       }
    
}
