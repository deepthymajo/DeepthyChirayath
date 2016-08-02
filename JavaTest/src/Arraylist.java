import java.util.ArrayList;

public class Arraylist {



public static void main(String args[]) {
		     
		     
			  ArrayList<String> obj = new ArrayList<String>();
	
			  /*This is how elements should be added to the array list*/
			  obj.add("Aarnav");
			  obj.add("Bansal");
			  obj.add("Chitra");
			  obj.add("Dany");
			  obj.add("Eden");

			  /* Displaying array list elements */
			  System.out.println("Currently the array list has following elements:"+obj);

			  /*Add element at the given index*/
			  obj.add(0, "Aarti");
			  obj.add(1, "Bindu");

			  /*Remove elements from array list like this*/
			  obj.remove("Chitra");
			  obj.remove("Dany");

			  System.out.println("Current array list is:"+obj);

			  /*Remove element from the given index*/
			  obj.remove(1);

			  System.out.println("Current array list is:"+obj);
		   }
		}

