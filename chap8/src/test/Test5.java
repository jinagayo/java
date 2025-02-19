package test;
/*
 * 구동 클래스를 실행했을때 다음의 결과가 나오도록 프로그램 구현하기  
 *
 * Flyable 인터페이스, Dove,Monkey,Eagle 클래스 구현하기
 * [결과]
 * 비둘기는 작은 벌레를 잡아 먹는다.
 * 비둘기는 날아 다니는 새입니다.
 * 원숭이는 나무에서 열매를 따서 먹는다
 * 독수리는 작은 새를 잡아 먹는다.
 * 독수리는 엄청 높이 날아 다닌다.
 */
abstract class Animal2 {
	String name;
	Animal2(String name) {
		this.name = name;
	}
	abstract void eat();
}

class Dove extends Animal2 implements Flyable{
     Dove(){
    	 super("비둘기");
     }
     void eat() {
    	 System.out.println("비둘기는 작은 벌레를 잡아 먹는다.");
     }
     public void fly() {
    	 System.out.println("비둘기는 날아 다니는 새입니다.");
     }
}

class Monkey extends Animal2{
    Monkey(){
   	 super("원숭이");
    }
    void eat() {
   	 System.out.println("원숭이는 나무에서 열매를 따서 먹는다.");
    }
}

class Eagle extends Animal2 implements Flyable{
    Eagle(){
   	 super("독수리");
    }
    void eat() {
   	 System.out.println("독수리는 작은 새를 잡아 먹는다.");
    }
    public void fly() {
   	 System.out.println("독수리는 엄청 높이 날아 다닌다.");
    }
}

interface Flyable{

	void fly();};

public class Test5 {
	public static void main(String[] args) {
		Animal2[] arr = new Animal2[3];
		arr[0] = new Dove();
		arr[1] = new Monkey();
		arr[2] = new Eagle();
		for (Animal2 a : arr) {
			a.eat();
			if (a instanceof Flyable) {
				((Flyable) a).fly();
			}
		}
	}
}
