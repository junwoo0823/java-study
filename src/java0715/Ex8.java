package java0715;

import java.io.File;
import java.util.Date;

public class Ex8 {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "\\temp\\test2.txt";
		String directoryPath = projectPath + "\\temp";
		
		File file = new File(filePath); // test2.txt 파일
		File dirFile = new File(directoryPath); // temp 디렉토리(폴더)
		
		System.out.println(file.exists()); // test2.txt 파일 존재여부 true/false 리턴
		System.out.println("file isFile : " + file.isFile());
		System.out.println("file isDirectory : " + file.isDirectory());
		
		System.out.println(dirFile.exists()); // temp 디렉토리 존재여부
		System.out.println("dirFile isDirectory : " + dirFile.isDirectory());
		System.out.println("dirFile isFile : " + dirFile.isFile());
		
		//=================================================
		
		String dirName = directoryPath + "\\java_sample\\aa\\bb";
		File dirFile2 = new File(dirName);
		if (dirFile2.exists() == false) { // !dirFile2.exists()
			dirFile2.mkdirs();
		}

		// 파일 또는 디렉토리 이름변경
		dirFile2.renameTo(new File(directoryPath + "\\java_sample\\aa\\bbbb"));
		
		System.out.println("파일이름: " + file.getName());
		System.out.println("파일경로: " + file.getPath());
		System.out.println("파일수정일: " + new Date(file.lastModified()));
		System.out.println("파일크기(바이트): " + file.length() + " byte");
		System.out.println("파일권한(쓰기): " + file.canWrite());
		System.out.println("파일존재여부: " + file.exists());
		System.out.println("================================");
		
		File[] files = dirFile.listFiles();
		for (File f : files) {
			System.out.print(f.getName());
			System.out.print("\t" + f.length());
			System.out.println("\t" + (f.isDirectory() ? "디렉토리" : ""));
		}
		
		System.out.println("프로그램 종료.");
	} // main

}







