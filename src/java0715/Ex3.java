package java0715;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("키보드에서 입력받은 데이터를 test.txt 파일로 저장하는 프로그램.");
		System.out.println("데이터 입력을 중지하려면 ctrl z를 누르세요");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
//		String classPath = Ex3.class.getResource(".").getPath();
//		System.out.println(classPath);
		
		String path = projectPath + "\\temp\\test.txt"; // 파일을 생성할 경로 문자열
		System.out.println(path); // C:\kjw\workspace_new\java-study\temp\test.txt
		
		
		// 입력 스트림 준비
		Scanner scanner = new Scanner(System.in);
		// 출력 스트림 준비
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(path);
			
			String line = "";
			// nextLine()은 '\n'문자 기준으로 '\n'문자를 제외시켜서 한줄을 가져옴. 
			while (scanner.hasNextLine()) { 
				line = scanner.nextLine();
				
				System.out.print(line + "\n");
				writer.write(line + "\n");
				// 출력스트림은 대부분 내부적으로 버퍼가 있어서
				// write() 호출시 출력내용을 곧장 내보내지 않음.
				writer.flush(); // 버퍼 비우기
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			
			try {
				writer.close(); // 출력스트림 닫으면 내부적으로 flush()가 호출됨.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료.");
	} // main

}
