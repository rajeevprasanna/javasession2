package polymorphism.compileTime;

public class Principal implements Worker {
	public void doIt() {
		System.out.println("Principal does the work");
	}
	
	public void testPrinciple(){
		System.out.println("I am from principle class");
	}
}
