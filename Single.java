package Inheritance;

//  Single level Inheritance in which one parent class and one child class

class Parent {

	void display1() {
		System.out.println("Parent method called");
	}
}

public class Single extends Parent {
	void display2() {

		System.out.println("child display called");
	}

	public static void main(String[] args) {

		Single ob = new Single();

		ob.display1();
		ob.display2();
	}

}
