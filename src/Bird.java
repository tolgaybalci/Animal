
public abstract class Bird extends Animal{

	public Bird(String name, String eyeColor, int age) {
		super(name, eyeColor, age);
	}

	public void fly() {
		System.out.println(name + " uçuyor.");
	}
}
