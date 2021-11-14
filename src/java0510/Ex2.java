package java0510;

public class Ex2 {

	public static void main(String[] args) {
		// 문자열 결합
		String name = "Ja" + "va";
		
		// String형 + double형
		// String형 + String형
		// "Java" + "8.0"
		// "Java8.0"
		String str = name + 8.0; 
		System.out.println("str = " + str); // str = Java8.0
		
		System.out.println(7 + 7 + ""); // "14"
		System.out.println("" + 7 + 7); // "7" + 7 = "7" + "7" = "77"
		
	} // main

}
