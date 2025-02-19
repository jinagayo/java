package test;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
5
15	14	13	12	11	
	10	9	8	7	
		6	5	4	
			3	2	
				1
 */
public class Test12 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
	
		int a=0;
		for(int i=0;(n-i)>0;i++) {
			a+=(n-i);
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j>=i) {
				System.out.print(a+"\t");
				a--;
				}else System.out.print(" "+"\t");
			}
			System.out.println();
		}
		
	}
}
