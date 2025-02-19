package chap2;
/*
 * 특수문자 : \
 */

public class VarEx5 {

	public static void main(String[] args) {
		
	//	char single = ''';     // 작은따옴표 저장 (오류)
		char single = '\'';   
		System.out.println(single);
		
	//	String str = "홍길동이 말했습니다. "안녕" ";    // 큰따옴표 표현 (오류)
		String str = "홍길동이 말했습니다. \"안녕\" "; 
		System.out.println(str);
		String dir = "c:\\";            // \표현 (정상)
		System.out.println(dir);
		
		System.out.println("서울\t대전\t대구\t부산");            //tab 표시
		System.out.println("안녕하세요 \n다음줄에 출력합니다.");    //new line. 다음줄
		System.out.println("\uD64D");						//유니코드. 2바이트 문자. 유니코드16진수코드값. 홍

	}

}
