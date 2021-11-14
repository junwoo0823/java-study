package java0625;

public class Ex7 {

	public static void main(String[] args) {
		
		// 익명의 내부클래스
		//  : 클래스로부터 객체생성 후 업캐스팅 해서 사용
		Runnable goTask = new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.println("goTask");
					
					try {
						Thread.sleep(200); // 1초 = 1000밀리초
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				} // while
			}
		};
		
		Thread th1 = new Thread(goTask);
		th1.setName("goThread");
		th1.setPriority(Thread.MAX_PRIORITY); // 우선순위 최대값 설정
		
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				Thread curTh = Thread.currentThread();
				curTh.setPriority(Thread.MIN_PRIORITY); // 우선순위 최소값 설정
				
				while (true) {
					System.out.println("comeTask");
					
					try {
						Thread.sleep(200); // 1초 = 1000밀리초
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
					
				} // while
			}
		});
		
		
		// 람다식을 사용할수 있는 경우
		//  : 함수형 인터페이스일 때만 사용 가능함
		//     -> 선언된 추상메소드가 한개만 가진 인터페이스는 함수형 인터페이스라고 한다.
		Thread th3 = new Thread(() -> {
			while (true) {
				System.out.println("byeTask");
				
				try {
					Thread.sleep(200); // 1초 = 1000밀리초
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			} // while
		});
		
		th1.start();
		th2.start();
		th3.start();
		
	} // main

}



