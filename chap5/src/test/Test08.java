package test;

import java.util.Scanner;

/*
삼각형의 높이를 홀수로 입력하세요
5

*****
 ***
  *
 ***
*****
 
 */
public class Test08 {
	public static void main(String[] args) {
		
		System.out.println("삼각형의 높이를 홀수로 입력하세요");
		Scanner scan =new Scanner(System.in);
		int h = scan.nextInt();
		
		int b = h*2-1;
		int m = b/2;
		
		for(int i=h; i>0; i--) {
			for(int j=0; j<b; j++) {
					   if(j > m-i && j< m+i) 
						   System.out.print("*");
					   else
						   System.out.print(" ");
				   }
			System.out.println();
			}
		
		for(int i=1;i<h;i++) {
			   for(int j=0;j<b;j++) {
				   if(j >= m-i && j<= m+i) 
					   System.out.print("*");
				   else
					   System.out.print(" ");
			   }
			   System.out.println();
			}

	}
}