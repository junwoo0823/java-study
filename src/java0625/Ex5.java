package java0625;

class GoThread extends Thread {

	@Override
	public void run() {
		methodGo();
	}
	
	void methodGo() {
		while (true) {
			System.out.println("go");
		}
	}
}

class ComeThread extends Thread {
	
	@Override
	public void run() {
		methodCome();
	}

	void methodCome() {
		while (true) {
			System.out.println("come");
		}
	}
}


public class Ex5 {

	public static void main(String[] args) {
		// 멀티스레드 구현 방법
		// 1. Thread 클래스 상속
		//    run() 시작점 메소드를 오버라이딩
		//    .start() 스레드 시작을 JVM에게 주문함

		GoThread goThread = new GoThread();
		ComeThread comeThread = new ComeThread();
		
		// 기본적으로 사용자가 생성한 스레드는 주 스레드.
		// 주 스레드는 스택에 실행할 메소드가 존재하면 종료되지 않음
		
		//goThread.setDaemon(true); // 데몬(보조)스레드 : 주 스레드가 종료되면 함께 종료되는 스레드
		//comeThread.setDaemon(true);
		
		goThread.start();
		comeThread.start();
		
		System.out.println("=== main() 정상 종료 ===");
	} // main

}
