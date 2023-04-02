package Java8Features.lambdas.basics;


public class Test {

	public static void main(String[] args) {
		
		A a = ()->System.out.println("Inside MyMethod");
		a.myMethod();

	}

}
