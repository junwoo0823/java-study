package java0715;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) {
		System.out.println("banana.jpg 이미지 파일을 읽어서 banana - 복사본.jpg 파일을 생성하는 프로그램.");

		String projectPath = System.getProperty("user.dir");
		String inputPath = projectPath + "\\temp\\banana.jpg"; // 파일을 읽어들일 경로 문자열
		String outputPath = projectPath + "\\temp\\banana - 복사본.jpg"; // 파일을 출력(생성)할 경로 문자열
		
		// 파일 바이트 입력스트림 준비 (FileInputStream)
		BufferedInputStream in = null;
		// 파일 바이트 출력스트림 준비 (FileOutputStream)
		FileOutputStream out = null;
		
		try {
			in = new BufferedInputStream(new FileInputStream(inputPath));
			out = new FileOutputStream(outputPath);
			
			int data = 0;
			
			while ((data = in.read()) != -1) {
				out.write(data);
			}
			
//			while (true) {
//				data = in.read();
//				if (data == -1) {
//					break;
//				}
//				
//				out.write(data);
//			}
			
			System.out.println("파일 복사 완료.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) in.close();
				if (out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료.");
	} // main

}






