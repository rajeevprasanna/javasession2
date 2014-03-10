package objectCreation;

//Refer : https://gist.github.com/rajeevprasanna/8493409
public class ObjectCreation {
	 
	public ObjectCreation(){}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//1. Create object using new
		TestObject object1 = new TestObject();
		System.out.println("Creating testObject instance using new keyword.  name => "+ object1.getName());
		//Creating testObject instance using new keyword.  name => DefaultTestName
		
		
		//2. Using  class.forName
		TestObject object2 = (TestObject) Class.forName("objectCreation.TestObject").newInstance();
		System.out.println("Object creatin using class.forName(). name => "+ object2.getName());
		 
		
		//3.Using Clone
		TestObject object3 = (TestObject) object2.clone();
		System.out.println("Created clone object. name => "+object3.getName());
		
		//4. Using serialization. We will discuss later in detail
	}
	

}
