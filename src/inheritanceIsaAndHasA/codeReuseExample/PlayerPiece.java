package inheritanceIsaAndHasA.codeReuseExample;

public class PlayerPiece extends GameShape {
	
	//It avoids code duplication by inheriting super class methods
	public void movePiece() {
		System.out.println("moving game piece");
	}
	// more code
}
