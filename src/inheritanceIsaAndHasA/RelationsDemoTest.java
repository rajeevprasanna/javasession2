package inheritanceIsaAndHasA;

//RelationsDemo class is making object of Maruti class and initialized it. Though Maruti class does not have setColor(), 
//setMaxSpeed() and carInfo() methods still we can use it due to IS-A relationship of Maruti class with Car class.
//Refer : https://gist.github.com/rajeevprasanna/8499616
public class RelationsDemoTest {
	public static void main(String[] args) {
		Maruti myMaruti = new Maruti();
		myMaruti.setColor("RED");
		myMaruti.setMaxSpeed(180);
		myMaruti.carInfo();

		myMaruti.MarutiStartDemo();
	}
}
