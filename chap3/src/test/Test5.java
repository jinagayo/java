package test;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=15.0
 */
public class Test5 {
	public static void main(String[] args) {
		
		System.out.println("밑변의 길이");
		Scanner scan1 = new Scanner(System.in);
		double a = scan1.nextDouble();
		
		System.out.println("높이의 길이");
		Scanner scan2 = new Scanner(System.in);
		double b = scan2.nextDouble();
		
		double s = a*b/2;
		
		System.out.println("넓이="+ s);

	}
}