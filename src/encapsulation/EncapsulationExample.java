package encapsulation;

public class EncapsulationExample {

	
	public int left = 9;
	public int right = 3;

	 
	public void setLeft(int leftNum) {		
		left = leftNum; 
	}

	// lots of complex test code here
	public int getLeft(){	
		left = left/3;
		return left;
	}
}
