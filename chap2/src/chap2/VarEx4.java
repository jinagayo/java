package chap2;
/*
 * 리터럴에 붇는 접미사
 */

public class VarEx4 {

	public static void main(String[] args) {
		
		long l1 =100;
		float f1 =l1;
		System.out.println("f1="+f1);
	//	l1 = f1;    명시적 형변환 필요
		l1 = 100L;
	//	int i1 =100L;   long => int 형변환
	//	f1 = 10.0; // 실수형 리터널의 기본 자료형은 double임. 명시적형변환 필요
		f1 = (float)10.0;
		f1 = 10.0F; //  F : float형 리터널을 의미
		/*
		 * 리터널에 사용되는 접미사   (자바에서 유일하게 대소문자 구분 없음)
		 * L,l : long형 리터널
		 * F,f : float형 리터널
		 * D,d : double형 리터널
		 */
	}

}
