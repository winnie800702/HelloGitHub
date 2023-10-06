package xxx;

public class WeightTest {
	public static void main(String[] args) {
		Weighter[] w= new Weighter[3];
		//使用共同型別Weighter來代表各種子類別物件 page178
		//之後可以呼叫Weighter裡面的方法
		w[0] = new Powder();
		w[1] = new Dog();
		w[2] = new Plane();
		
		for(int i =0; i < w.length; i++ ) {
			w[i].printWeightTool();
		}		
		
	}

}
