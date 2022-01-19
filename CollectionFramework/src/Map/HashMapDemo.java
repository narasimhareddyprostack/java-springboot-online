package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put(101, "Rahul Gandhi");
		hm.put(102, "Sonia Gandhi");
		hm.put(103, "Priyanka Gandhi");
		hm.put(104, "Robert V");
		System.out.println(hm); 
		Set s = hm.keySet();
		System.out.println(s); 
	    Collection s1 = hm.values();
	    System.out.println(s1); 
	    //-------------------------------
	    Set s2 = hm.entrySet();
	    
	    System.out.println(s2); 
	    
	    Iterator itr = s2.iterator();
	    while(itr.hasNext()) {
	    	Map.Entry e1 =(Map.Entry)	itr.next();
	    	System.out.println(e1.getKey() + ":" +e1.getValue() );
	    }
		

	}

}
