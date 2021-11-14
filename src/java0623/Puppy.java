package java0623;

//강아지 클래스는  동물 추상클래스를 상속하고, IRobot 인터페이스를 구현함
// (일종의 다중상속 효과를 가짐 -> 다형성의 범위가 확장되는 효과)
public class Puppy extends Animal implements IRobot { 
	// 상속받은 추상메소드는 오버라이드(재정의)해서 구현해준다.
	@Override
	void speak() {
		System.out.println("멍멍~~!!");
	}

	@Override
	public void sayHello() {
		System.out.println("멍멍~ 안녕하세요");
	}

	@Override
	public void sayGoodbye() {
		System.out.println("멍멍~ 안녕히 가세요");
	}
}
