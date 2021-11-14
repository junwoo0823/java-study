package java0507;

public class Ex1 {

	public static void main(String[] args) {
		// 텍스트편집기 최대화, 최소화 ctrl m
		
		// 변수 : 하나의 값을 저장할 수 있는 저장공간
		
		int a; // integer 정수공간 선언하고 이름을 a로 붙임
		a = 5; // 프로그래밍에서 등호는 대입연산자 (오른쪽에서 왼쪽으로 수행)
		System.out.println("a = " + a);
		
		a = 10;
		System.out.println("a = " + a);
		
		a = a + 20;
		System.out.println("a = " + a);
		
		System.out.println("=================");
		
		int num1 = 5; // 변수의 선언과 동시에 초기화
		
		int num2;  // 변수의 선언
		num2 = 2;  // 변수에 값 초기화
		num2 = 3;  // 변수에 값 수정
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		
		// 기본자료형 별 사용해보기
		double dNum = 3.14; // 실수
		System.out.println("dNum = " + dNum);
		
		// 문자 한개 표현하는 자료형
		char ch = 'A';
		System.out.println("ch = " + ch);
		
		String str = "동해물과 백두산이 마르고 닳도록~";
		System.out.println("str = " + str);
		
		
		
	} // main

}




