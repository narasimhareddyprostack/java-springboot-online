package List;
import java.util.ArrayList;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {

		 ArrayList al = new ArrayList(); //Accept all Data Types values
		 //ArrayList<String> al = new ArrayList<String>();//allowed only String
		 
		 List al1 = new ArrayList();
		 //How to add indivial values to arrayList 
		 al1.add(true);
		 al1.add(false);
		 
		 al.add(10);
		 al.add("Twenty");
		 al.add(true);
		 
		 //How to add - collection object
		 al.addAll(al1);
		 System.out.println(al);
		 System.out.println(al1);
		 //find the size of ArrayList  - size() method 
		 System.out.println(al.size());
		 
		 //If you want specifc value 
		 System.out.println(al.get(1));
		 //searching element - contains()
		 
		 System.out.println(al.contains(10));
		 
		 System.out.println(al.isEmpty());
		 //Reading ArrayList values 
		 System.out.println("--------------Reading---------------");
		 
		 for(int i=0; i <= al.size() -1; i++) {
			 System.out.println(al.get(i));
		 }
		 System.out.println("--------------Reading---------------");
		 
		 for(Object obj:al) {
			 System.out.println(obj);
		 }
		 
	}

}
