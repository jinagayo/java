package ex5_constructor;

public class ConstructorEx1 {

	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 예약어 기능
		 * 1. 메모리 할당. 힙영역에 할당
		 * 2. 멤버필드들의 값을 기본값으로 초기화.
		 *  명시적으로 초기화된 경우 초기화 값으로 초기화
		 * 3. 생성자 호출
		 */
		Number2 n2 = new Number2(10);
		System.out.println(n1.num);  //0
		System.out.println(n2.num);  //10

	}

}
