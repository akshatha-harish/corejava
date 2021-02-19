package test;

public class Firstclass {
	int age;
	String name;
	float Salary;
	public void Display() {
		System.out.println("Indide Display");
	}
	public static void main(String[] args) {
	
	SecondClass Obj1 = new SecondClass();
	Obj1.Show("rahul");
	SecondClass Obj2= new SecondClass();
	Obj2.Show("manjunath");
	Obj2.Calculate();
	}

}
