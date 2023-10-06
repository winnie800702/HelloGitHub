package xxx;



public class PolyAnimal {
	public static void main(String[] args) {
		Animal[] e = new Animal[2];
		//Elephant(int age, float weight, String name)
		e[0] = new Elephant(5, 5.0f, "EEE");
		e[1] = new Animal(2,4.0f);
		// 因為speak 本來就有 print功能, 所以不用:System.out.println(e[0].speak());
		e[0].speak();
				
	}


}
