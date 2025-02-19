package ex6_this;
//결과에 맞도록 Rectangle 클래스 구현하기
// 1. 생성자 구현시 생성자의 매개변수이름과, Rectangle 클래스의 멤버변수이름은 같은 이름으로 한다.
// 2. this() 생성자를 사용하여 생성자를 구현할 것

class Rectangle{
	int width, height,sno;
	static int cnt;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		sno = ++cnt;
	}
	Rectangle(){
		this(1,1);
	}
	Rectangle(int w){
		this(w,1);
	}
	Rectangle(Rectangle r){
		this(r.width,r.height);
	}
	
	int area() {
		return width*height;
	}
	int length() {
		return (width+height)*2;
	}
	boolean isSquare() {
		return width == height;
	}
	
	public String toString(){
	return sno + "번 사각형: (" + width +"," + height + "), " + "면적:"+area()
			+  ", 둘레:"+ length() + "," + (isSquare()?"정사각형":"직사각형");
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,10);    //1번 사각형: (10,10), 면적:100, 둘레:40, 정사각형
		Rectangle r2 = new Rectangle();   		//2번 사각형: (1,1), 면적:1, 둘레:4, 정사각형
		Rectangle r3 = new Rectangle(10);      //3번 사각형: (10,1), 면적:10, 둘레:12, 직사각형
		Rectangle r4 = new Rectangle(r1);      //4번 사각형: (10,10), 면적:100, 둘레:40, 정사각형
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

}
