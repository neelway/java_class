import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_handling {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("F:\\neel project\\src\\abc.txt");
		FileReader fr1 =new FileReader("F:\\neel project\\src\\cde.txt");
		FileWriter fw = new FileWriter("F:\\neel project\\src\\efg.txt");
		BufferedReader bf = new BufferedReader(fr);
		BufferedReader bf1 = new BufferedReader(fr1);
		BufferedWriter bw =new BufferedWriter(fw);
	String sr ;
	String sr1 ;
	System.out.println("abc.text file");
	while((sr=bf.readLine())!=null)
	{
		
		System.out.println(sr);
		
	}
	System.out.println("cde.text file");	
	while((sr1=bf1.readLine())!=null)
	{
		
		System.out.println(sr1);
	}

	bw.write("aaa");
	bw.newLine();
	bw.write("bbb");
	bw.newLine();
	bw.write("ccc");
	bw.newLine();
	bw.write("ddd");
	bw.newLine();
	bw.write("111");
	bw.newLine();
	bw.write("222");
	bw.newLine();
	bw.write("333");
	bw.newLine();
	bw.write("444");
	bw.flush();
	bw.close();
	bf.close();
	bf1.close();
	
	
	}
}

