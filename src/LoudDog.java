
public class LoudDog extends Dog {

	public LoudDog(String petName) {
		super(petName);
		// TODO Auto-generated constructor stub
	}
	
	public String speak() {
		return super.speak() + super.speak();
		//could also say dog_sound + dog_sound
	}
	
}
