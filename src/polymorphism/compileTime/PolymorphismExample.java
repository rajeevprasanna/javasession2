package polymorphism.compileTime;

import java.util.ArrayList;
import java.util.List;

//Refer  :https://gist.github.com/rajeevprasanna/8500616
public class PolymorphismExample {

	public void doSomething(Worker worker) {
		worker.doIt();
		System.out.println("I'm a worker");
	}

	public void doSomething(Teacher teacher) {
		teacher.doIt();
		System.out.println("I'm a Teacher");
	}

	public void doSomething(Principal principal) {
		principal.doIt();
		System.out.println("I'm a Principal");
	}

	public static void main(String[] args) {

		PolymorphismExample example = new PolymorphismExample();
		
		
		Worker principal = new Teacher();
		principal.testPrinciple();
		
		Teacher teacher2 = (Teacher)principal;
		teacher2.testTecher();
		
		
		
		Worker teacher = new Teacher();
		
		ArrayList list = new ArrayList();
		
		//Why should i do this kind of interface/super class programming ?????
		
		example.doSomething(principal);
		example.doSomething(teacher);
		/*
		 * You would expect the output as bellow, If you run the
		 * PolymorphismExample class
		 * 
		 * I'm a Principal I'm a Teacher
		 * 
		 * WRONG, the actual output will be
		 * 
		 * I'm a worker I'm a worker
		 * 
		 * Here the type is decided at compile time. Even though the objects are
		 * instances of Principal and Teacher, the reference is a Worker type.
		 * So the compiler picks the doSomething(Worker worker) method as it
		 * accepts the same type of reference type
		 */
	}
	 

}
