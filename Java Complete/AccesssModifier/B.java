package pack2;
import pack1.A;

class B extends A{
    void m2(){
         System.out.println("Test case 123");
    }
    public static void main(String[] args){
        B obj = new B();
        obj.m1();
        obj.m2();
        System.out.println(obj.score);
    }
}
