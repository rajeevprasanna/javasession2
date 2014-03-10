package constructors.constructorChaining;

public abstract class Foo {
	
	public Foo(int constant){
		System.out.println("Foo constrcutor with arg is invoked");
	}
	
	public Foo(){
		System.out.println("abstract Foo class constructor is invoked");
	}
	public abstract void test();
}
