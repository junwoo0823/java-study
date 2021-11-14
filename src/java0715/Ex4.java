package java0715;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println("키보드에서 입력받은 데이터를 test2.txt 파일로 저장하는 프로그램.");
		System.out.println("데이터 입력을 중지하려면 ctrl z를 누르세요");
		
		String projectPath = System.getProperty("user.dir");
			
		String path = projectPath + "\\temp\\test2.txt"; // 파일을 생성할 경로 문자열
		System.out.println(path); // C:\kjw\workspace_new\java-study\temp\test2.txt
		
		
		// 입력 스트림 참조변수 준비
		BufferedReader reader = null;
		// 출력 스트림 참조변수 준비
		FileWriter writer = null;
		try {
			// 입력 스트림 객체 준비
			reader = new BufferedReader(new InputStreamReader(System.in, "utf-8")); //데코레이터 패턴
			// 출력 스트림 객체 준비
			writer = new FileWriter(path, true); // true는 append옵션 활성화.
			
			String line = "";
			// nextLine()은 '\n'문자 기준으로 '\n'문자를 제외시켜서 한줄을 가져옴. 
			while ((line = reader.readLine()) != null) { 
				
				System.out.print(line + "\n");
				writer.write(line + "\n");
				// 출력스트림은 대부분 내부적으로 버퍼가 있어서
				// write() 호출시 출력내용을 곧장 내보내지 않음.
				writer.flush(); // 버퍼 비우기
			}
			
//			while (true) {
//				line = reader.readLine();
//				if (line == null) {
//					break;
//				}
//				System.out.print(line + "\n");
//				writer.write(line + "\n");
//				writer.flush(); // 버퍼 비우기
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); // 최종적으로 사용한 입출력 객체를 닫으면 연결된 모든 객체가 자동으로 닫힘.
				writer.close(); // 출력스트림 닫으면 내부적으로 flush()가 호출됨.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료.");
	} // main

}
