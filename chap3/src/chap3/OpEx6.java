package chap3;
/*
 * 조건연산자(삼항연산자): 조건문으로 변경이 가능
 * (조건문) ? 참 : 거짓
 * 
 * 조건문: 결과가 boolean인 문장
 */

import java.util.Scanner;

public class OpEx6 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println( score + "점은 "+((score >= 60)? "합격" : "불합격"));
		
		// 70점은 합격, 60점대: 재시험, 60점 미만: 불합격
		String result = (score >= 70)?"합격":(score >= 60)?"재시험":"불합격";
		System.out.println( score + "점은 " + result);
		System.out.println( score + "점은 " + ((score >= 70)?"합격":(score >= 60)?"재시험":"불합격"));  // 논리 연산자는 산술 연산자보다 우선순위가 낮으므로 괄호 필요

	}

}
