package ex4_binding;
/*
 * Product 클래스 생성하기
 * 멤버변수 : 가격(price), 포인트(point)
 * 생성자 : 가격 입력 받고, 가격의 10%를 포인트로 저장
 */

class Product {
	int price, point;
	
	Product(int price){
		this.price = price;
		point = price/10;
	}
}

class Tv extends Product{
	
	Tv(){
	super(100);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	Computer(){
	super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class HandPhone extends Product {
	HandPhone(){
	super(150);
	}
	public String toString() {
		return "HandPhone";
	}
}
class Buyer{
	int money = 500;
	int point = 0;
	Product[]items = new Product[5];        //구매물품 목록
	int cnt;   								//구매물품 갯수
	
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		items[cnt++] = p;
		System.out.println(p + "구입");
	}
	
	void summary() {
		int toprice = 0;
		int topoint = 0;
		String itemName = "";
		
		for(int i=0; i<cnt; i++) {
			toprice += items[i].price;
			topoint += items[i].point;
			itemName += items[i] +", ";
		}
		System.out.println("구매금액합계:"+ toprice);
		System.out.println("구매포인트합계:"+ topoint);
		System.out.println("잔액: "+money);
		System.out.println("구매물품:"+itemName);
		
		}
	}


public class Exam1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t);     //매개변수 자동형변환
		b.buy(c);
		b.buy(h);
		b.summary();
	}

}
