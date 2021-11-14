package java0623;

import java.util.ArrayList;

// 클래스 Shape 도형   // 부모
//    멤버변수   double area  // 도형의 면적
//    메소드     calcArea()    // area 를 단순히 리턴하는 메소드
class Shape {
	protected double area;
	
	public double calcArea() {
		return area;
	}
}
// 클래스 Circle 원   // 상속 Shape
//    멤버변수  int radius = 5  // 반지름
//    메소드     calcArea 오버라이딩   원의 면적(area)을 구해서 리턴하는 메소드
class Circle extends Shape {
	private int radius = 5;

	@Override
	public double calcArea() {
		area = radius * radius * 3.14;
		return area;
	}
}
// 클래스 Rectangle 사각형   // 상속 Shape
//    멤버변수  정수형 width 10   height 10   // 가로 세로
//    메소드     calcArea 오버라이딩   사각형의 면적(area)을 구해서(가로*세로) 리턴
class Rectangle extends Shape {
	private int width = 10;
	private int height = 10;
	
	@Override
	public double calcArea() {
		area = width * height;
		return area;
	}
}
// 클래스 Triangle 삼각형   // 상속 Shape
//    멤버변수  정수형 width 10   height 10   // 가로 세로
//    메소드     calcArea 오버라이딩   삼각형의 면적(area)을 구해서(가로*세로/2) 리턴
class Triangle extends Shape {
	private int width = 10;
	private int height = 10;
	
	@Override
	public double calcArea() {
		area = width * height / 2.0;
		return area;
	}
}

public class Ex2 {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		System.out.println("원의 면적: " + c.calcArea());
		
		Rectangle r = new Rectangle();
		System.out.println("사각형의 면적: " + r.calcArea());
		
		Triangle t = new Triangle();
		System.out.println("삼각형의 면적: " + t.calcArea());
		
		System.out.println("==================================");
		
		Shape s;
		s = new Circle(); // 업캐스팅: 메소드 오버라이딩. 부모변수로 접근가능
		System.out.println("면적: " + s.calcArea());
		
		s = new Rectangle();
		System.out.println("면적: " + s.calcArea());
		
		s = new Triangle();
		System.out.println("면적: " + s.calcArea());
		
		Triangle tri = (Triangle) s; // 다운캐스팅
		
		System.out.println("==================================");
		// ArrayList(배열리스트) : 가변크기 배열
		ArrayList list = new ArrayList();
		
		// add는 뒤에 추가하기
		list.add("안녕"); // 인덱스 0
		list.add(3);      // 인덱스 1
		list.add(true);   // 인덱스 2
		list.add(2.7);    // 인덱스 3
		
		String str = (String) list.get(0); // 다운캐스팅(명시적 형변환)
		
		System.out.println(str);

	} // main

}





