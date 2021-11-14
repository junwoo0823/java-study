package java0622;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Point2DD {
	private int x;
	private int y;
	
	// 부모클래스가 기본생성자가 없는 클래스일때 상속받는 클래스 작성시 유의사항
	
	Point2DD(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return x + ", " + y;
	}
}

// Point3DD 클래스  상속 Point2DD
//   멤버변수 z
//   기본생성자.   x는 1, y는 2, z는 3으로 초기화
//   x, y, z를 받아서 초기화하는 생성자
//   getLocation() 메소드 오버라이딩. 이클립스 자동완성 사용.  return "x, y, z"

// 생성자 없는 클래스는 존재하지 않음.
// 생성자의 첫 실행문은 항상 super() 호출문이 됨.

class Point3DD extends Point2DD {
	private int z;
	
	Point3DD() {
		this(1, 2, 3);
	}
	
	Point3DD(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String getLocation() {
		return super.getLocation() + ", " + z;
	}
}

public class Ex7 {

	public static void main(String[] args) {
		Point3DD p = new Point3DD();
		System.out.println(p.getLocation());
		
		Point3DD p2 = new Point3DD(10, 20, 30);
		System.out.println(p2.getLocation());
	} // main

}




