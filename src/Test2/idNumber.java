package Test2;

import java.util.Scanner;

public class idNumber {
	public static void main(String[] args) {
		String regex = "^[A-Za-z][1-2]\\d{8}$"; //設定輸入身分證字號F XXX XXX XXX
		//String regex = "^09\\d\\d-[0-9]{6}$"; //設定輸入格式必須為09XX - XXX - XXX
		Scanner sc = new Scanner(System.in);
		String tel = sc.next().toUpperCase();//把輸入的英文自動轉成大寫
		if(tel.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("No good");
		}
	}

}
