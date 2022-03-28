package part1;

public class Employee {
	private int enumber;
	private String ename;
	public void setEnumber(int enumber) {
		this.enumber = enumber;
	}
	public int getEnumber() {
		return this.enumber;
	}
}
class A{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEnumber(101);
		System.out.println(e1.getEnumber());
	}
}
class B{
	public static void main(String[] args) {
		Employee e2 = new Employee();
		e2.setEnumber(101);
		System.out.println(e2.getEnumber());
	}
}
