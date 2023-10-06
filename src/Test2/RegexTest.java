package Test2;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		String regex = "^09\\d\\d-[0-9]{6}$"; //設定輸入格式必須為09XX - XXX - XXX
		Scanner sc = new Scanner(System.in);
		String tel = sc.next();
		if(tel.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("No good");
		}
	}

}
