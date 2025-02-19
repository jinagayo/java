package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수인 경우는 양수, 음수인 경우 음수, 0인 경우 영 출력하기
 * 짝수인지 홀수인지 출력하기
 * [결과]
 * 숫자를 입력하세요
 * 10
 * 10: 양수
 * 10: 짝수
 * 
 */
public class Exam3 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		String s1 = (num > 0 ? "양수" : num == 0 ? "영" : "음수");
		System.out.println(num + ": " + s1);
		
		String s2 = ((num % 2 ==0) ? "짝수" : "홀수");
		System.out.println(num + ": " + s2);

	}

}
