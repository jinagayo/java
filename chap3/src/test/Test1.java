package test;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원 : 4개
 * 1원  : 1개
 */
public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		
		int a = value/500;
		int b = (value - a*500)/100;
		int c = (value - a*500 - b*100)/50;
		int d = (value - a*500 - b*100 - c*50)/10;
		int e = value - a*500 - b*100 - c*50 - d*10;

		
		System.out.println("500원 : "+a+ "개");
		System.out.println("100원 : "+b+ "개");
		System.out.println("50원 : "+c+ "개");
		System.out.println("10원 : "+d+ "개");
		System.out.println("1원 : "+e+ "개");
		
		
			
		
	}

}

