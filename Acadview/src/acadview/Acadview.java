/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Neelesh Tripathi
 */
public class Acadview {

//To Create Array List .....For Adding File in the Array List.
    static ArrayList<String> Al = new ArrayList<String>();

    
    public static void main(String[] args) {
        System.out.println("Staring with the Execution\n\n");
        //This is the source file where File and FOlder are write
        String SOURCE = "F:\\neel pro\\input.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(SOURCE));
            String src;

            //TO read File And Folder
            while ((src = br.readLine()) != null) {

                File F1 = new File(src);

                if (F1.exists()) {

                    //TO check Path is Folder...when Find the Folder then go Path Function
                    if (F1.isDirectory()) {

                        Path(F1);
                        //add user Define exception

                    } else {
                        print(src);

                    }

                } else {
                    throw new FileNotExistException("There path not exist any folder");
              
                }
              
            }
              br.close();

        } catch (FileNotExistException e) {
            System.out.println(e);
        }  catch (IOException e) {
            System.out.println();
           
        }
        System.out.println("\n\nExecution terminating");
    }

    static void print(String src) {

        FileWriter Fw;
        try {
            Fw = new FileWriter(new File(src));
            ListIterator<String> Li = Al.listIterator();
            while (Li.hasNext()) {
                String add = "File:-" +  Li.next();
                Fw.write(add);
                System.out.println(add);
                Fw.write(",");

            }

            Fw.flush();
            Fw.close();
        } catch (FileNotFoundException E) {
            String error = E.getClass().toString();
            String des = E.getMessage();
            System.out.println("Exception: " + error.substring(5));
            System.out.println("Description: " + des.substring(2, des.length() - 1));
            System.out.println("Printing Complete");
        } catch (IOException E) {
            String error = E.getClass().toString();
            String des = E.getMessage();
            System.out.println("Exception: " + error.substring(5));
            System.out.println("Description: " + des.substring(2, des.length() - 1));
        }

    }

    static void Path(File F) {

        //create list of File
        File[] F2 = F.listFiles();
        for (File F1 : F2) {
            if (F1.isDirectory()) {
                Path(F1);
            } else {

                //get path of File
                Al.add(F1.getAbsolutePath());
            }
        }

    }

    
}
