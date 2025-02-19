package chap4;
/*
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * 
 * [결과]
 * 삼각형의 높이: 3
     *
     **
     ***
 */

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		System.out.print("삼각형의 높이: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//1.
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2.
		System.out.println();

		for(int i=n; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//3.
		for(int i=n; i>0; i--) {
			for(int j=1; j<=n; j++) {
				if(j>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//4.
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j>=i) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();

	}

}
