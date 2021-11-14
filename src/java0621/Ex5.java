package java0621;

// 생성자 오버로딩 허용 규칙
//  - 매개변수 개수가 다를때
//  - 매개변수 개수가 같으면 자료형이 다를때


// 메소드 오버로딩 허용 규칙
//  - 같은 클래스 내에서 동일한 이름의 메소드명
//  - 매개변수 개수가 다를때
//  - 매개변수 개수가 같으면 자료형이 다를때
//  - 메소드 리턴타입(반환형)은 오버로딩 규칙에 포함되지 않음!


class MethodTest {
	// 리턴형만 다른것은 오버로딩에 해당하지 않음!
//	int printData(int num) {
//		System.out.println(num);
//		return 0;
//	}
	
	void printData(int num) {
		System.out.println(num);
	}
	
	void printData(double num) {
		System.out.println(num);
	}
	
	void printData(char ch) {
		System.out.println(ch);
	}
	
	void printData(String str) {
		System.out.println(str);
	}
	
	void printData(boolean b) {
		System.out.println(b);
	}
}


public class Ex5 {

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		mt.printData(true);
		mt.printData('한');
		mt.printData(100);
		mt.printData(3.14);
		mt.printData("안녕하세요");
		
		System.out.println("=================");
		// println() 이 메소드 오버로딩(중복정의) 되어있음
		
		System.out.println(true);
		System.out.println('한');
		System.out.println(100);
		System.out.println(3.14);
		System.out.println("안녕하세요");
		

	} // main

}






