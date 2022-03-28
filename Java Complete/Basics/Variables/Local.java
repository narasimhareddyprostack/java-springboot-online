class Local{
    int x;
    static int cost;//JVM will provide default values
    public static void m1(){
        int a=100;//local
        System.out.println(a);
    }
    public static void main(String[] args){
    m1();
    System.out.println(Local.cost);
    }
}