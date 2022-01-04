abstract class A{
    int x = 100;
    abstract void m1();
    final void m2(){}
}

class B extends A {
    public void m1(){}

    public static void main(String[] args){
	    B b  = new B();
	    System.out.println(b.x);
    }

}