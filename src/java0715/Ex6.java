package java0715;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println("test2.txt 파일을 읽어서 test2 - 복사본.txt 파일을 생성하는 프로그램.");

		String projectPath = System.getProperty("user.dir");
		String inputPath = projectPath + "\\temp\\test2.txt"; // 파일을 읽어들일 경로 문자열
		String outputPath = projectPath + "\\temp\\test2 - 복사본.txt"; // 파일을 출력(생성)할 경로 문자열
		
		// 파일 문자 입력스트림 준비 (FileReader)
		BufferedReader reader = null;
		// 파일 문자 출력스트림 준비 (FileWriter)
		FileWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader(inputPath));
			writer = new FileWriter(outputPath);
			
			String line = "";
			while ((line = reader.readLine()) != null) {
				writer.write(line + "\n");
				//writer.flush();
			}
			
//			while (true) {
//				line = reader.readLine();
//				if (line == null) {
//					break;
//				}
//				
//				writer.write(line + "\n");
//				//writer.flush();
//			}
			
			System.out.println("파일 복사 완료.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) reader.close();
				if (writer != null) writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료.");
	} // main

}






