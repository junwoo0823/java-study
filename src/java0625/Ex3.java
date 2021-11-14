package java0625;

import java.io.IOException;

class ExceptionTest {
	
	void methodA() throws ClassNotFoundException {
		System.out.println("=== methodA() 호출됨 ===");
		
		methodB();
		
		System.out.println("=== methodA() 정상종료 ===");
	}
	
	void methodB() throws ClassNotFoundException {
		System.out.println("=== methodB() 호출됨 ===");
		
		try {
			methodC();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("=== methodB() 정상종료 ===");
	}
	
	void methodC() throws ClassNotFoundException, IOException {
		System.out.println("=== methodC() 호출됨 ===");
		
		Class.forName("java.lang.String2"); // 예외발생
		
		System.out.println("=== methodC() 정상종료 ===");
	}
}


public class Ex3 {

	public static void main(String[] args)  {
		System.out.println("=== main() 호출됨 ===");
		// 예외 떠넘기는 예외처리 방법 : throws 키워드로 예외를 자신을 호출한 쪽으로 되던지기
		
		ExceptionTest et = new ExceptionTest();
		try {
			et.methodA();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("=== main() 정상종료 ===");
	} // main

}






