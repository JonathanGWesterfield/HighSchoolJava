public class Animal
{
	private String family;
	
	public Animal(String family) {
		this.family = family;
	}
	
	public void speak() {
		System.out.println("I am a " + family + ".");
	}
}