package test;
/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+
 (1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+
(1+2+3+4+5+6+7+8+9+10)=220 한줄로 출력하기
*/
public class Test05 {
	public static void main(String[] args) {
		
		int total=0;
		
		for(int i=1; i<=10; i++) {
			
			int a[] = new int[i];
			System.out.print("(");
			int sum=0;
			for(int j=0; j<i; j++) {
				a[j]=j+1;
				sum+=a[j];
				System.out.print(a[j]);
				if(a[i-1]==i)
					System.out.print(")");
				else
					System.out.print("+");
			}
			total+=sum;
			if(i<10)
			System.out.print("+");
			else
				System.out.print("=");
			
		}
		System.out.println(total);

	}
}
