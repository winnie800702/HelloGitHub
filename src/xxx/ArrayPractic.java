package xxx;

public class ArrayPractic {
	//int r = (int)(Math.random()*31);產生0 - 30的隨機數字
	// step 1: 建立三個3x3的二維陣列
	// step 2: 將隨機數字填入到x陣列
	// step 3: 將隨機數字填入到y陣列
	public static void main(String[] args) {
		
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		//index從0開始;但length是個數, 所以不會是<=length
		for(int i = 0;i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				x[i][j] = (int)(Math.random()*31);
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		for(int i = 0;i < y.length; i++) {
			for(int j = 0; j < y[i].length; j++) {
				y[i][j] = (int)(Math.random()*31);
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		for(int i = 0;i < z.length; i++) {
			for(int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	

}
