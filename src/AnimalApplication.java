
public class AnimalApplication {
	
	public static void main(String[] args) {
		Cat sari = new Cat("Sarı", "Sarı", 3, "Sarı", "Efendi kedi");
		Dog fides = new Dog("Fides", "Yeşil", 0);
		Owl hedwig = new Owl("Hedwig","Yeşil", 8);
		
		sari.meow();
		sari.eat();
		sari.breath();
		sari.hunt();
		
		System.out.println(sari.getCatPsychology());
		
		fides.bark();
		fides.hunt();
		
		hedwig.fly();
	}

}
