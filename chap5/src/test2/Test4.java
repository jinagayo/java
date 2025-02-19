package test2;

import java.util.Scanner;

/*
 [결과]
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>1
학생수>5
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>2
scores[0]>100
scores[1]>50
scores[2]>80
scores[3]>75
scores[4]>95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>3
score[0]:100
score[1]:50
score[2]:80
score[3]:75
score[4]:95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>4
최고 점수:100
평균 점수:80.0
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>5
프로그램 종료
 */
public class Test4 {
	public static void main(String[] args) {
		
		int n=0;
		int scores[];
		int a=0;
		
		while(true) {
			System.out.println("---------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종류");
			System.out.println("---------------");
			System.out.print("선택>");
			
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			
		
}
}}