package test;
/*
*  키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
* 
* [결과]
* 첫 번째 정수를 입력하세요 : 23
* 두 번째 정수를 입력하세요 : 7
* 더하기 결과 : 30
* 빼기 결과 : 16
* 곱하기 결과 : 161
* 나누기 몫 결과 : 3
*/

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		System.out.print("첫 번째 정수를 입력하세요: ");
		Scanner scan1 = new Scanner(System.in);
		int a = scan1.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		Scanner scan2 = new Scanner(System.in);
		int b = scan2.nextInt();
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		System.out.println("더하기 결과 :" + sum);
		System.out.println("빼기 결과 :" + sub);
		System.out.println("곱하기 결과 :" + mul);
		System.out.println("나누기 몫 결과 :" + div);

	}
}