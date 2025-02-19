package ex1_field;

class Rectangle {
	int width;
	int height;
	int sno;
	static int cnt;
	
	public String toString() {
		return sno + "번 사각형: 가로(" + width +"), 세로(" + height +"), 현재까지 생성된 사각형("+cnt+")" ;
	}

}
