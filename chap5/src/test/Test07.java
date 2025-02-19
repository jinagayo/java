package test;
/*
삼각형의 높이를 입력하세요
3          i    j
*****      0    0~4
 ***       1    1~3
  *        2    2~2
 
 */

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			
		int b = n*2-1; //*의 최대개수
		int m = b/2;   //* 중간 인덱스. 
		
		
		for(int i=n; i>0; i--) {
			for(int j=0; j<b; j++) {
					   if(j > m-i && j< m+i) 
						   System.out.print("*");
					   else
						   System.out.print(" ");
				   }
			System.out.println();
			}
	
		}

	}
