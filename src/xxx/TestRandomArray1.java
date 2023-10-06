package xxx;

import javax.xml.xpath.XPath;

public class TestRandomArray1 {
	
	public static void main(String[] args) {
		// step 1: 建立三個3x3的二維陣列
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		// step 2: 將隨機數字填入到x陣列
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				int r = (int)(Math.random() * 31); //0<r<1,   0<r<31
				x[i][j] = r;
			}
		}
		
		// step 3: 將隨機數字填入到y陣列
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				int r = (int)(Math.random() * 31);
				y[i][j] = r;
			}
		}
		
		// step 4: 將x跟y對應位置的元素加總放進z陣列
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		// step 5: 顯示所有陣列的元素
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==================");
		
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==================");
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==================");
	}
	
	
}
