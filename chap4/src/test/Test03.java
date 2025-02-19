package test;

import java.util.Scanner;

/*
 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
  [결과]
  삼각형의 높이
  3
  
   *
  ***
 *****
*/
public class Test03 {
	public static void main(String[] args) {
		
		System.out.println("삼각형의 높이");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println();
				for(int j=0; j<i+2;j++) {
					if(j>i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				
			};
		}
	}
