class Test{
    public static void main(String[] args){
        try{
        System.out.println(10/2);
        }
        catch(Exception e){
             System.out.println(e);
        }
        finally{
        System.out.println("Finally Block always Executes");
        }
       
    }
}