package xxx;

public class TestRandomArray2 {
	
	public static void main(String[] args) {
		TestRandomArray2 tra = new TestRandomArray2();
		int[][] x = tra.getRandomArray();
		int[][] y = tra.getRandomArray();
		int[][] z = new int[3][3];
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		tra.printArray(x);
		tra.printArray(y);
		tra.printArray(z);
	}
	
	public int[][] getRandomArray() {
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				int r = (int)(Math.random() * 31);
				data[i][j] = r;
			}
		}
		return data;
	}
	
	public void printArray(int[][] xxx) {
		for (int i = 0; i < xxx.length; i++) {
			for (int j = 0; j < xxx[i].length; j++) {
				System.out.print(xxx[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==================");
	}
	
}
