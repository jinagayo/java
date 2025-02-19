package chap8;
/*
 * 매개변수와 리턴 값 모두 있는 경우
 * 매개변수의 갯수가 한 개인 경우 () 생략 가능
 * {}내부에 문장이 한 개인 경우 {}와 return 생략 가능
 */
interface LambdaInterface3 {
	int method(int x, int y);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 f = (x,y) -> {
			return x+y;
		};
		System.out.println("두수의 합:" + f.method(2, 5));
		f = (x,y) -> x+y;
		System.out.println("두수의 합:" + f.method(20, 5));
		f = (x,y) -> x*y;
		System.out.println("두수의 곱:" + f.method(20, 5));
		f = (x,y) -> x/y;
		System.out.println("두 수를 나눈 몫:" + f.method(20, 5));
		f = (x,y) -> x%y;
		System.out.println("두 수를 나눈 나머지:" + f.method(20, 5));
		f = (x,y) -> x>y?x:y;
		System.out.println("두 수 중 큰 수:" + f.method(20, 5));
		f = (x,y) -> x<y?x:y;
		System.out.println("두 수 중 작은 수:" + f.method(20, 5));
	}

}
