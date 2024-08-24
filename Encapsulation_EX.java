package Encapsulation;

//Encapsulation is the concept of wrapping data (fields) and code (methods) together as a single unit.
public class Encapsulation_EX {
	int var1 = 10;
	String s = "JAVA";

	void print() {
		System.out.println(
				"Encapsulation is the concept of wrapping data (fields) and code (methods) together as a single unit.");
	}

	public static void main(String[] args) {
		Encapsulation_EX ob=new Encapsulation_EX();
		ob.print();
	}
}
