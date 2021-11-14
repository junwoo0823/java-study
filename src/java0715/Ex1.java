package java0715;

import java.io.InputStream;

public class Ex1 {

	public static void main(String[] args) {
		// 자바 IO 데이터 종류
		// byte : 이미지 파일 등 바이너리 위주의 데이터 입출력
		//        InputStream - FileInputStream (BufferedInputStream)
		//        OutputStream - FileOutputStream (BufferedOutputStream)
		// char : 입출력 char단위 처리. 텍스트 위주의 데이터 입출력
		//        Reader - FileReader (InputStreamReader, BufferedReader)
		//        Writer - FileWriter (OutputStreamWriter, BufferdWriter)

		// 표준 입출력 (Standard IO)
		// 입력(키보드) : System.in.read()
		// 출력(모니터 콘솔) : System.out.println()
		
		System.out.println("데이터 입력을 중지하려면 ctrl z(-1을 리턴)를 누르세요");
		
		InputStream in = System.in;
		int data = 0;
		try {
			data = in.read(); // 바이트 단위 입력 스트림으로부터 한 바이트 입력받기
			System.out.println("data = " + (char) data);
			
			data = in.read();
			System.out.println("data = " + (char) data);
			
			data = in.read();
			System.out.println("data = " + (char) data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료.");
	} // main

}
