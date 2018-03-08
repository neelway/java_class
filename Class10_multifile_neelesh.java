import java.io.File;
import java.io.IOException;


public class Class10_multifile_neelesh {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
	File f = new File("D:\\abhishek\\neelesh ac\\src");
	
	String[] s=f.list();
	for(String a:s)
	{
	
	
	System.out.println(a);
	System.out.println(f.getAbsolutePath());
	}

	}

}
