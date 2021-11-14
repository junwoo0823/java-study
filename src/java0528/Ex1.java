package java0528;

public class Ex1 {
//  사용자 정의 함수(메소드)
	// 함수의 선언형식
	//  반환형 함수이름(매개변수형식) { 실행문; ... }
	
	// 매개변수 없고, 반환값도 없는 함수
	static void showStar() {
		System.out.println("★★★★★★★★★");
		System.out.println("★★★ ★★★ ★");
	}
	
	// 매개변수 있고, 반환값은 없는 함수
	static void multipleTen(int num) {
		System.out.println("받은 숫자의 열배는 " + num * 10);
		//return;
	}
	
	// 매개변수 없고, 반환값은 있는 함수
	static String getHello() {
		return "안녕";
	}
	
	// 매개변수 있고, 반환값도 있는 함수
	static int addTwoNumber(int a, int b) {
		return a + b;
	}
	
	
	// main함수
	// 자바는 함수 블럭 안에서 또다른 함수 선언이 불가능함
	public static void main(String[] args) {
		System.out.println("===== 프로그램 시작됨 =====");
		
		showStar(); // 함수 호출문(함수 사용하기)
		
		showStar();
		
		multipleTen(20); // 받은 숫자의 열배는 200
		multipleTen(5); // 받은 숫자의 열배는 50
		
		String str = getHello();
		System.out.println("main함수에서 출력: " + str);
		
		System.out.println("main함수에서 출력: " + addTwoNumber(10, 20));

		System.out.println("===== 프로그램 종료됨 =====");
	} // main

}




