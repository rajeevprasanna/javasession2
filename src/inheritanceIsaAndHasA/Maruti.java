package inheritanceIsaAndHasA;

//Maruti is specific type of Car which extends Car class means Maruti IS-A Car
public class Maruti extends Car {
	
	// Maruti extends Car and thus inherits all methods from Car (except final and static)
	// Maruti can also define all its specific functionality	
	public void MarutiStartDemo() {
		Engine MarutiEngine = new Engine();
		MarutiEngine.start();
		//Maruti class uses Engine object’s start() method via composition. We can say that Maruti class HAS-A Engine
	}
}
