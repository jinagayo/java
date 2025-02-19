package chap3;
/*
 * int 형보다 작은 자료형(byte, short, char) 형의 연산의 결과는 int 임
 * 
 * 연산의 결과는 큰자료형을 따른다.
 * int = int + int
 * float = float + int
 * long = long + int
 */
public class OpEx9 {

	public static void main(String[] args) {
		
		int x=10, y=20;
		int a;
		long b;
		float c;
		a = x + y;
		System.out.println("a="+ a);    //30
		b = x + y;
		System.out.println("b="+b);   //30
	//	a = a + b;  //(오류) long = int + long
		b = a + b;  //(정상) long = int + long
		c = a + b;  //(정상) long = int + long
		System.out.println("c="+c); 
		
		byte b1=10, b2=20, b3;
	//	b3 = b1 + b2;  // (오류) int = byte + byte
		b3 = (byte)(b1 + b2);
		
		char c1 = 'A';
		c1 += 1;
		System.out.println("c1= "+c1);
	//	c1 = c1 + 1;     (오류) int = char + int
		c1 = (char)(c1 + 1);
		System.out.println("c1="+c1);
		c1 = 'A';
		System.out.println("c1의 소문자: "+(c1+=32));

	}

}
