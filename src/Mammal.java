
public abstract class Mammal extends Animal{

	public Mammal(String name, String eyeColor, int age) {
		super(name, eyeColor, age);
	}

	public void giveBirth() {
		
		System.out.println(name + " doğuruyor");
	}
}
