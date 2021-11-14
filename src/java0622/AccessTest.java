package java0622;

public class AccessTest {
	
	private     int a = 10;  // 같은 클래스 내에서만 접근 가능
	/*default*/ int b = 20;  // 같은 패키지 내에서만 접근 가능
	protected   int c = 30;  // 같은 패키지 + 다른 패키지에 있는 상속받은 자식클래스에서 접근 가능
	public      int d = 40;  // 모든 패키지에서 접근 가능

	public void showData() {
		System.out.println("AccessTest showData()");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}
