package test;
/*
 Test3의 Coin 클래스를 이용하기 
 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 앞면이 연속해서 3번 나오면 승리가 출력되도록 구동 클래스 구현하기   

 [결과예시] => 결과는 다를 수 있습니다.
 myCoin	youCoin
  앞면	뒷면
  뒷면	앞면
  앞면	앞면
  앞면	앞면
 youCoin 승리
 */

public class Test6 {
	public static void main(String[] args) {
		
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		
		System.out.println("myCoin\tyouCoin");
		
		while(true) {
			myCoin.flip();
			
			if(myCoin.side == 0) 
				myCoin.front++;
			else {
				myCoin.front=0;
				}
			
			youCoin.flip();
			
			if(youCoin.side == 0) 
				youCoin.front++;
			else {
				youCoin.front=0;
						}
			
			System.out.print(myCoin.side==0?"앞면\t":"뒷면\t");
			System.out.print(youCoin.side==0?"앞면\t":"뒷면\t");
			System.out.println();
			
			if(myCoin.front==3||youCoin.front==3)
				break;
			
		}
		
		System.out.println( (myCoin.front==3?"MyCoin ":"YouCoin")+ "승리");
	}

}