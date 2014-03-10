package encapsulation;

public class Test2 {
	public static void main(String args[]) {
		
		EncapsulationTest2 encap = new EncapsulationTest2();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");

		System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	}
}
