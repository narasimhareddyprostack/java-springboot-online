class A{ 
    int a = 100;
    public void display(){
        System.out.println("class A - display methods");
    }
}
class B extends A{
    int a = super.a;
    public void display(){
        super.display();
        System.out.println("class B - display methods");
    }
} 
class Test{
    public static void main(String[] args){
        B b = new B();
        System.out.println(b.a);
        b.display();
    }
}