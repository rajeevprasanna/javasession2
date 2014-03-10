package inheritanceIsaAndHasA.hasA;

//Refer  : https://gist.github.com/rajeevprasanna/8500118
public class Horse extends Animal {
	
	// Horse class has an instance variable of type Halter, so you can say that
	// "Horse HAS-A Halter."
	

	
	// HAS-A relationships allow you to design classes that follow good OO
	// practices by not having monolithic classes that do a gazillion different
	// things. Classes (and their resulting objects) should be specialists.
	
	// "specialized classes can actually help reduce bugs." The more specialized
	// the class, the more likely it is that you can reuse the class in other
	// applications. If you put all the Halter-related code directly into the
	// Horse class, you'll end up duplicating code in the Cow class,
	// UnpaidIntern class, and any other class that might need Halter behavior.
	// By keeping the Halter code in a separate, specialized Halter class, you
	// have the chance to reuse the Halter class in multiple applications
	public void tie(LeadRope rope) {
		Halter myHalter = new Halter();//class.forName("sgjhsgdfjh sjkdgj skd")
		myHalter.tie(rope); // Delegate tie behavior to the
							// Halter object
	}
}
