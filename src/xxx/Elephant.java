package xxx;

public class Elephant extends Animal {
	private String name;
	//建構子名稱需與class相同是Elephant
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	// 此方法改寫失敗但不會有語法錯誤提示
	// 被Java編譯器當成overloading(覆載)
	// 1. speak() 2. speak(int data)
//	public void speak(int data) {
//		super.speak();
//		System.out.println("Name is = " + name);
//	}
	
	// JDK 5的 Annotation (標註) : 給Java相關工具或框架看的資訊
	// 讓編譯器對此方法的檢查是用override規則, 讓我們寫code更為安全
	@Override
	public void speak() {
		super.speak();
		System.out.println("Name is = " + name);
	}

}
