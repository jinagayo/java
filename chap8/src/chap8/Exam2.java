package chap8;
/*
 *  LambdaInterface2 인터페이스를 이용하여 입력된 값까지의 합을 구하기
 */
public class Exam2 {

	public static void main(String[] args) {
		
		LambdaInterface2 f=null;
		//1 ~ n까지의 합
		f = i -> {
			
					int sum = 0;
					for(int a=1; a<=i; a++) {
						sum+=a;
					}
					System.out.println(sum);
		};
		
		calc(f,10);  //55
		calc(f,100); //5050
		
		//n!값을 출력하기
		f = i -> {
				int total = 1;
				for(int a=1; a<=i; a++) {
					total*=a;
				}
				System.out.println(total);
		};
		
		calc(f,4);  //24
		calc(f,5);  //120
	
	}
	private static void calc(LambdaInterface2 f, int num) {
		f.method(num);
	}
}
