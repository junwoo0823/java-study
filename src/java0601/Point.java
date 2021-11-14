package java0601;

public class Point {
	// 멤버변수
	int x;
	int y;
	
	// 기본생성자
	Point() {
		System.out.println("Point 기본생성자");
		// 초기화
		x = y = 2;
	}
	
	// 생성자 오버로딩(Overloading) : 생성자를 여러개 중복정의. 사용자 편의를 위함.
	
	// 생성자 오버로딩 가능한 규칙
	// : 매개변수의 개수가 다르다.
	//   매개변수의 개수가 같으면 자료형이 다르다.
	
	// x값 받아서 초기화하는 생성자
	Point(int _x) {
		x = _x;
		y = 5;
	}
	
	// y값 받아서 초기화하는 생성자
//	Point(int _y) {
//		y = _y;
//		x = 7;
//	}
	
	// x y 값 받아서 초기화하는 생성자
	Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	// getter 메소드 (읽기), setter 메소드 (쓰기)
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	
	void setX(int _x) {
		if (_x < 0) {
			System.out.println("음수는 좌표값으로 설정할수 없습니다.");
			return;
		}
		x = _x;
	}
	
	void setY(int _y) {
		y = _y;
	}
	
	void showPoint() {
		System.out.println(x + ", " + y);
	}
}







