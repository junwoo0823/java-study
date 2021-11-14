package java0512;

public class Ex1 {

	public static void main(String[] args) {
		
		long result = Math.round(4.52); // 소수점 첫째자리에서 반올림해서 정수로 반환해줌
		System.out.println("result = " + result);
		
		// 실수값에서 원하는 자릿수에서 반올림하기 
		
		double pi = 3.141592;
		// 소수점 이하 넷째자리에서 반올림하여 셋째자리까지만 구하기
		
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println("shortPi = " + shortPi);
		
		// 3.141592 * 1000
		// Math.round(3141.592)
		// 3142 / 1000.0
		// 3142.0 / 1000.0
		// 3.142
		
		// 나머지 연산
		int x = 10, y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);
		
		// 나머지 연산자의 용도는
		// - 어떤 수의 배수를 구하기
		// - 짝수, 홀수 판별하기
		
		
		// 비교연산자
		int a = 10;
		int b = 8;
		boolean bVal = (a != b);
		System.out.println("bVal = " + bVal);
		
		
	} // main

}






