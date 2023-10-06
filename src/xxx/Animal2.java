package xxx;

public class Animal2 {
	private int age;
	private float weight;
	
	public Animal2(int age,float weight ) {
		this.age = age;
		this.weight = weight;
	}
	public void speak() {
		System.out.println("年紀是" + age);
		System.out.println("體重是" + weight);
	}
	
	public static void main(String[] args) {
		Animal2 lion = new Animal2(2, 5.0f);
		lion.speak();
	}

}
