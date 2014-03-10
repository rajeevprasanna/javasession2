package variableTypes;

public class StaticVariables {
	
	//fixing cost of the dog as 30$ irrespective of dog type.
	public static int mCost = 30;	 
	 	 	
	public static void main(String args[]) {		 		
		//static variables are accessed using className.staticVariableName.
		System.out.println("Accessing static variable directly with class name. mcost => " + StaticVariables.mCost);		
	}
}
