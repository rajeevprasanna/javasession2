package typecasting;

//Refer : https://gist.github.com/rajeevprasanna/8501055
public class CastTest2 {
	public static void main(String[] args) {
		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (Animal animal : a) {
			animal.makeNoise();
			if (animal instanceof Dog) {
				// try to do a Dog behavior ?

				// animal.playDead();
				// cannot find symbol.The compiler is saying,
				// "Hey, class Animal doesn't have a playDead() method".

				Dog d = (Dog) animal; // casting the ref. var.
				d.makeNoise();
				// It is downcasting. because we're casting down the inheritance
				// tree to a more specific class.

				// Now, the compiler is happy. Before we try to invoke playDead,
				// we cast the animal variable to type Dog. What we're saying to
				// the compiler is, "We know it's really referring to a Dog
				// object, so it's okay to make a new Dog reference variable to
				// refer to that object.

			}

			Animal animal2 = new Animal();
			Dog d2 = (Dog) animal;
			d2.makeNoise();// Throw runtime type cast exception
			// It's important to know that the compiler is forced to trust us
			// when we do a downcast, even when we screw up:

		}
		
		
		Animal animal = new Animal();
		Dog d = (Dog) animal;
		//String s = (String) animal; // animal can't EVER be a String
		// if the compiler knows with certainty that the cast could not possibly work, compilation will fail.
		
		
		Dog d3 = new Dog();
	    Animal a31 = d3;           // upcast ok with no explicit cast
	    Animal a32 = (Animal) d3;
	    
	    
	    
	    //In this case the compiler needs all of those parentheses, otherwise it thinks it’s been handed an incomplete statement.
	    Animal a5 = new Dog();
        Dog d5 = (Dog) a5;
        d5.playDead();
        //	Can be replaced with this easy-to-read bit of fun:
        Animal a6 = new Dog();
        ((Dog)a6).playDead();
	}
}
