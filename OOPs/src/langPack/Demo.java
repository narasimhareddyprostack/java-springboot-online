package langPack;

public class Demo {

	public static void main(String[] args) {
		String s1 = new String("Rahul Gandhi");
		String s2 = new String("Rahul Gandhi");
		System.out.println(s1 == s2);      //false  - ref check   
		System.out.println(s1.equals(s2)); //true  - content comparision
		
		StringBuffer s3 = new StringBuffer("Rahul Gandhi");
		StringBuffer s4 = new StringBuffer("Rahul Gandhi");
		
		System.out.println(s3 == s4);     
		System.out.println(s3.equals(s4)); // Ref - comparsion.
		//System.out.println( 3.equal3) );
	}

}
