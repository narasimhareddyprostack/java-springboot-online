package FIExample;

import java.util.function.Function;

public class FunInEx {

	public static void main(String[] args) {
		Function<Integer, String> fun  = a-> a*10 + "Multiplication";
		System.out.println(fun.apply(10));

	}

}
