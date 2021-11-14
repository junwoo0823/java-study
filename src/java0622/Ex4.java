package java0622;


class Parent {
	
	void showParent() {
		System.out.println("Parent showParent()");
	}
}

class Child extends Parent {
	
	// 메소드 오버라이딩(overriding) : 부모의 메소드를 재정의
	@Override
	void showParent() {
		System.out.println("Child showParent()");
	}

	void printMessage() {
		//this.showParent();
		super.showParent();
		
		// 메소드 오버라이딩을 하여 메소드명이 동일할때
		// 부모쪽 메소드를 호출하고 싶을때는 super 참조변수를 사용하면 됨
	}
	
	void showChild() {
		System.out.println("Child showChild()");
	}
}


public class Ex4 {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.showChild();
		c.showParent(); // 오버라이드(재정의)한 메소드가 호출됨
		// 정적 바인딩 : 객체 자료형과 참조변수 자료형이 같을때 발생
		
		
		
		System.out.println("========================");
		
		// [객체 외부]에서 오버라이드한 메소드를 호출하면
		// 항상 오버라이드(재정의)된 메소드만 호출됨!
		
		// 객체 외부에서는 오버라이드 당한 부모쪽 메소드를 호출 불가능함!
		
		c.printMessage();

	} // main

}





