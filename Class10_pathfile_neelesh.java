import java.io.File;

public class Class10_pathfile_neelesh {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
	File f =new File("D:\\abhishek\\neelesh ac\\src\\neel.txt");
	
	System.out.println(f.createNewFile());
	System.out.println(f.getAbsolutePath()+"\n"+f.isFile());

	}

}
