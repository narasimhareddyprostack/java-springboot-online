package langPack;

public class Employee extends Object{
	int eid;
	String ename;
	Employee(int eid, String ename){
		this.eid = eid;
		this.ename =ename;
	}

	public static void main(String[] args) {
	 
		Employee e1 = new Employee(101, "Rahul");
		Employee e = new Employee(101, "Rahul");
		Employee e2 = new Employee(102, "Priyanka");
	    Employee e3 = e2;
	    System.out.println(e1.equals(e2)); //fasle 
	    System.out.println(e1.equals(e3));
	    System.out.println(e2.equals(e3));
	    System.out.println(e1 == e2);
	    
	    
	    
	}

}
