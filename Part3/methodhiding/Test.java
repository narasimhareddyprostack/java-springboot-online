class Parent{
    public static void m1(){
        System.out.println("Parent Class m1 method"); 
    }
}
class Child extends Parent{
    public static void m1(){
    System.out.println("Child  Class m1 method"); 
    }
}
class Test{
    public static void main(String[] args){
        //Child obj= new Child();
        //Parent obj = new Parent();
          Parent obj = new Child();
          obj.m1();
    }
}