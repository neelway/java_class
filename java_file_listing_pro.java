package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class java_file_listing_pro {

	static ArrayList<String> Al = new ArrayList<String>();

	public static void main(String[] args) throws IOException { // To Create a
																// file to read
																// in input File
																// then print
																// output File.
		BufferedReader Br = new BufferedReader(new FileReader("F:\\neel pro\\input.txt"));

		String src;

		while ((src = Br.readLine()) != null) {

			File F1;
			// to create write file to Write output File

			F1 = new File(src);
			if (F1.isDirectory()) {
				Path(F1);
			}

			else {
//				FileWriter Fw = null;
//				Fw = new FileWriter(new File(src));
//				// write command
//				// Fw.write(src);
				print(src);
				

			}

		}
		Br.close();
	}

	static void print(String src) {
		
		
		FileWriter Fw ;
		try {
			Fw = new FileWriter(new File(src));
			
			
			System.out.print("Printing Files\n\n\n");

			ListIterator<String> Li = Al.listIterator();
			while (Li.hasNext()) {
				System.out.println("File:-");
				Fw.write(Li.next());
				Fw.write(",");
			}
			Fw.flush();
		} catch (IOException E) {
			System.out.print(E.getMessage());
		} finally {
			System.out.println("Printing Complete");
		}
	}

	static void Path(File F) { // To crate List of file then check it is
								// Directory or not?
		File[] F2 = F.listFiles();
		for (File F1 : F2) {
			if (F1.isDirectory()) {
				Path(F1);
				// System.out.println("Folder:-"+F1.getAbsolutePath());

			} else {
				
Al.add(F1.getAbsolutePath());

			}
		}

	}

}
