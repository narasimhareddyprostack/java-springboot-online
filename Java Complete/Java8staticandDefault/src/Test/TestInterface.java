package Test;

//@FunctionalInterface
public interface TestInterface {
	public void m1();
    public void m7();
	public static void m2() {
		System.out.println("m2 static Method in Interface");
	}
	public static void m4() {
		System.out.println("m4 static Method in Interface");
	}
	public default void m3() {
		System.out.println("m3 default method in Interface");
	}
	public default void m5() {
		System.out.println("m3 default method in Interface");
	}
}
