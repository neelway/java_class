/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filielistingapp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author kamal hassan
 */
public class Filielistingapp {
        static ArrayList<String> al = new ArrayList<String>();
   
    public static void main(String[] args) {
       
      
        try {
            FileReader fr =new FileReader("D:\\in.txt");
            try (BufferedReader br = new BufferedReader(fr)) {
                String s;
                while ((s= br.readLine()) != null) {
                    File f1 = new File(s);
                    if (f1.exists()) {
                        if (f1.isDirectory()) {
                            Path(f1);
                            
                        } else {
                            filewrite(s);
                            
                        }
                        
                    } else {
                        throw new  MyException("chek your address");
                        
                    }

                }
            }

        } catch ( MyException | IOException e) {
            System.out.println(e);
        }
      
    }
    static void filewrite(String src) {

     
        try {
           FileWriter  fw = new FileWriter(new File(src));
            try (BufferedWriter fw1 = new BufferedWriter(fw)) {
                ListIterator<String> li = al.listIterator();
                while (li.hasNext()) {
                    String a =li.next();
                    System.out.println(a);
                    fw1.write(a);
                    fw1.newLine();
                }
                
                fw1.flush();
            }
        } catch (FileNotFoundException E) {
          System.out.println(E);
        } catch (IOException E) {
           System.out.println(E);
        }

    }

    static void Path(File f) {
        File[] f2 = f.listFiles();
        for (File f1 : f2) {
            if (f1.isDirectory()) {
                Path(f1);
            } else {

                 al.add(f1.getAbsolutePath());
            }
        }

    }

    
}

        
    
    

