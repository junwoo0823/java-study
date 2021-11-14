package java0625;

class GoTask implements Runnable {
	
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

class ComeTask implements Runnable {

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


public class Ex6 {

	public static void main(String[] args) {
		// 2. Runnable 인터페이스 구현
		//    Thread 객체 생성해서  Runnable 구현객체를 Thread에 전달.
		//    .start() 메소드 호출해서 JVM에게 실행을 주문함
		
		GoTask goTask = new GoTask();
		ComeTask comeTask = new ComeTask();
		
		Thread thread1 = new Thread(goTask);
		Thread thread2 = new Thread(comeTask);
		
		thread1.start();
		thread2.start();
		
	} // main

}
