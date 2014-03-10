package inheritanceIsaAndHasA;

public class Car {
	
	//color and maxSpeed are instance variables
	private String color;
	private int maxSpeed;

	//Below are methods of Car class
	public void carInfo() {
		System.out.println("Car Color= " + color + " Max Speed= " + maxSpeed);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
