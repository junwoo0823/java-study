package java0623;


// 추상클래스 MyShape
//    추상메소드  void draw()
abstract class MyShape {
	abstract void draw();
}
// 클래스 MyCircle  상속 MyShape
//    메소드 오버라이딩.  출력 "원을 그린다."
class MyCircle extends MyShape {
	@Override
	void draw() {
		System.out.println("원을 그린다.");
	}
}
// 클래스 MyRectangle  상속 MyShape
//    메소드 오버라이딩.  출력 "사각형을 그린다."
class MyRectangle extends MyShape {
	@Override
	void draw() {
		System.out.println("사각형을 그린다.");
	}
}
// 클래스 MyTriangle  상속 MyShape
//    메소드 오버라이딩.  출력 "삼각형을 그린다."
class MyTriangle extends MyShape {
	@Override
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

public class Ex6 {

	public static void main(String[] args) {
		// 추상클래스 타입 변수로 자식객체를 사용하기: 업캐스팅 -> 다형성
		MyShape s;
		s = new MyCircle();
		s.draw();
		
		MyShape[] shpArr = { new MyCircle(), new MyTriangle(), new MyRectangle() };
		
		for (MyShape sh : shpArr) {
			sh.draw(); // 다형성 사용
		}
		
	} // main

}






