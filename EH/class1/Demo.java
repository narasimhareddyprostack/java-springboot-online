class  Bank{
    int acc_Id;
    String acc_Name;
}
class Demo{
    public static void main(String[] args){
        try{
          int[] size = { 38,40,42,44};
          Bank c1 = null;
            //c1.acc_Id  = 101;//NullPointerException
            //System.out.println(100/0);//ArithmaticException
            System.out.println(size[10]);//ArrayIndexOutOfBoundsEx
        }
       
        catch(NullPointerException ne){
            System.out.println(ne);
        }
        catch(ArithmeticException ae){
             System.out.println(ae);
        }
         catch(Exception e){
             System.out.println(e);
        }
       
       


    }
}