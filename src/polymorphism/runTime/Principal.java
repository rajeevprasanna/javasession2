package polymorphism.runTime;

public class Principal implements Worker {
	public void doIt() {	
		System.out.println("Principal does the work");
	}
	
	public Teacher doItA(int a) throws Exception {
		System.out.println("Principal does the work");
		Teacher teacher = new Teacher();
		return teacher;
	}
}
