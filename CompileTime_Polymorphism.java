package Polymorphism;

//Method Overloading (same methods name different parameters)
// In thios example add methods have same name but first method has no parameters and second add() method contains two parameters n1 and n2

public class CompileTime_Polymorphism {

	void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	public static void main(String[] args) {

		CompileTime_Polymorphism ob = new CompileTime_Polymorphism();
		ob.add();
		ob.add(50, 100);

	}

}
