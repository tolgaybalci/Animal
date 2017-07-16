
public class Dog extends Mammal implements Carnivore {

	public Dog(String name, String eyeColor, int age) {
		super(name, eyeColor, age);
	}

	public void bark() {
		System.out.println("Köpek havlıyor.");
	}

	public void sniff() {

		System.out.println("Köpek kokluyor.");
	}

	@Override
	public void hunt() {
		System.out.println(name + " havlayarak avlanıyor");		
	}
}
