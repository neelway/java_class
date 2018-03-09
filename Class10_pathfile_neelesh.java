
import java.io.FileReader;

public class Class10_pathfile_neelesh {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
	FileReader f =new FileReader("D:\\abhishek\\neelesh ac\\src\\abc.txt");
	int c;
	while((c=f.read())!= -1)
	{
		System.out.print((char)c);
	}

	}

}
