package legalReturnTypes.overloadedMethods;

//Refer : https://gist.github.com/rajeevprasanna/8501298
public class Bar extends Foo {
	
	
	String go(int x) {
		return null;
	}

	// Bar version of the method uses a different return type. That's perfectly
	// fine. As long as you've changed the argument list, you're overloading the
	// method, so the return type doesn't have to match that of the superclass
	// version.

	/*
	 * String go() { // Not legal! Can't change only the return type return
	 * 	null; 
	 * }
	 */
}
