package java0510;

public class Ex3 {

	public static void main(String[] args) {
		// 두 변수의 값 바꾸기
		int x = 10, y = 5;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("==============");
		
		int tmp; // 임시변수
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	} // main

}
