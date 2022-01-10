package polyex;

class A{
	A(){
		System.out.println("Parent Class Constructor!");
	}
}
class B extends A{

	B(){
		super();
		System.out.print("Child  Class - B:  Constructor!");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();

	}

}
