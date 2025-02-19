package ex4_overloading;
/*
 * 메서드 오버로딩 : 메서드의 다형성
 * 조건
 * 1. 같은 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재 가능
 * 2. 단 매개변수 목록이 달라야 한다. (자료형기준: 갯수, 순서, 종류).매개변수명은 상관없다.
 */

class Adder{
/* 매개 변수 명이 다른 것은 오버로딩이 되지 않는다,
	int a = 100;
	int add(int b) {
		System.out.print("1: ");
		return a+b;
	}
*/
	double add(double b) {
		System.out.print("2: ");
		return b;
	}
	String add(String b) {
		System.out.print("3: ");
		return 1+b;
	}
}
public class OverloadingEx1 {

	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.add(10));    //1:110
		System.out.println(a.add(10.5));  //2:110.5
		System.out.println(a.add("번"));   //3:100번
		System.out.println(a.add(100L));  //add메서드의 long 매개변수값이 자동형 변환 가능한 메서드 선택

	}

}
