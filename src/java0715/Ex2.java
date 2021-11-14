package java0715;

import java.io.InputStream;
import java.io.PrintStream;

public class Ex2 {

	public static void main(String[] args) {
		
//		int a = 10;
//		int b;
//		int c;
//		System.out.println(c = b = a); // 대입연산 후 최종 대입된 c를 출력에 사용
		
		// 표준 입출력 (Standard IO)
		// 입력(키보드) : System.in.read()
		// 출력(모니터 콘솔) : System.out.println()
		
		System.out.println("데이터 입력을 중지하려면 ctrl z(-1을 리턴)를 누르세요");
		// 바이트스트림 입출력 메소드는 스트림의 끝을 만나면 -1을 리턴해줌.
		
		
		InputStream in = System.in;
		PrintStream out = System.out;
		
		int data = 0;
		try {
//			while ((data = in.read()) != -1) { // data != -1
//				out.write(data);
//			}
			
			while (true) { // data != -1
				data = in.read();
				if (data == -1) {
					break;
				}
				out.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료.");
	} // main

}
