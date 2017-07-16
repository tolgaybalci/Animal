
public class Owl extends Bird implements Herbivore, Carnivore {

	public Owl(String name, String eyeColor, int age) {
		super(name, eyeColor, age);
		// TODO Auto-generated constructor stub
	}

	public void rotateHand270Degree() {
		System.out.println("Baykuş kafasını 270 derece döndürüyor.");
	}

	@Override
	public void hunt() {
		System.out.println(name + " uçarak avlanıyor");
		
	}

	@Override
	public void findPlants() {
		System.out.println(name + " uçarak bitki buluyor");
		
	}
}
