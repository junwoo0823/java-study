package java0623;

// 인터페이스 Movable
//   추상메소드  void move(int x, int y)
interface Movable {
	/*public abstract*/ void move(int x, int y);
}
// Fighter 클래스  Movable 인터페이스를 구현
//    메소드 오버라이딩  출력 "x, y 로 이동한다."
class Fighter implements Movable {
	@Override
	public void move(int x, int y) {
		System.out.println(x + ", " + y + "로 이동한다.");
	}
}

public class Ex9 {

	public static void main(String[] args) {
		// 인터페이스 변수로 Fighter 객체 사용해보기
		Movable movable = new Fighter();
		movable.move(10, 20);
	} // main

}





