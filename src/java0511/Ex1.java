package java0511;

public class Ex1 {

	public static void main(String[] args) {
		// printf() : print format 특정 형식으로 출력하기
		int age = 14;
		System.out.printf("age : %d%n", age);
		
		age = 22;
		System.out.printf("age : %d%n", age);
		
		int a = 100;
		int b = 200;
		System.out.println("a = " + a + ", b = " + b);
		System.out.printf("a = %d, b = %d%n", a, b);

		String url = "www.codechobo.com";
		float f1 = 0.10f;
		float f2 = 1e1f; // 1 곱하기 10의 1승
		float f3 = 3.14e3f; // 3.14 곱하기 10의 3승
		double d = 1.23456789;
		
		System.out.printf("f1 = %.2f, d = %.2f%n", f1, d);
		
		System.out.printf("url = %s%n", url);
		
		// 오버플로우
		// byte 범위 -128 ~ 127
		byte bNum = 127;
		bNum++;
		System.out.printf("bNum = %d%n", bNum); // bNum = -128
		
		bNum--;
		System.out.printf("bNum = %d%n", bNum); // bNum = 127
		
		
	} // main

}






