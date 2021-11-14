package java0510;

public class Ex1 {

	public static void main(String[] args) {
		// print()  println()
		System.out.println("Hello, world\n");
		System.out.print("3 + 5 = ");
		System.out.println(3 + 5);
		
		System.out.println("=========================");
		
		// 1bit = 이진수 0 또는 1 한개의 값
		// 1byte = 8bit
		
		// 변수의 타입
		// 숫자
		//    정수 : int(4byte) - 기본, long(8byte)
		//    실수 : float(4byte), double(8byte) - 기본
		
		// 문자
		//    char(2byte)  문자 한개 저장하는 용도
		//    String       문자열 객체(문자 여러개 나열해서 표현 가능)
		
		int x = 100;
		double pi = 3.14d;
		char ch = 'a';
		String str = "abc";
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		
		final int MAX_SPEED = 10; // 변수의 상수화. final 키워드로 상수 선언.
//		MAX_SPEED = 20;  // 상수는 값 수정이 불가능
		System.out.println(MAX_SPEED + 1);
		
		int octNum = 010;  // 8진수 표현
		int hexNum = 0x10; // 16진수 표현
		
		long big = 100_000_000_000L; // long형 변수 = long형 리터럴 값
		System.out.println("big = " + big);
		
		float fNum = 3.14f; 
		System.out.println("fNum = " + fNum);
		
		char chVal = 'J';
		String strVal = "Java";
		
		char chVal2 = 65; // char형은 정수형에 속하므로 정수 호환임
		System.out.println("chVal2 = " + chVal2);
	} // main

}
