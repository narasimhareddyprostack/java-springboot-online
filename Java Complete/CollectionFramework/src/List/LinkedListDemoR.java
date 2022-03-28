package List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemoR {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList(); //Accept all Data Types values
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		LinkedList l2 = new LinkedList(); //Accept all Data Types values
		l2.add(10);
		l2.add(20);
		l2.add(80);
	    
		System.out.println(l1.retainAll(l2));
		System.out.println(l1);
		System.out.println(l2);
		
		
	}

}
