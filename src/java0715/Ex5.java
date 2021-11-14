package java0715;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println("test2.txt 파일 내용을 읽어서 콘솔 모니터에 출력하는 프로그램.");

		String projectPath = System.getProperty("user.dir");
		
		String path = projectPath + "\\temp\\test2.txt"; // 파일을 읽어들일 경로 문자열
		System.out.println(path);
		
		BufferedReader reader = null;
		
		
		try {
			reader = new BufferedReader(new FileReader(path));
			
			String line = "";
			while ((line = reader.readLine()) != null) {
				System.out.print(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료.");
	} // main

}
