package java0623;

// 인터페이스 : 클래스를 구현하기 위한 틀. 다형성 범위를 넓히기 위함.
//              클래스 다중상속의 위험은 회피하면서 다형성을 가지게 하기 위함.
//   접근지정자는 항상 public
//   static 상수, 추상메소드만 선언 가능

public interface IRobot {
	
	public static final int RED = 1;  // public static final은 생략 가능
	int BLUE = 2;
	
	// 추상메소드
	public abstract void sayHello();  // public abstract 생략 가능
	void sayGoodbye();
}








