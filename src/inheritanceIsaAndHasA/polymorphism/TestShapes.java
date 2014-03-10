package inheritanceIsaAndHasA.polymorphism;

//Refer : https://gist.github.com/rajeevprasanna/8499990
public class TestShapes {
	public static void main(String[] args) {
		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();

		// The beautiful thing about polymorphism ("many forms") is that you can
		// treat any subclass of GameShape as a GameShape

		// If you add any extra method in the sub class, then u will not get
		// those methods unless u typecast to that particular class. 
		//That means you can't use a GameShape variable to call, say, the getAdjacent()
		// method even if the object passed in is of type TilePiece.
		doShapes(player);
		doShapes(tile);
	}

	// The doShapes() method knows only that the objects are
	// a type of GameShape, since that's how the parameter is declared
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
}
