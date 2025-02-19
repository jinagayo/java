package chap4;

import java.util.Scanner;

/*
 * if else 조건문
 * if(조건식) {
 * 	조건식이 참인 경우 실행되는 문장들
 * }else {
 * 	조건식이 거짓인 경우 실행되는 문장들)
 * 
 * if / else if / else
 * if(조건식1) {
 * 	조건식 1이 참인 경우 실행되는 문장
 * }else if(조건식2){\
 * {else if(조건식3){
 * 
 */
public class IFEx02 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score>=60) {
			System.out.println("합격을 축하합니다.");
		}else {
			System.out.println("불합격 입니다.");
		}
	}
}
		
	

