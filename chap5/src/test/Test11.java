package test;

import java.util.Scanner;

/*
 
10진수를 2,8,10,16 진수로 변경하기
[결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10

*/
public class Test11 {
	public static void main(String[] args) {
		
		System.out.println("10진수 값을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//2진수 변환
		int divnum = num;
		int binary[] = new int[32];
		int index =0;
		while(divnum>0) {
			binary[index++]=divnum%2;   //먼저 값 넣고, index증가
			divnum/=2;
		}
		System.out.print(num + "의 2진수 : ");
		for(int i = index-1; i>=0; i--)
			System.out.print(binary[i]);
		System.out.println();
		
		//8진수 변환
		divnum = num;
		int octal[] = new int[10];
		index =0;
		while(divnum>0) {
			octal[index++]=divnum%8;
			divnum/=8;
		}
		System.out.print(num + "의 8진수 : ");
		for(int i = index-1; i>=0; i--)
			System.out.print(octal[i]);
		System.out.println();
		
		//10진수
		System.out.print(num + "의 10진수 : "+ num);
		System.out.println();
		//16진수
		char data[]="123456789ABCDEF".toCharArray();
		divnum = num;
		char hex[] = new char[8];
		index=0;
		while(divnum>0) {
			hex[index++]=data[divnum%16];
			divnum/=16;
		}
		System.out.print(num + "의 16진수 : ");
		for(int i = index-1; i>=0; i--)
			System.out.print(hex[i]);
		System.out.println();
		
		

	}
}
