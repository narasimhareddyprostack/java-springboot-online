package FIExample;

import java.util.function.Consumer;

class Employee{
	private String ename;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
public class ConsumerEx {

	public static void main(String[] args) {
		Employee e = new Employee();
		//Consumer<Employee> setName = ()->{}
		Consumer<Employee> setName = obj->obj.setEname("Rahul Gandhi");
        setName.accept(e);
        System.out.println(e.getEname());
         
	}

}
