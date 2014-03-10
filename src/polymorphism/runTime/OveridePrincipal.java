package polymorphism.runTime;

public class OveridePrincipal extends Principal{
 
	public Teacher doItA(int a) {
		System.out.println("Principal does the work");
		TeacherSubClass teacherSubClass = new TeacherSubClass();
		return teacherSubClass;
	}
	
	public static void main(String[] args){
		Principal principal = new OveridePrincipal();
		principal.doIt();
	}
}
