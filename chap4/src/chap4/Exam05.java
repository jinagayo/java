package chap4;
/*
 * 화면에서 자연수를 입력받아서 각 자리수의 합을 구하기
 * [결과]
 * 자연수 입력 : 123
 * 자리수합 : 6
 */

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		
		System.out.print("자연수 입력 : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp = n;
		int sum = 0;
		
		while(temp>0) {
			sum+=temp%10;
			temp /= 10;
		}
		System.out.println(n + " 숫자의 자리 합 :" + sum);
		
		
	}
}
