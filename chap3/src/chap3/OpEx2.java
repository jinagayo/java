package chap3;
/*
 * 단항연산자:
 * 	부호 연산자: +, -
 * 		x : 현재부호 유지
 * 		y : 현재부호 변경.  음수 -> 양수,  양수 -> 음수
 * 	논리부정 : !
 * 		true -> false
 * 		false -> true
 */
public class OpEx2 {

	public static void main(String[] args) {
		
		//부호 연산자
		int x = -10;
		System.out.println("x="+ +x);           // x = -10
		System.out.println("x="+ -x);			// x = 10
		x=10;
		System.out.println("x="+ +x);			// x = 10
		System.out.println("x="+ -x);			// x = -10
		
		//논리 부정 연산자
		System.out.println("true ="+ !false);        	//true
		System.out.println("false ="+ !true);				//false
		System.out.println("5 != 4 = "+ (5!=4));        //true
		System.out.println("!(5==4) = "+ !(5==4));      //true
		
		
		
		
	}

}
