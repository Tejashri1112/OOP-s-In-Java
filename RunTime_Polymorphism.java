package Polymorphism;

// MethodOverriding (same method name same parameters)
class Base {
	void add(int n1, int n2) {
		System.out.println("Base class add method :" + (n1 + n2));
	}
}

public class RunTime_Polymorphism extends Base {
	void add(int n1, int n2) {
		// super.add(40,50);
		System.out.println("child class add method :" + (n1 + n2));
	}

	public static void main(String[] args) {
		Base ob2 = new Base();
		ob2.add(50, 50);
		Base ob1 = new RunTime_Polymorphism();
		ob1.add(20, 30);

	}
}
