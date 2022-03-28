class Emp{
    int eid=101;
    String ename="Rahul";
   static String eOrg="TCS";
    public void m1(){}
    public static void main(String[] args){
        Emp e1 = new Emp();
        Emp e2 = new Emp();

        e2.ename = "Priyanka";
        e2.eOrg="TATA Tele Communication";

        System.out.println(e1.ename);
        System.out.println(e1.eOrg);
        System.out.println(e2.ename);
        System.out.println(e1.eOrg);
    }
}