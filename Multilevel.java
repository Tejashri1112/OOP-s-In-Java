package Inheritance;


class Parent1
{
	void display1()
	{
		System.out.println("Parent1 one display method called");
		System.out.println("PArent1 is base class");
	}
}
class Parent2 extends Parent1{
	void display2()
	{
		System.out.println("Parent 2 display method called");
		System.out.println("Parent2 extends parent1 class");
	}
}
public class Multilevel extends Parent2 {

	public static void main(String[] args) {
		System.out.println("Multilevel Class extends Parent2");
		Multilevel ob=new Multilevel();
		ob.display1();
		ob.display2();
		System.out.println("Multilevel Class extends Parent2");
	}

}
