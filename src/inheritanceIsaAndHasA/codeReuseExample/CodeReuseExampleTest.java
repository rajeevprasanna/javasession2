package inheritanceIsaAndHasA.codeReuseExample;

//Refer : https://gist.github.com/rajeevprasanna/8499902
public class CodeReuseExampleTest {
	public static void main(String[] args) {
		PlayerPiece shape = new PlayerPiece();
		shape.displayShape();
		shape.movePiece();
	}
}
