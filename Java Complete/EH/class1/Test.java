class Test{
    public static void main(String[] args){
        System.out.println("Hello - 1");
        try{
        System.out.println(10/0);
        }
       catch(Exception e){
           e.printStackTrace();

           System.out.println("Exception object and message" + e.toString());
           System.out.println("only Exception Message:" + e.getMessage());
           
       }
        System.out.println("Hello - 2");  
    }
}