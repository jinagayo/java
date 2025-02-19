package test;
/*
 * 다음의 결과가 나오도록 Student 클래스 구현하기
 * [결과]
      학번:1
      이름:홍길동
      국어:0
      영어:0
      수학:0
      총점:0
      평균:0.0
   =====================
      학번:2
      이름:김삿갓
      국어:80
      영어:90
      수학:70
      총점:240
      평균:80.0
=====================
 */
class Student{
	String name;
	int num;
	int kor, eng, mat, total;
	double avg;
	
	Student(String name, int num){
		this(name, num, 0,0,0);
	}
	
	Student(String name, int num, int kor, int eng, int mat){
		this.name = name;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		total = kor+eng+mat;
		avg = total/3.0;
	}
	
	void info() {
		System.out.println("학번: " + num);
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println(" =====================");
	}
}
public class Test1 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1);
		s.info();
		Student s2 = new Student("김삿갓", 2, 80, 90, 70);
		s2.info();
	}
}