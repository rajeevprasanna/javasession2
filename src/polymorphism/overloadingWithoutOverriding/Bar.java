package polymorphism.overloadingWithoutOverriding;

import java.util.concurrent.Callable;

//Refer  :https://gist.github.com/rajeevprasanna/8500874
public class Bar extends Foo {
	
	
	// DonÕt be fooled by a method thatÕs overloaded but not overridden by a
	// subclass. ItÕs perfectly legal to do the following:

	void doStuff(String s) {
	}
	
	
	
	public static void main(String[] args){
		Bar b = new Bar();
		Foo foo = new Bar();
		Bar bar = (Bar)(new Foo());
		
		callDoIt(bar);
		//callDoIt(foo);
		
		b.doStuff();
	}
	
	
	private static void callDoIt(Foo foo){
		//Bar method
		foo.doStuff();
		
		Bar b = (Bar)foo;
		b.doStuff("str");
	}
	
	
	//Foo -> Bar <---
	//Bar 

	// The Bar class has two doStuff() methods: the no-arg version it inherits
	// from Foo (and does not override), and the overloaded doStuff(String s)
	// defined in the Bar class. Code with a reference to a Foo can invoke only
	// the no-arg version, but code with a reference to a Bar can invoke either
	// of the overloaded versions.
}
