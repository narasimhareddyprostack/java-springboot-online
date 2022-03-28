package List;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class LinkedListDemoOne {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(500);
		ll.add(500);
		ll.add(10);
		ll.add(40);
		ll.add(1000);
		ll.add(5);
		
		System.out.println("Reading ArrayList Values using Iterator");
		Iterator i = ll.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next()); //get the element and move to next element 
		}
		System.out.println(ll);
		System.out.println("__________Sorting the elements___________");
		Collections.sort(ll);
		//Collections.sort(ll, Collections.reverseOrder());
		System.out.println(ll);
		//Shuffle the elements 
		System.out.println("__________Shuffle the elements___________");
		Collections.shuffle(ll);
		System.out.println(ll);
		

	
	}

}
