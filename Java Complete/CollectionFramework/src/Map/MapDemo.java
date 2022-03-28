package Map;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put(101, "Rahul Gandhi");
		hm.put(102, "Sonia Gandhi");
		hm.put(103, "Priyanka Gandhi");
		hm.put(104, "Robert V");
		System.out.println(hm); //{101=Rahul Gandhi, 102=Sonia Gandhi, 103=Priyanka Gandhi}
		
		System.out.println(hm.get(103)); //Priyanka Gandhi
		System.out.println(hm.get(108)); //Priyanka Gandhi
		//hm.remove(104);
		System.out.println(hm); 
		
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsValue("Robert V"));
		
		
		
	}

}
