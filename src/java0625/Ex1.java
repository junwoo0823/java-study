package java0625;

public class Ex1 {

	public static void main(String[] args) {
		// 예외(Exception) : 프로그램 실행시간 동안에 발생하는 예기치 못한 에러

		int a = 10;
		int b = 0;
		int result = 0;
		
		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			result = a / b;  // 0으로 나눔 예외발생
		}
		
		System.out.println("result = " + result);
		
		System.out.println("===== 정상종료 =====");
	} // main

}
