package Test2;

public class Tibame {
	
	public static void main(String[] args) {
		System.out.println("Tibame開門了");
		Classroom c1 = new Classroom(804, "小吳");
		Classroom c2 = new Classroom(805, "大吳");
		Classroom c3 = new Classroom(803, "郭老");
		
		c1.start();
		c2.start();
		c3.start();
		
		try {
			c1.join();  //用join控制
			c2.join();
			c3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Tibame關門了");
	}

}
