package chap3;
/*
 * 이항 연산자
 * 	산술 연산자 : +,-,*,/,%(나머지)
 */

public class OpEx3 {

	public static void main(String[] args) {
		
		int x=10, y=8;
		System.out.println("10+8="+(x+y));
		System.out.println("10-8="+(x-y));
		System.out.println("10*8="+(x*y));
		System.out.println("10/8="+(x/y));   // int 형 연산의 결과는 int
		System.out.println("10%8="+(x%y));	 // 나머지. 2
		
		//나누기
		System.out.println("10/8="+(x/y));
		System.out.println("-10/8="+(-x/y));
		System.out.println("10/-8="+(x/-y));
		System.out.println("-10/-8="+(-x/-y));
		
		//나머지
		System.out.println("10%8="+(x%y));
		System.out.println("-10%8="+(-x%y));
		System.out.println("10%-8="+(x%-y));      // 10: 피제수,   8: 제수    나머지의 결과는 피제수의 부호를 따라간다. (결과값 10%-1 = 2)
		System.out.println("-10%-8="+(-x%-y));    // (결과값 -10%-8 = -2)
	}

}
