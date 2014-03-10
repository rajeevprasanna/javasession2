package polymorphism;

//Refer : https://gist.github.com/rajeevprasanna/8500554
public class Test {
	
	public static void main(String[] args) {
		// following are legal
		
		Animatable player = new PlayerPiece();
		//player = new CricketShape();
		
		
		//GameShape player2 = new CricketShape();
		
		
		//GameShape cricketShape = new CricketShape();
		 
		
		Object object = player;//Upcasting
		 
		//GameShape shape = player;
		
		// shape.movePiece-- this call will not work as methods on GameShape
		// only visible.
		
		// compiler is not aware of what actually object instance type is. at
		// runtime, jvm can identify object and then typecast works
		Animatable mover = player;
	} 
}

 