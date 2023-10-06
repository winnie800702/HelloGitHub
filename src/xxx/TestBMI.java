package xxx;

public class TestBMI {
	public static void main(String[] args) {
		Double BMI=48/(1.53*1.53);
		
		if(BMI>24.0) {
			System.out.println("過胖");
		}
		else if(BMI>=18.5 && BMI<=24) {
			System.out.println("正常");
			
		}
		else {
			System.out.println("過瘦");
		}
		
		//step1:建立身高/體重資料
		double height=1.53, weight=48;
		double bmi=weight/Math.pow(height, 2);//平方
		//step2:運算得到BMI結果
		System.out.println("BMI = "+bmi);
		System.out.printf("BMI = %.3f%n",bmi); 
		//用printf非println不會自動換行,可加%n來換行
		//f代表format(格式),%可以帶入格式.2(只取小數二位),f是浮點數
		//step3:根據BMI顯示結果
		if (bmi<18.5) {
			System.out.println("過瘦");
		}else if (bmi>=18.5 && bmi<=24) {
			System.out.println("正常");
		}
		else {
			System.out.println("過重");
		}
		
		
		
	}
	
	

}
