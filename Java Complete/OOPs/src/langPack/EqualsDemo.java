package langPack;
//public boolen equals(Object ojb)
public class EqualsDemo {

	public static void main(String[] args) {
		String s1 = new String("Rahul Gandhi");
		String s2 = new String("Rahul Gandhi");
		
		String s3 = new String("Priyanka Gandhi");
		
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s2.equals(s3));//false

	}

}
