
public abstract class Animal {

	protected String name;
	protected String eyeColor;
	protected int age;

	public Animal(String name, String eyeColor, int age) {
		this.name = name;
		this.eyeColor = eyeColor;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void breath() {
		System.out.println(name + " nefes alıyor");
		
	}
	
	public void eat() {
		System.out.println(name + " yemek yiyor");
	}
	
	public void sleep() {
		System.out.println(name + " uyuyor");
	}

}
