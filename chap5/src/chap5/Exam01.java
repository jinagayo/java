package chap5;
/*
 * 정수값 5개를 입력받아서
 * 입력받은 수의 합계,평균,최대값,최소값,최대값인덱스값,최소값인덱스값 출력하기
 */

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		System.out.println("정수 5개를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int n[];
		n = new int[5];
		
		for(int i=0; i<n.length; i++) {
			n[i]= scan.nextInt();
		}
		
		int sum=0;
		int max=n[0], min=n[0], maxid=0, minid=0;
		
		
		for(int i=0; i<n.length; i++ ) {
			sum+=n[i];
			if(max<=n[i]) {
				max=n[i];
				maxid=i;
			}
			if(min>=n[i]) {
				min=n[i];
				minid=i;
			}
		}
		double avg=(double)sum/n.length;
		
		System.out.println("합계: "+ sum);
		System.out.println("평균: "+ avg);
		System.out.println("최대값: "+ max);
		System.out.println("최소값: "+ min);
		System.out.println("최대값 인덱스: "+ maxid);
		System.out.println("최소값 인덱스: "+ minid);

	
	}

}
