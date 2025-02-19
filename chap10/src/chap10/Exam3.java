package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 1~10 사이의 숫자를 입력받아, 숫자만큰 * 출력하기
 * 입력값이 숫자 아닌 경우 InputMismatchException 예외가 발생함.
 * 예외 발생시 숫자만 입력하세요. 메세지 출력하기. 다시 숫자를 입력받기
 * catch.scan.next(); 추가하기
 * 
 * 1~10사이의 숫자가 아닌 경우 NumberInputException 클래스의 예외를 강제 발생하고 
 * 다시 숫자를 입력받기
 */

class NumberInputException extends RuntimeException{
	NumberInputException(String msg){
		super(msg);
	}
}
public class Exam3 {

	public static void main(String[] args) {
		
		System.out.println("1~10 사이의 숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		while(true) {
		try {
		num = scan.nextInt();
		if(num < 1 || num >10)
			throw new NumberInputException("1에서 10 사이의 숫자를 입력하세요");
		System.out.print(num + ":");
		for(int i=0; i<num; i++) {
			System.out.print("*");
		}
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력하세요");
			scan.next();    //버퍼 비우기 용(입력된 문자 없애기). 정수를 입력받을 때까지 계속 반복하기위해
		}catch(NumberInputException e) {
			System.out.println(e.getMessage());
		
		
			
		}
	}

	}}

