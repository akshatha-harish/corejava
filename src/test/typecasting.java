package test;

public class typecasting {
	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("value of b:"+b);
		
		System.out.println("Explicit Type Casting");
		double x=45.5;
		int y=(int) x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y:"+y);
	}

}
