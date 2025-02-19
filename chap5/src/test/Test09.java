package test;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test09 {
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int x = num;
		int n = (""+num).length();
		int a[] = new int[n];
		
		for(int i=0; x!=0; i++) {
			a[i]=x%10;
			x/=10;
		}
		
		for(int i=0; i<=n/2; i++) {
		if(a[i]==a[n-1-i]) continue;
		else {
			System.out.println(num + " : "+"대칭수 아님");
			return;
		}
		
		}
		System.out.println(num + " : "+"대칭수");
		
		
		
	
	}
}