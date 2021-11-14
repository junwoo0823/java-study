package java0601;

public class Ex3 {

	public static void main(String[] args) {
		// 객체생성
		Point p = new Point();
		System.out.println(p.x);
		System.out.println(p.y);
		p.showPoint();

		p.x = 10;
		p.y = 20;
		p.showPoint();
		
		p.setX(100);
		p.setY(200);
		
		System.out.println("===================");
		
		Point p2 = new Point(300);
		p2.showPoint();
		
		Point p3 = new Point(300, 400);
		p3.showPoint();
		
	} // main

}



