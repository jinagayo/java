package test;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1

높이: 홀수의 합
 
*/
public class Test06 {
	public static void main(String[] args) {
		
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
	
		int b = h*2-1; //바닥의 갯수
		int m = b/2;   //* 중간 인덱스. 
		int a = h*h;
		for(int i=0;i<h;i++) {
		   for(int j=0;j<b;j++) {
			   if(j >= m-i && j<= m+i) 
				   System.out.print(a--+"\t");
			  //   System.out.printf("%4f",a--);
			   //   $4d: 출력서식문자.    %nd :n자리를 확보해서 10진 정수 출력
			   else
				   System.out.print(" \t");
			  //   System.out.printf("%4c",' ');
			   //   %4c  :  %nc  : n자리만큼 문자출력
			   //   %4s  :  %ns  : n자리를 확보해서 문자열 출력
		   }
		System.out.println();
		
	}
}
}