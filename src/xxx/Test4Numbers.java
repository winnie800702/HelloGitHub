package xxx;

public class Test4Numbers {
	public static void main(String[] args) {
		
		
		int num=0;
		while (num<100) {
			num+=4;
			System.out.print(num+" ");
					
		}
		System.out.println();
		
		for (int i=0;i<=100;i++) {
			if(i%4==0)
				System.out.print(i+" ");
		}
		
		System.out.println();	
		
		for (int i=0;i<=100;i+=4) {
			System.out.print(i+" ");
			
		}
	}
//  while
//  int sum = 0;
//  int count = 1;
//  while ( count <= 10) {
//       sum += count;
//       count++;
//  }

}
