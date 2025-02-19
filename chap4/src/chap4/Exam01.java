package chap4;
/*
 * 숫자를 입력 받아서
 * 1. 양수, 음수, 영 출력
 * 2. 짝수, 홀수 출력하기
 * if 조건문으로 구현하기
 */

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s1, s2;
		
		if(n>0) {
			s1 = "양수";
		}else if(n<0) {
			s1 = "음수";
		}else {
			s1 = "영";
		}
		
		if(n%2 == 0) {
			s2="짝수";
		}else {
			s2="홀수";
		}
		
		System.out.println(n + "은 " + s1 +", "+s2);

	}

}
