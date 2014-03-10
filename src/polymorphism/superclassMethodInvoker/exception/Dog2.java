package polymorphism.superclassMethodInvoker.exception;

//Refer : https://gist.github.com/rajeevprasanna/8500769
public class Dog2 extends Animal{
	
	public void eat() { /* no Exceptions */
		System.out.println("I am eat methof in Dog class");
	}

	// This code will not compile because of the Exception declared on the
	// Animal eat() method.This happens even though, at runtime, the eat()
	// method used would be the Dog version, which does not declare the
	// exception.
	public static void main(String[] args) throws Exception {
		Animal a = new Dog2();
		Dog2 d = new Dog2();
		d.eat(); // ok
		a.eat(); // compiler error -
					// unreported exception
	}
}
