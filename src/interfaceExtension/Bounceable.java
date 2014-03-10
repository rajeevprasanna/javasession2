package interfaceExtension;

public interface Bounceable extends Moveable, Spherical {
	void bounce();

	void setBounceFactor(int bf);
}
