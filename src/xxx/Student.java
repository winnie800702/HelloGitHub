package xxx;

public class Student {
	int score = 90;
	public void play(int hours) {
		score -= hours;
	}
	//hours宣告在方法外,類別裡面,是實體變數,int預設初值為0 ????
	public void study(int hours) {
		score += hours;
	}
	
	//創建兩個student物件,藉由呼叫play()與study()模擬, 顯示分數是否正確
	public static void main(String[] args) {
		Student david = new Student();
		Student james = new Student();
		
		System.out.println(david.score);
		System.out.println(james.score);
		
		david.play(2);
		david.study(6);
		
		james.play(5);
		james.study(2);
		
		
		
		System.out.println("==============");
		
		System.out.println(david.score);
		System.out.println(james.score);
	}

}
