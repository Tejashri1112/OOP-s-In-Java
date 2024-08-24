package Abstraction;

// abstarct class contains at least one abstarct method and aslo conitains non abstract mwthods
abstract class Base1 {
	abstract void display();

	void print() {
		System.out.println("Print method of abstract class called");
	}
}

public class Using_AbstractClass extends Base1 {
	@Override
	void display() {
		System.out.println("display() method of abstract class is called");

	}

	public static void main(String[] args) {
		Using_AbstractClass ob = new Using_AbstractClass();
		ob.display();
		ob.print();

	}

}
