package xxx;

public class CubeTest {
	
	public static void main(String[] args) {
		try {
//			Cube c1 = new Cube(0);
//			System.out.println(c1.getVolume());
			
			Cube c2 = new Cube();
			c2.setLength(-2);
			System.out.println(c2.getVolume());
		} catch (CubeException e) {
			e.printStackTrace();
		}
	}
}
