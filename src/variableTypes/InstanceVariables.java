package variableTypes;

public class InstanceVariables {
	
		private int mCost;//manage outside class access using access modifiers.
		private final int finalCost=8;
	
		//Default public constructor
		public InstanceVariables(){}
		
		public InstanceVariables(int profit){
			int cost = profit + 30;//cost is a local variable which is initialized during declaration only.
			mCost = cost;
			System.out.println("local variable cost => "+ cost);
		}
		
		public void getDogDetails() {
			int age = 0;//Local variable must be initialized before use
			age = age + 7;
			System.out.println("Dog age is : " + age);
			
			System.out.println(mCost);
			
			//Local variable
			for(int i=0;i<3;i++){ //i is a local variable
				System.out.println("printing local variable. i => "+i);
			}			
		}

		public static void main(String args[]) {
			InstanceVariables test = new InstanceVariables();
			test.getDogDetails();
			//instance variables are accessed using InstanceName.variableName.
			System.out.println("Accessing instance variable without setting its value. So it prints default value. mcost => " + test.mCost);
			
			InstanceVariables test2 = new InstanceVariables(100);
			System.out.println("Accessing instance variable after setting its value through construcot initialization. mcost => " + test2.mCost);
			//Here test and test2 are local variables.
			
		}
}
