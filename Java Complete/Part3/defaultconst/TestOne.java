public class Demo{
    private Demo(){
        System.out.println("only once!");
    } 
}
public class TestOne{
    public static void main(String[] args){
        new Demo();
    }
}