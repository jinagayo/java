package test;
/*
키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.

이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
  정수 : nextInt()
  실수 : nextDouble()
  String : next()
[결과]
이름 : 김명신
학년(숫자만) : 3
반(숫자만) : 15
번호(숫자만) : 1
성별(M/F) : F
성적(소수점 아래 둘째 자리까지) : 95.75
3학년 15반 1번 김명신 여학생의 성적은 95.75이다.


*/

import java.io.IOException;
import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("이름 : ");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.next();
		
		System.out.print("학년(숫자만) : ");
		Scanner scan2 = new Scanner(System.in);
		int y = scan2.nextInt();
		
		System.out.print("반(숫자만) : ");
		Scanner scan3 = new Scanner(System.in);
		int c = scan3.nextInt();
		
		System.out.print("번호(숫자만) : ");
		Scanner scan4 = new Scanner(System.in);
		int n = scan4.nextInt();
		
		System.out.print("성별(M/F) : ");
		char s = (char) System.in.read();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		Scanner scan6 = new Scanner(System.in);
		double g = scan6.nextDouble();
		
		//3학년 15반 1번 김명신 여학생의 성적은 95.75이다.
		System.out.println(y+"학년 " + c + "반 " + n + "번 "+ name + (s=='F'?" 여학생":" 남학생")+"의 성적은 "+ g+"이다.");
		
		
		
	}
}