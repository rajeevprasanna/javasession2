package objectCreation;

//Marker interfaces

public class TestObject implements Cloneable {
	
	private String name = "DefaultTestName";
	 
	
	public String getName() {
		//accessing from db and setting it
		
		return name;
	}
 
	
	// By convention, classes that implement this interface should override
	// Object.clone (which is protected) with a public method
	// Refer : http://docs.oracle.com/javase/6/docs/api/java/lang/Cloneable.html
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			throw new Error("Something impossible just happened");
		}
	}
}