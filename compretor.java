import java.util.ArrayList;
import java.util.Collections;

public class compretor {

	public static void main(String[] args) {
	  
		        ArrayList<Integer> list =
		                        new ArrayList<Integer>();
		        list.add(1);
		        list.add(2);
		        list.add(1);
		        list.add(2);
		        list.add(1);
		        
		     
		        // count the frequency of the word "code"
		        System.out.println("The frequency of 1 "+ 
		                                Collections.frequency(list, 1));
		     
		        System.out.println("The frequency of 2 "+ 
                        Collections.frequency(list, 2)); 
		    }
		


	}



