package java0621;

// 객체지향 언어에서 객체간의 관계 두가지
// 1) 포함관계 (~를 가지고 있다.) A는 B를 가지고 있다. (A has a B.)
//   나는 핸드폰을 가지고(사용/포함/의존하고) 있다.
//   자동차가 엔진을 가지고(사용하고) 있다.

// 2) 상속관계 (~이다) A는 B이다. (A is a B.)
//   중학생은 학생이다.  <->  학생은 중학생이다.(X)
//   강아지는 동물이다.  <->  동물은 강아지이다.(X)


// Car와 Engine 클래스는 포함관계
class Car {
	private Engine engine = new Engine();
	
	public void drive() {
		engine.use();
		System.out.println("부릉부릉~~");
	}
}
class Engine {
	public void use() {
		System.out.println("엔진을 사용합니다.");
	}
}


// 2) 상속관계
class Parent {
	
	void showParent() {
		System.out.println("Parent의 showParent() 호출됨");
	}
}
// Child는 하위(sub)클래스, 자식클래스
// Parent는 상위(super)클래스, 부모클래스
class Child extends Parent { 
	
	void showChild() {
		System.out.println("Child의 showChild() 호출됨");
	}
}

class GrandChild extends Child {
	
	void showGrandChild() {
		System.out.println("GrandChild의 showGrandChild() 호출됨");
	}
}


public class Ex2 {

	public static void main(String[] args) {
		// 포함관계 에 있는 자동차 객체를 사용하기
		Car car = new Car();
		car.drive();
		
		System.out.println("================");
		
		// 상속관계에 있는 Child 객체 사용하기
		Child c = new Child();
		c.showChild();
		c.showParent(); // 상속받은 부모메소드 호출
		c = null;
		
		System.out.println("================");
		
		GrandChild gc = new GrandChild();
		gc.showGrandChild();
		gc.showChild();
		gc.showParent();

	} // main

}






