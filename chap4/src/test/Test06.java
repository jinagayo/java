package test;

import java.util.Scanner;

/*
점수를 입력받아 
    95점 이상인 경우 A+ 90 ~ 94 : A0  
    89 ~ 85점 이상인 경우 B+ 80 ~ 84 : B0 
    79 ~ 75점 이상인 경우 C+ 70 ~ 74 : C0 
    69 ~ 65점 이상인 경우 D+ 60 ~ 64 : D0 
       그외는 F 로 출력하기.
    중첩 조건문을 이용하여 구현하기 
*/
public class Test06 {
	public static void main(String[] args) {
		
		System.out.println("점수를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String s = null;
		if(score>=90) {
			if(score>=95)
				s="A+";
			else
				s="A0";
		}else if(score>=80) {
			if(score>=85)
				s="B+";
			else
				s="B0";
		}else if(score>=70) {
			if(score>=75) 
				s="C+";
			else
				s="C0";
		}else if(score>=60) {
			if(score>=65)
				s="D+";
			else
				s="D0";
		} else
			s="F";
		
		System.out.println("학점: "+s);
	}
}
