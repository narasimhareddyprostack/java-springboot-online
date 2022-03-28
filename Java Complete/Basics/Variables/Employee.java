class Employee{
 int eid=101;
 String ename="Rahul Gandhi";
 //String eorg ="TCS";
 public static void main(String[] args){
     Employee e1 = new Employee();
     System.out.println(e1.eid);
     System.out.println(e1.ename);

     Employee e2 = new Employee();
     e2.ename="Priyanka";
     System.out.println(e2.eid);
     System.out.println(e2.ename);
     }
}