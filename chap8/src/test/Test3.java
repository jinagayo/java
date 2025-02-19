package test;
/*
 * 구동클래스를 실행하였을때 다음의 결과가 나오도록
 * 관련 클래스를 구현하기
 [결과]  
DanceRobot은 춤을 춤니다.
SingRobot은 노래를 부릅니다.
DrawRobot은 그림을 그립니다.
 */

abstract class Robot2{
	String name;
	Robot2(String name){
		this.name = name;
	}
	abstract void action();
}

class DanceRobot2 extends Robot2{
	DanceRobot2(){
		super("DanceRobot2");
	}
	public void action() {
		System.out.println("DanceRobot은 츔울 춥니다.");
	}
}

class SingRobot2 extends Robot2{
	SingRobot2(){
		super("SinRobot2");
	}
	public void action() {
		System.out.println("SingRobot은 노래를 부릅니다.");
	}
}

class DrawRobot2 extends Robot2{
	DrawRobot2(){
		super("DrawRobot2");
	}
	 void action() {   //클래스는 default도 가능
		System.out.println("DrawRobot은 그림을 그립니다.");
	}
}

interface Robot {
	void action();
}
class DanceRobot implements Robot{
	public void action() {           //인터페이스는 무조건 접근제한자 public
		System.out.println("DanceRobot은 츔울 춥니다.");
	}
}
class SingRobot implements Robot{
	public void action() {
		System.out.println("SingRobot은 노래를 부릅니다.");
	}
}
class DrawRobot implements Robot{
	public void action() {
		System.out.println("DrawRobot은 그림을 그립니다.");
	}
}
public class Test3 {
	public static void main(String[] args) {
		Robot[] robot = new Robot[3];
		robot[0] = new DanceRobot();
		robot[1] = new SingRobot();
		robot[2] = new DrawRobot();
		for(Robot r : robot) {
			r.action(); 
		}
		
		Robot2[] robot2 = new Robot2[3];
		robot2[0] = new DanceRobot2();
		robot2[1] = new SingRobot2();
		robot2[2] = new DrawRobot2();
		for(Robot2 r : robot2) {
			r.action(); 
		}
	}
}
