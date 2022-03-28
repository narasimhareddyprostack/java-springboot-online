package List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(); //Accept all Data Types values
		 //ArrayList<String> al = new ArrayList<String>();//allowed only String
		 
		 List ll1 = new LinkedList();
		 //How to add indivial values to arrayList 
		 ll1.add(true);
		 ll1.add(false);
		 
		 ll.add(10);
		 ll.add("Twenty");
		 ll.add(true);
		 
		 //How to add - collection object
		 ll.addAll(ll1);
		 System.out.println(ll);
		 System.out.println(ll1);
		 //find the size of ArrayList  - size() method 
		 System.out.println(ll.size());
		 
		 //If you want specifc value 
		 System.out.println(ll.get(1));
		 //searching element - contains()
		 
		 System.out.println(ll.contains(10));
		 
		 System.out.println(ll.isEmpty());
		 //Reading ArrayList values 
		 System.out.println("--------------Reading---------------");
		 
		 for(int i=0; i <= ll.size() -1; i++) {
			 System.out.println(ll.get(i));
		 }
		 System.out.println("--------------Reading---------------");
		 
		 for(Object obj:ll) {
			 System.out.println(obj);
		 }

	}

}
