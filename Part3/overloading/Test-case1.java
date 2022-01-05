class Test{
       public  void wish(String s){
           System.out.println("String ");
       }
       public void wish(StringBuffer sb){
            System.out.println("String Buffer");
       }
       public static void main(String[] args){
           Test t = new Test();
           t.wish("Good Morning");
           t.wish(new StringBuffer("Welcome"));
       }

}