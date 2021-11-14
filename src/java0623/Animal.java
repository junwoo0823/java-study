package java0623;

//추상메소드를 한개 이상 가진 클래스라면 추상클래스가 되어야 함.
public abstract class Animal { // 동물 클래스
	
	void eat() {
		System.out.println("먹는다.");
	}
	// 추상메소드 선언
	abstract void speak();
}
