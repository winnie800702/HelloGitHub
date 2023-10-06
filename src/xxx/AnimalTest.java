package xxx;

public class AnimalTest {
	
	public static void main(String[] args) {
//		Animal a1 = new Animal(2, 5.0f);
//		a1.speak();
//		
//		System.out.println("=== 時光飛逝 歲月如梭, 轉眼三年過去了... ===");
		
//		a1.age = 5;
//		a1.weight = 25.0f;
		
//		a1.Animal(5, 25.0f);
		
//		a1 = new Animal(5, 25.0f);
//		a1.speak();
		
//		a1.setAge(5);
//		a1.setWeight(25.0f);
//		a1.speak();
		
		//用new 關鍵字呼叫建構子Animal, 並給訂參數, 產生一個物件a1
		Animal a1 = new Animal(3, 8.0f);
		//用new 關鍵字呼叫建構子Elephant, 並給訂參數, 產生一個物件e1
		Elephant e1 = new Elephant(8, 1200.0f, "David");
		
		a1.speak();
		e1.speak();
		
		
		
		
		
		
	}
}