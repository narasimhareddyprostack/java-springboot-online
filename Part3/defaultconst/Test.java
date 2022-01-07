class Test{
    Test(){
         this(10);
         System.out.println("constructor - one ");
    }
    Test(int i){
    super();
    System.out.println("constructor - 123");
  
    }
    public static void main(String[] args){
        new Test();
    }
}