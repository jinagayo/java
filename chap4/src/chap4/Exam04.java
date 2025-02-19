package chap4;
/*
 * 1~100까지 짝수의 합을 구하기.
 * for
 * while
 * do while
 */

public class Exam04 {

	public static void main(String[] args) {
		int sum=0;
		
		//for문 활용
		for(int i=0; i<=100; i+=2) {
			sum+=i;
		}
		System.out.println("짝수의 합은: "+sum);
		
		
		// while문 활용
		int a = 1;
		sum=0;
		while(a<=100) {
			if(a%2==0)
				sum+=a;
			a++;
		}
		System.out.println("짝수의 합은: "+sum);
		
		
		// do While문 활용
		sum=0;
		int b=1;
		do {
			if(b%2==0)
				sum+=b;
			b++;
			
			
		}while(b<=100);
		
		System.out.println("짝수의 합은: "+sum);

	}

}
