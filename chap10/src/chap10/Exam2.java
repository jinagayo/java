package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 정수형 숫자를 입력받아서 정수형 숫자인 경우 숫자만큼 *를 출력하고
 * 정수형 숫자가 아닌 경우 숫자만 입력하세요 메세지 출력하기. 숫자가 입력될때 까지 입력받기
 * 
 * Scanner scan = new Scanner(System.in);
 * int num = scan.nextInt(); <= 정수 입력이 아닌 경우 InputMismatchException 예외 발생함
 */
public class Exam2 {

	public static void main(String[] args) {
		System.out.println("화면에 정수를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(true) {
		try {
		num = scan.nextInt();
		for(int i=0; i<num; i++)
			System.out.print("*");
		break;
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력하세요");
			scan.next();    //버퍼 비우기 용(입력된 문자 없애기). 정수를 입력받을 때까지 계속 반복하기위해
		}
		
		}
	}

}
