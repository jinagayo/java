package test;

import java.util.Scanner;

/*
1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
     소문자 = 대문자 + 32
     대문자 = 소문자 - 32
     '0'  : 48
     '1' : 49 => 21
     ('1'-'0')+20 = 21
     ('5'-'0')+20 = 25
*/
public class Test02 {
	public static void main(String[] args) {
		
		System.out.println("한개의 문자를 입력하시오");
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		char c = x.charAt(0);
		
		if(c>='A'&&c<='Z') {
			System.out.println(c + " = " + (char)(c+32));
		}else if(c>='a'&&c<='z') {
			System.out.println(c + " = " + (char)(c-32));
		}else if(c>='0'&&c<='9') {
			System.out.println(c + " => " + ((c-'0')+20));
		}else {
			System.out.println("기타문자");
		}

	}
}