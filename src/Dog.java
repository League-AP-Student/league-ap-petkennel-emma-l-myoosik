
public class Dog extends Pet{
	String dog_sound = "bark";
	
	public Dog(String petName) {
		super (petName);
	}
	
	public String speak(){
		return dog_sound;
	}
}
