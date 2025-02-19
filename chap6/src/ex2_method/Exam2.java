package ex2_method;
/*
 * Rectangle 클래스를 이용하여 20~50 사이의 임의의 가로, 세로 길이를 가진 사각형 5개를 생성하여
 * 사각형 정보를 출력하고
 * 전체 사각형의 면적의 합과 둘레의 합을 출력하기
 */

public class Exam2 {

	public static void main(String[] args) {
			
		Rectangle r[] = new Rectangle[5];
		//r[0] : Rectanle 형의 참조변수.  Rectangle 객체 아님
		
		int totArea = 0,  totLen = 0;
		
		for(int i=0; i<r.length; i++) {
			r[i] = new Rectangle();  //Rectangle 객체 생성
			r[i].width = (int)(Math.random()*31)+20;   //20~50 사이의 임의의 수
			r[i].height = (int)(Math.random()*31)+20;
			r[i].serialNo = ++Rectangle.cnt;
			System.out.println(r[i]);
			totArea += r[i].area();
			totLen += r[i].lenght();
		}
		
		System.out.println("전체 면적의 합 : "+totArea);
		System.out.println("전체 둘레의 합 : "+totLen);

	}

}

