package chap4;
/*
 * 화면에서 자연수를 입력받아서 각 자리수의 합을 구하기
 * [결과]
 * 자연수 입력 : 123
 * 자리수합 : 6
 */

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		
		System.out.print("자연수 입력 : ");
		Scanner scan = new Scanner(System.in);
		String snum = scan.next();
		int sum = 0;
		
		for(int i=0; i<snum.length();i++) {
			sum += snum.charAt(i) - '0';
			/*
			 * snum = "123"
			 * snum.charAt(0) = '1' (코드값)
			 * '1' - '0' = 1
			 * '2' - '0' = 2
			 */
		}
		System.out.println(snum + " 숫자의 자리수 합: "+ sum);
		

	}

}
