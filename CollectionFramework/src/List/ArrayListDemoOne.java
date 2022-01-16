package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ArrayListDemoOne {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(500);
		al.add(500);
		al.add(10);
		al.add(40);
		al.add(1000);
		al.add(5);
		
		System.out.println("Reading ArrayList Values using Iterator");
		Iterator i = al.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next()); //get the element and move to next element 
		}
		System.out.println(al);
		System.out.println("__________Sorting the elements___________");
		//Collections.sort(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		//Shuffle the elements 
		System.out.println("__________Shuffle the elements___________");
		Collections.shuffle(al);
		System.out.println(al);
		

	}

}
