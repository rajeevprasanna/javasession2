package inheritanceIsaAndHasA;

//Refer : https://gist.github.com/rajeevprasanna/8499735
public class InstanceOfExampleTest {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		if (!t1.equals(t2)) {// equals compares references
			System.out.println("they're not equal");
		}
		
		if (t1 instanceof Object) {// check if object is part of Test class
									// inheritance tree.
			System.out
					.println("t1's an Object because every class in java is subclass of object");

			// from Java doc :Class Object is the root of the class hierarchy.
			// Every class has Object as a superclass. All objects, including
			// arrays, implement the methods of this class.
			//Refer : http://docs.oracle.com/javase/6/docs/api/java/lang/Object.html
		}
	}

	public static class Test {
		// Test class
	}
}
