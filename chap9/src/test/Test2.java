package test;

import test.Outer1.Inner1;

/*
 * Outer1클래스의 내부 클래스 Inner1, Inner2 의 멤버변수 iv의 값 출력 하기
 */
class Outer1 {
	class Inner1 {
		int iv = 100;
	}
  static class Inner2 {
		int iv = 200;
	}
}
public class Test2 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner1 a = o.new Inner1();
		System.out.println(a.iv);
		
		Outer1.Inner2 b = new Outer1.Inner2();
		System.out.println(b.iv);
	}
}
