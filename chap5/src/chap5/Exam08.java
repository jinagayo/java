package chap5;

import java.util.Scanner;

/*
 * Exam07 예제와 같은 기능을 하는 프로그램을 작성하는데
 * 행의 크기를 입력받아서 처리하기
 */

public class Exam08 {

	public static void main(String[] args) {
		
		System.out.print("행의 크기를 입력하시오 ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		//1. 가변배열 생성
				int arr[][]= new int[x][];
				//2. 각 행의 1차원 배열의 객체 생성
				for(int i=0; i<arr.length; i++) {
					arr[i]= new int[i+1];
				}
				//3. arr 배열에 숫자값 저장하기
				int n=0;
				for(int j=x-1; j>=0; j--) {
					for(int i=j; i<=x-1; i++) {
						arr[i][j]=++n;
					}
				}
				//4. arr 배열의 값을 출력
				//arr : 2차원배열의 참조변수
				//      2차원배열의 요소의 자료형 1차원배열의 참조변수
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length;j++) {
						System.out.printf("%3d",arr[i][j]);
					}
					System.out.println();
				}
				

}
}
