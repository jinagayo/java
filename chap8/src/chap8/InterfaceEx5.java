package chap8;
/*
 * 인터페이스의 default, static 메소드
 * - java8 이후에서 사용이 가능한 메소드
 * - 인터페이스에서 구현부가 존재하는 메소드
 * - default 메소드는 인스턴스 멤버. => 객체화 필요
 *   static 메소드는 클래스 멤버 => 인스턴스명.메소드명 호출
 * - 다중구현이 가능.
 *   -추상메소드 중복된 경우 : 한 개만 구현
 *   -default 메소드가 중복 : 오버라이딩 필요.
 *   -default 메소드가 중복이 안 된 경우 오버라이딩 필요없음. 오버라이딩 가능
 *   -static 메소드는 중복되어도 상관 없다.
 */
interface MyInterface1{
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default 메소드 : method1");
	}
	static void method2() {
		System.out.println("MyInterface1의 default 메소드 : method2");
	}
}
interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 default 메소드 : method1");
	}
	static void method2() {
		System.out.println("MyInterface2의 default 메소드 : method1");
	}
}
class Parent {
	public void pmethod() {
		System.out.println("Parent클래스의 멤버 메소드 : pmethod");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2{
	public void method() {
		System.out.println("Child 클래스에서 method() 오버라이딩");
	}
	public void method1() {
		System.out.println("Child 클래스에서 default 메소드를 오버라이딩함 : method1");
	}
	
}
public class InterfaceEx5 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		MyInterface1.method2();  //static 메소드
		MyInterface2.method2();  //static 메소드
//		Child.method2();  //오류
		c.pmethod();
	}

}
