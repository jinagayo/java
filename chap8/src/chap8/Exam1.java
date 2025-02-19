package chap8;
//Animal 클래스

/*
 * 다음 결과가 나오도록 Dove, Monkey 클래스, Flyable 인터페이스 구현하기
 * [결과]
 * 비둘기들은 벌레를 잡아먹는다
 * 비들기들은 날아다니다.
 * 원숭이는 나무에서 열매를 따먹는다.
 */

abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat();  //추상메소드
}

interface Flyable {
	
	void fly();
	//default void fly() {}
	
}

class Dove extends Animal implements Flyable{
	Dove(){
		super("비둘기");
	}
	
   void eat() {
	   System.out.println(name + "들은 벌레를 잡아먹는다");
	   
   }
   
   public void fly() {
	   System.out.println(name + "들은 날아다닌다.");
   }
}

class Monkey extends Animal{
	Monkey(){
		super("원숭이");
	}
	
   void eat() {
	   System.out.println(name + "는 나무에서 열매를 따먹는다.");
	   
   }

}


public class Exam1 {

	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
		
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}

	}

}
