package constructors.baseExample;

//Refer  : https://gist.github.com/rajeevprasanna/8501958
public class Foo {
	
	int size;
	String name;
 
	public Foo(){}
	
	public Foo(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public Foo(String s){
		
	}

	public static void main(String[] args) {
		//Foo foo = new Foo();// compilation fails as it doesn't have default no-arg constructor
		
		Foo foo2 = new Foo("Fred", 43);// No problem. Arguments match the Foo constructor
		
	}
}
