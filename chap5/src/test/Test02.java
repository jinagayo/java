package test;

import java.util.Scanner;

/*
 * 숫자 맞추기
 * 컴퓨터가 1~100 사이의 임의의 정수를 저장하고,
 * 사용자는 숫자를 입력하여 컴퓨터 저장한 숫자를 맞추기
 * 시스템 : 37 가정
 * [결과]
 * 1~100사이의 숫자를 입력하세요
 * 50
 * 작은수입니다.
 * 25
 * 큰수입니다.
 * 40
 * 작은수입니다.
 * 37
 * 정답입니다. 
 * 프로그램종료합니다.
 */
public class Test02 {
	public static void main(String[] args) {
		
		int system = (int)(Math.random()*100)+1;
		System.out.println(system);
		
		System.out.println("1~100사이의 숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int n=scan.nextInt();
			if(n<system)
				System.out.println("큰수입니다.");
			else if(n>system)
				System.out.println("작은수입니다.");
			else {
				System.out.println("정답입니다");
				break;
			}
		}
		System.out.println("프로그램종료합니다.");
		

	}
}