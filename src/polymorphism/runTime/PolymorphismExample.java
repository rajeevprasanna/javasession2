package polymorphism.runTime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//https://gist.github.com/rajeevprasanna/8500647
public class PolymorphismExample {
	
	public static void main(String[] args) {
		
		List<Worker> workers = new ArrayList<Worker>();

		// Adding worker one
		Worker worker1 = new Principal();
		workers.add(worker1);

		// Adding worker two
		Worker worker2 = new Teacher();
		workers.add(worker2);
 
		for(Worker worker : workers){
			worker.doIt();
		}
		 
		// op : Principal does the work
		// Teacher does the work

		// If you see carefully, we cannot see which instance is called. We
		// called doIt() method only on the Super type Worker but the JVM finds
		// the proper type and called its implementation of doIt() method. This
		// is Runtime Polymorphism. The JVM determines proper type only at
		// runtime
	}
}
