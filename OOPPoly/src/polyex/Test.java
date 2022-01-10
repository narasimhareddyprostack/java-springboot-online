package polyex;

public class Test {
	private int a;
	
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.setA(100);
		System.out.print(t.getA());
	}

}
