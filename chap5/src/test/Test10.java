package test;
/*
다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.

[결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.

*/

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		System.out.println("숫자만 입력하세요");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] ch = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			
			ch[i]=s.charAt(i);     //음수 고려 보충
			if(ch[i]>='0'&&ch[i]<='9') {
				continue;
			}
			else {
				System.out.println(s+"는 숫자가 아닙니다.");
				return;
			}
		}
		System.out.println(s+"는 숫자 입니다.");

	}

}
