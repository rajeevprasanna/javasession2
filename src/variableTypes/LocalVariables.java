package variableTypes;

public class LocalVariables {
	
	//Default public constructor
	public LocalVariables(){}
	
	public LocalVariables(int profit){
		int cost = profit + 30;//cost is a local variable which is initialized during declaration only.
		System.out.println("local variable cost => "+ cost);
	}
	
	public void getDogDetails() {
		int age = 0;//Local variable must be initialized before use
		age = age + 7;
		System.out.println("Dog age is : " + age);
		 
		//Local variable
		for(int i=0;i<3;i++){ //i is a local variable
			System.out.println("printing local variable. i => "+i);
		}		
	}

	public static void main(String args[]) {
		LocalVariables test = new LocalVariables();
		test.getDogDetails();
		
		LocalVariables test2 = new LocalVariables(100);	
		//Here test and test2 are local variables.
	}

}
