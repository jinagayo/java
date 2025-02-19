package test;
//  반지름을 입력받아 원의 둘레와 면적을 구하시오

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		
		System.out.println("반지름을 입력하시오");
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double pi = 3.141592;
		
		System.out.println("원의 둘레는 "+ 2*pi*r);
		System.out.println("원의 넓이는 "+ pi*r*r);
	}
}