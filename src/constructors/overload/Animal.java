package constructors.overload;

//Refer : https://gist.github.com/rajeevprasanna/8502254
public class Animal {
	
	String name;

	Animal(String name) {
		System.out.println("constructor with name arg is invoked");
		this.name = name;
	}

	Animal() {
		//System.out.println("this statement is not allowed here.");
		this(makeRandomName());
	}

	static String makeRandomName() {
		int x = (int) (Math.random() * 5);
		String name = new String[] { "Fluffy", "Fido", "Rover", "Spike", "Gigi" }[x];
		return name;
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.name);
		Animal b = new Animal("Zeus");
		System.out.println(b.name);
	}

}
