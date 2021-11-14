package java0514;

public class Ex5 {

	public static void main(String[] args) {
		// 1~3 사이의 임의의 정수 만들기
		
		// 0.0 <= Math.random() < 1.0
		
		// (0.0 ~ 0.9999) * 3 
		// 0 ~ 2.7  (int) 형변환연산자 사용해서 정수형으로 변환
		// ( 0 ~ 2 ) + 1
		// 1 ~ 3
		int num = (int) (Math.random() * 3) + 1;
		System.out.println("1~3 중 임의의 정수: " + num);
		
		System.out.println("===============================");
		
		// 10 ~ 20 사이의 임의의 정수 구하기
		// (0 ~ 10) + 10
		num = (int) (Math.random() * 11) + 10;
		System.out.println("10~20 중 임의의 정수: " + num);
		
		System.out.println("===============================");
		
		// 1 ~ 100 사이의 임의의 정수 구하기
		// (0 ~ 99) + 1
		num = (int)(Math.random() * 100) + 1;
		System.out.println("1~100 중 임의의 정수: " + num);
		
	} // main

}





