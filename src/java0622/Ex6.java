package java0622;


class A /*extends Object*/ {
	
	A() {
		super();
		System.out.println("A");
	}
}

class B extends A {
	
	B() {
		super();
		// super 생성자 호출: 자바 컴파일러가 생성자 블록 첫 실행문으로 자동 삽입해줌
		System.out.println("B");
	}
}

public class Ex6 {

	public static void main(String[] args) {
		// 상속관계에서 자식클래스의 생성자 호출 시
		// 내부적인 생성자 호출 순서
		B b = new B();

	} // main

}
