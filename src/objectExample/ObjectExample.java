package objectExample;

//Refer : http://ideone.com/FBN06D
public class ObjectExample {
	public static void main(String[] args) {
		ObjectExample objectExample = new ObjectExample();
		
		//instance one - Dog1
		Dog dog1 = objectExample.new Dog();
		dog1.setDogName("My name is Dog1");
		System.out.println(dog1.getName());
		
		
		//instance one - Dog2
		Dog dog2 = objectExample.new Dog();
		dog2.setDogName("My name is Dog2");
		System.out.println(dog2.getName());
	}

	public class Dog {

		private String name;

		public void setDogName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}
}
