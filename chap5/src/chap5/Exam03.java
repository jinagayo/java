package chap5;
/*
 * str 문자열에 저장된 소문자의 갯수 출력하기
 */

public class Exam03 {

	public static void main(String[] args) {
		
		String str = "happy";
		char[] data = str.toCharArray();
		int cntArr[] = new int[26]; 
		
		for(int i = 0; i<str.length(); i++) {
			if(data[i]>='a'&& data[i]<='z') {
				cntArr[data[i]-'a']++;
			}
		}
		for (int i = 0; i<cntArr.length; i++) {
			System.out.print((char)(i+'a')+"의 값은 "+cntArr[i]+" ");
			for(int j =0; j<cntArr[i]; j++ ) {
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
