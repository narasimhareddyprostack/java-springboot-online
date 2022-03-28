package FIExample;
import java.util.function.*;

public class FunctionInterface {

	public static void main(String[] args) {

     Predicate<String> checkLength = str -> str.length()>5;
     //Predicate<String> checkLength = (str)-> return str.length()>4;
     System.out.print(checkLength.test("Wel"));
	}

}
