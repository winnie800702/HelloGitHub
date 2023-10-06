package xxx;

public class Elephant2 extends Animal2{
	//step1 繼承父類別,宣告變數
	//step2 建立建構子,設定參數 > super(來自父類別的參數1, 參數2.)
	//step3 呼叫來自父類別的方法 > 繼承方法內容: super.方法()
	
	private String name;
	public Elephant2 (int age, float weight, String name) {
	    super(age, weight);
		this.name = name;
	}

	public void speak() {
	super.speak();
	System.out.println("名字是" + name);
		
	}
	
	public static void main(String[] args) {
		Animal2 elephant = new Elephant2(8, 1200.0f, "Pupu");
		elephant.speak();	 
	}
	
	
	

}
