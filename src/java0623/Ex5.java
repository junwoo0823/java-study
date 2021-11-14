package java0623;


public class Ex5 {

	public static void main(String[] args) {
		// 추상클래스는 객체생성은 못하지만, 참조변수로 사용가능(다형성을 사용)
		Animal animal = new Puppy(); // 업캐스팅(다형성)
		
		animal.eat();
		animal.speak();
		
		// 추상메소드는 상속받는 자식클래승서 모두 구현해야만 함
		// 추상메소드에는 몸통이 없음. 다형성을 위해 존재할 뿐.
		
	} // main

}





