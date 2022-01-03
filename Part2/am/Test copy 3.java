abstract class Test {
    abstract final void display(); //no implimentation    
}
class Display extends Test{
    public void display(){
        System.out.println("Display method:");
    }
    public static void main(String[] args){
     Display d = new Display();
     d.display();
       
    }

} 

