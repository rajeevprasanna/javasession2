package polymorphism.superclassMethodInvoker;

import polymorphism.superclassMethodInvoker.Animal;
//Refer : https://gist.github.com/rajeevprasanna/8500736
public class Horse extends Animal {
	
	public void printYourself() {
		
		System.out.println("This is subclass printyourasled mwethod => bfore");
		
		// Take advantage of Animal code, then add some more
		super.printYourself(); // Invoke the superclass // (Animal) code
		// Then do Horse-specific
		// print work here

		// Using super to invoke an overridden method only applies to instance
		// methods. (Remember, static methods can't be overridden.)

		// If you try to printYourself method using super without extending
		// Animal class, it will throw compile time error.
		
		System.out.println("This is subclass printyourasled mwethod => After");
	}
	
	public static void main(String[] args){
		Horse horse = new Horse();
		horse.printYourself();
		
		System.out.println("Now playing with Animal class");
		
		Animal animal = new Horse();
		animal.printYourself();
	}
}
