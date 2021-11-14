package java0622;

import lombok.Getter;
import lombok.Setter;

/*
   메소드 오버라이딩 규칙
   - 메소드 선언부(시그니처 signature)가 일치해야 함
   - 접근 제어자의 범위는 오버라이딩 대상 메소드보다 같거나 넓게 해야함
   
*/

@Getter @Setter
class Point2D {
	
	private int x;
	private int y;
	
	public String getLocation() {
		return x + ", " + y;
	}
}

// Point3D 클래스  상속 Point2D
//   멤버변수 정수형 z
//   getLocation 메소드 오버라이드(재정의)   return "x, y, z"
@Getter @Setter
class Point3D extends Point2D {
	
	private int z;

	@Override
	public String getLocation() {
		//return getX() + ", " + getY() + ", " + z;
		
		String str = super.getLocation();
		return str + ", " + z;
	}
}

public class Ex5 {

	public static void main(String[] args) {
		// Point3D 객체 생성
		Point3D p = new Point3D();
		// x 10  y 20  z 30  로 설정
		p.setX(10);
		p.setY(20);
		p.setZ(30);
		// getLocation() 호출. 리턴된 문자열 출력
		System.out.println(p.getLocation());
	} // main

}




