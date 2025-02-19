package test;

import java.util.Scanner;

/*
나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
성인(19세 초과)인지 출력하세요.
[결과]
나이 : 19
청소년
*/
public class Test10 {
	public static void main(String[] args) {
		
		System.out.print("나이 : ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		String s = (age<=13?"어린이":(age<=19)?"청소년":"성인");
		System.out.println(s);
	}
}