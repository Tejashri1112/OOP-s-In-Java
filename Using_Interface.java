package Abstraction;

//all methods in interface are abstarct methods 

interface Base{
	void add();
	void substarct();
}
public class Using_Interface implements Base {

@Override
public void add() {
	System.out.println("add method called");
	
}

@Override
public void substarct() {
	System.out.println("Substarct method called");
	
}

public static void main(String[] args) {
	Using_Interface ob=new Using_Interface();
	ob.add();
	ob.substarct();
}

}
