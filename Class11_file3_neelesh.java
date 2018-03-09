import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Class11_file3_neelesh {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("F:\\neel project\\src\\abc.txt");
		FileReader fr1 =new FileReader("F:\\neel project\\src\\cde.txt");
		FileWriter fw = new FileWriter("F:\\neel project\\src\\ghi.txt");
		BufferedReader bf = new BufferedReader(fr);
		BufferedReader bf1 = new BufferedReader(fr1);
		BufferedWriter bw =new BufferedWriter(fw);
	String sr ;
	String sr1 ;
	System.out.println("abc.text file");
	while(((sr=bf.readLine())!=null) && ((sr1=bf1.readLine())!=null))
	{
		
		System.out.println(sr);
		System.out.println(sr1);
		 bw.write(sr);
		 bw.newLine();
		 bw.write(sr1);
		 bw.newLine();
		 bw.flush();
		
		
	}
	bf.close();
	bf1.close();
	bw.close();
	
	
   


	}

}
