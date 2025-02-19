package chap2;
/*
 * 다음 결과가 나오도록 Exam2 프로그램 수정하기
 * [결과]
 * f=1.5
 * l=27000000000
 * result=true
 */

public class Exam2 {

	public static void main(String[] args) {
		
		float f = 3/2;   				// int 연산(/나누기)  int => 결과 int
		float f1 = 3f /2;				// int 연산(/나누기) float => float
		long l = 3000*3000*3000;		// int 연산(*곱하기) int 연산(*곱하기) => int   // int값의 범위 초과
		long l1 = 3000L*3000*3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d==f2;			// 자료형이 달라서 문제가 생김 
		boolean result1 = (float)d==f2;
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);

	}

}
