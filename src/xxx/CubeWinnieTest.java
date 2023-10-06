package xxx;

import java.util.Scanner;

public class CubeWinnieTest extends CubeWinnie{
	public static void main(String[] args) throws CubeException{
		Scanner sc = new Scanner(System.in);
		double length = sc.nextInt();
		try {
			CubeWinnie cube1 = new CubeWinnie();		
			System.out.println(cube1.getVolume(length));
		}catch (CubeException e){
			System.out.println(e.getMessage());
		}



		
	}
	


}
