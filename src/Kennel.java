import java.util.ArrayList;
import java.util.List;

public class Kennel {
	private List<Pet> petList;
	/** For every Pet in the kennel, print the name followed by
	 * the result of a call to its speak method, one line per Pet
	 */
	
	public void allSpeak(){
		/* code goes here */
		for (Pet a: petList) {
			System.out.println(a.getName() + " " + a.speak()); 
			}
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Pawper");
		Cat cat = new Cat("Juniper");
		LoudDog louddog = new LoudDog("Mamamoo");
		
		Kennel kennel = new Kennel();
		kennel.petList = new ArrayList<Pet>();
		
		kennel.petList.add(dog);
		kennel.petList.add(cat);
		kennel.petList.add(louddog);
		
		kennel.allSpeak();
	}
	
}
