package test;

import java.util.Scanner;

/*
 *  농장에 강아지,병아리가 있음.
 *  강아지 병아리 전체 마리수 입력받고
 *  강아지 다리수와 병아리 다리수 전체를 입력받는다.
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  20
 *  강아지 병아리 전체 다리수를 입력하세요
 *  30
 *  
 *  강아지 : xx마리
 *  병아리 : yy마리
 *  
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  10
 *  강아지 병아리 전체 다리수를 입력하세요
 *  10
 *   
 *  계산안됨 
 */
public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("강아지 병아리 마리수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("강아지 병아리 전체 다리수를 입력하세요");
		int leg = scan.nextInt();
		int x,y=0;
		
		
		for(int i =0; i<num; i++) {
			
			y++;
			x=num-y;
			
			if(x*4+y*2==leg) {
				System.out.println("강아지 : "+ x + "마리");
				System.out.println("병아리 : "+ y + "마리");
				break;
		}
			if(i==num-1) {
				System.out.println("계산안됨");
			}
		}
		
		
		

	}
}
