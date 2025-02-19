package chap4;

import java.util.Scanner;

/*
 * 1,2,3 중 한 개의 임의의 값을 생성하여
 * 1: 가위
 * 2: 바위
 * 3: 보자기
 * 출력하기
 * 
 * 시스템 사용자
 *  1    1     비김
 *  2    1     시스템승리
 *  1    2     사용자승리
 */

public class Exam03 {

	public static void main(String[] args) {
		
		//사용자 입력 부분
		System.out.println("1(가위), 2(바위), 3(보자기) 중 한개를 입력하세요");
		Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
       //화면 출력용 데이터를 저장할 변수 선언  **String은 선언시 반드시 초기화
        String u = null;
        
        
        switch(user) {  // 화면 출력용 데이터 저장
        case 1: u = "가위"; break;
        case 2: u = "바위"; break;
        case 3: u = "보자기"; break;
        }
        
        //시스템이 저장한 값
		int system = (int)(Math.random()*3)+1;
		//화면 출력용 데이터를 저장할 변수 선언  **String은 선언시 반드시 초기화
		String s = null;
		
		switch(system) {  // 화면 출력용 데이터 저장
        case 1: s = "가위"; break;
        case 2: s = "바위"; break;
        case 3: s = "보자기"; break;
		}
		
		System.out.println("시스템\t사용자");
		System.out.print(s +"\t" + u +"\t");
		
		if(u == s) System.out.println("비김");
		
		switch(system) {
		case 1 : if(user ==2) System.out.println("사용자승리");
		         if(user ==3) System.out.println("시스템승리");
		         break;
		         
		case 2 : if(user ==3) System.out.println("사용자승리");
        		 if(user ==1) System.out.println("시스템승리");
                 break;
                 
		case 3 : if(user ==1) System.out.println("사용자승리");
				 if(user ==2) System.out.println("시스템승리");
				 break;
		         
		
		}
		
		

	}}
