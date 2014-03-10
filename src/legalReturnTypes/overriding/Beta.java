package legalReturnTypes.overriding;

//Refer : https://gist.github.com/rajeevprasanna/8501351
public class Beta extends Alpha {
	Beta doStuff(char c) { //return type Beta is sub class of Alpha 
		return new Beta();
	}
	 
}
