package java0601;

public class Student {
	// 학번   정수형  hakbun
	int hakbun;
	// 학생이름   문자열  name
	String name;
	// 국어점수  정수형  kor
	int kor;
	// 영어점수  정수형  eng
	int eng;
	// 수학점수  정수형  math
	int math;
	
	// 기본생성자 : 자바 컴파일러가 클래스 정의안에 생성자 블록이 없으면 자동으로 넣어줌
	// 생성자가 없을때 기본생성자를 자동삽입해주는 이유: 
	//  - 클래스의 역할은 객체생성 용도인데 생성자가 없으면 객체생성역할을 못해주므로,
	//    객체생성을 보장해주도록 하는 기본동작임 
	Student() {
		System.out.println("Student 생성자 호출됨");
		// 생성자 용도: 생성된 객체의 초기상태를 준비하는 용도
		hakbun = 1;
	}
	
	// 총점 구해서 리턴하는 메소드  sum
	int sum() {
		return kor + eng + math;
	}
	// 평균 구해서 리턴하는 메소드  avg
	double avg() {
		return sum() / 3.0;
	}
}




