package polymorphism.compileTime;

public class Teacher implements Worker {
	public void doIt() {
		System.out.println("Teacher does the work");
	}
	
	public void testPrinciple(){
		System.out.println("I am from Techer class");
	}
	
	public void testTecher(){
		System.out.println("I am specific to teacher");
	}
}

