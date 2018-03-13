//Read input file in java program
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class project_file_listing_app {

	public static void main(String[] args) throws IOException {

	
		String Directory="neel";
		dir(Directory);
		    
	}

static void dir(String Directory) throws IOException
{	File f =new File(Directory);
	System.out.println("Directory:- "+f.getAbsolutePath());
	for(String i:f.list())
	{
		File F2 = new File(f.getAbsolutePath()+"/"+i);
		if(F2.isDirectory())
		{
			dir(F2.getAbsolutePath());
		}
		else
		{
			File(F2.getAbsolutePath());
		}
	}
	
}
static void File(String File) throws IOException
{
	File f1 = new File(File);
	System.out.println("File:- "+f1.getAbsolutePath());
	BufferedReader br = new BufferedReader(new FileReader(File));
	String s;
	while((s = br.readLine())!=null)
	{
	
		if(f1.isDirectory())
		{
			dir(f1.getAbsolutePath());
		}
		
		
			}
	
}
}
