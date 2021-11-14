package java0601;

public class Ex2 {

	public static void main(String[] args) {
		// Student 객체생성
		Student stu = new Student();
		
		stu.hakbun = 1;
		stu.name = "홍길동";
		stu.kor = 100;
		stu.eng = 85;
		stu.math = 90;
		
		// 출력형식
		//      학생이름    총점: ㅇㅇ점,   평균: ㅇㅇ점
		System.out.println(stu.name + "\t총점: " + stu.sum() + "\t평균: " + stu.avg());
		
	} // main

}




