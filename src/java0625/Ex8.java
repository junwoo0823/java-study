package java0625;

public class Ex8 {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println(mainThread.getName());  // 스레드 이름  main
		System.out.println(mainThread.getPriority()); // 스레드 우선순위  5
		
		System.out.println(Thread.MAX_PRIORITY);  // 10
		System.out.println(Thread.NORM_PRIORITY); // 5 (우선순위 기본값)
		System.out.println(Thread.MIN_PRIORITY);  // 1

	}

}
