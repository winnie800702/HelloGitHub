package Test2;

public class Classroom extends Thread {
	private int no;
	private String tName;
	
	public Classroom(int no, String tName) {
		this.no = no;
		this.tName = tName;
	}
	
	public void run() {
		System.out.println(no + "教室, " + tName + " 開始上課");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(no + "教室, " + tName + " 下課了");
	}
}
