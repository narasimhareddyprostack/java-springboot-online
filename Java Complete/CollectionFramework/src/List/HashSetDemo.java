package List;

import java.util.*;


public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		System.out.println(hs);//[50, 20, 70, 40, 10, 60, 30]
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	    
		System.out.print("***************");
		
		List list = new ArrayList(hs);
		Collections.sort(list);
		System.out.print(list);
		
		
		

	}

}
