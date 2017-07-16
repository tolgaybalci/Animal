
public class Cat extends Mammal implements Carnivore {

	private String furColor;
	private String catPsychology;

	public Cat(String name, String eyeColor, int age, String furColor, String catPsychology) {
		super(name, eyeColor, age);
		this.furColor = furColor;
		this.catPsychology = catPsychology;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public String getCatPsychology() {
		return catPsychology;
	}

	public void setCatPsychology(String catPsychology) {
		this.catPsychology = catPsychology;
	}

	public void meow() {
		System.out.println(name + " miyavlıyor.");
	}

	public void claw() {
		System.out.println(name + " tırmalıyor.");
	}

	@Override
	public void hunt() {
		System.out.println(name + " avlanıyor");
		
	}
}
