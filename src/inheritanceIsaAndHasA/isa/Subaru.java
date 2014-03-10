package inheritanceIsaAndHasA.isa;

//Refer : https://gist.github.com/rajeevprasanna/8500052
public class Subaru extends Car {
	// Important Subaru-specific stuff goes here
	// Don't forget Subaru inherits accessible Car members which
	// can include both methods and variables.
}
 

/*
 * public class Vehicle { ... } public class Car extends Vehicle { ... } public
 * class Subaru extends Car { ... }
 * 
 * In OO terms, you can say the following: Vehicle is the superclass of Car. Car
 * is the subclass of Vehicle. Car is the superclass of Subaru. Subaru is the
 * subclass of Vehicle. Car inherits from Vehicle. Subaru inherits from both
 * Vehicle and Car. Subaru is derived from Car. Car is derived from Vehicle.
 * Subaru is derived from Vehicle. Subaru is a subtype of both Vehicle and Car.
 * 
 * 
 * Returning to our IS-A relationship, the following statements are true:
 * "Car extends Vehicle" means "Car IS-A Vehicle." "Subaru extends Car" means
 * "Subaru IS-A Car."
 * 
 * If the expression (Foo instanceof Bar) is true, then class Foo IS-A Bar, even
 * if Foo doesn't directly extend Bar, but instead extends some other class that
 * is a subclass of Bar
 */

