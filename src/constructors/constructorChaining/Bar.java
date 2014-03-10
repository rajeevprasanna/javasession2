package constructors.constructorChaining;

//Refer : https://gist.github.com/rajeevprasanna/8502002
public class Bar extends Foo {
	
	private int constant ;
	private static int staticconstant = 567;
	
	public Bar(int pConstant){		 
		//super(constant);
		super(staticconstant);
		System.out.println(constant);
		System.out.println("default constructor is called");
	}
	 
	
	private static boolean instanceAvailable;
	private static Bar bar;

	public static Bar getInstance() {
		if (!instanceAvailable) {
			//bar = new Bar();
			instanceAvailable = true;
		}
		return bar;
	}
	
	public void test(){
		
	}
	
	public static void main(String[] args){
		//Bar b = new Bar(5);
		//b.test();
		// output :
		//abstract Foo class constructor is invoked
		//Bar constructor is invoked

	}
	
	 
}
