package constructors.superConstructorWitArgs;

//Refer : https://gist.github.com/rajeevprasanna/8502195
public class Horse extends Animal {
	
	//TODO : Comment the constructor and check the error
	
	Horse() {
		//super(); // Problem! as super class doesn't have a default constructor
		super("name"); // works
	}
	
	public static void main(String[] args){
		Horse horse = new Horse();
	}
}
