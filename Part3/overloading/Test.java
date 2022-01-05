class Test{
       public  void wish(Object obj){
           System.out.println("Object version!");
       }
        public void wish(String s){
            System.out.println("String");
       }
       
       public void wish(StringBuffer sb){
            System.out.println("String Buffer");
       }
       public static void main(String[] args){
           Test t = new Test();
           t.wish(new Object());
           t.wish("Good Morning");
           t.wish(new StringBuffer("Welcome"));
           t.wish(null); 
       }

}