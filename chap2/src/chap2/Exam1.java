package chap2;

public class Exam1 {

	public static void main(String[] args) {
// 1. 잘못된 문장을 골라내고 그 이유를 설명하시오.
		char a='a';   // 정상
//		char b= "a";  //  ''사용해야 함
		char b ='a';  // 정상
		String c="a"; // 정상
//		String d = 'a';  // ""사용해야 함
		String d = "a";  // 정상
//		char e ='ab';   // 문자 2개 사용 안됨
		String e = "ab"; // 정상
		String f ="ab";  // 정상
// 		char g ='';     // char 빈 문자 안됨
		String h="";    // 정상
// 		byte var1 =128;   // 하용 범위 초과
		short var2 = 128; // 정상
//		int car3 =28L;    // L:long 타입의 값.
		long var4 =128L;  // 정상
//   	float var5 = 1.2;  // 1.2값은 기본이 double 형임
		float var5 = 1.2f; // 정상
		double var6 = 1.2; // 정상
		float var9 = '1';  // 정상. 1문자의 ASCII 코드값으로 변환되어 실수형으로 저장 가능
		

	}
	
/*	1. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
	변수 이름으로 사용할 수 있는 것을 고르시오.
	변수이름으로 사용할 수 없는 이유를 작성하시오
	
	A. false
	B. default
	C. var
	D. a-class
	
	=> A,B => 예약어이다. / D => -은 변수 이름으로 사용 불가 , 사용가능특수문자:_, $
	
	2. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
	변수 이름으로 사용할 수 있는 것을 고르시오.
	
	    A. s#arp	     
	    B. static	    
	    C. _class
	    D. class
	    
	    => C.
	    
	3. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
	  => -128 ~ 127
	
	
	4. float 형 변수 선언이 올바르게 된 것을 모두 고르시오.
	
	A. float f1 = 1F;
	B. float f2 = 1.0;   // 부동소수점형 리터럴의 기본값은 double형
	C. float f3 = '1';   
	D. float f4 = "1";
    E. float f5 = 1.0d;  // double형 리터럴
    
    => A, C
*/

}
