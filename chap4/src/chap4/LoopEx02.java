package chap4;
/*
 * 중첩 반복문 : 반복문 내에 반복문
 */
public class LoopEx02 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {  
			System.out.println("\n" +i+"단");
			for(int j=2; j<=9; j++) {  
				System.out.println(i+"*"+j+"="+(i*j)); 
			} // 내부 반복문의 끝
		} // 외부 반복문의 끝
	}

}
