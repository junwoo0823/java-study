package java0623;


class StaticTest {
	
	static final int MAX = 500; // 상수일때는 static final 형태로 주로 사용함(메모리를 효율적으로 사용하기 위함)
	static int a = 10; // 클래스 변수. 정적 변수. 클래스마다 한개씩 생성. -> 공유변수 용도
	
	// 스태틱 초기화 블록 : 클래스가 로딩되면 static멤버 초기화를 위해 바로 호출됨
	static {
		// 클래스 로딩 후
		// static변수 초기화 또는 static 메소드 호출을 하기위해 사용함.
		a = 100;
		staticPrint();
		//instancePrint(); // 인스턴스 멤버 사용 불가능
	}
	
	static void staticPrint() {
		System.out.println("a = " + a); // 스태틱 메소드에서는 스태틱(클래스)변수만 사용가능
		//System.out.println("b = " + b); // 스태틱 메소드에서는 인스턴스(객체단위)변수 사용불가
	}
	
	//=====================================
	
	int b = 20; // 인스턴스 변수. 인스턴스마다 한개씩 생성.
	
	void instancePrint() { // 인스턴스 단위 메소드
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}


public class Ex3 {

	public static void main(String[] args) {
		// static : 객체생성없이  클래스이름.static멤버 로 접근
		
		System.out.println(StaticTest.a); // 10
		
		StaticTest st = new StaticTest();
		//System.out.println(st.a); // 10   동작은 하지만 권장하지 않는 표현
		System.out.println(st.b); // 20
		
		StaticTest.a++; // 11
		st.b++; // 21
		
		StaticTest st2 = new StaticTest();
		System.out.println(StaticTest.a); // 11
		System.out.println(st2.b);  // 20
		
		
		//Math math = new Math();  // 객체생성 없이 바로사용하도록 static 메소드로 구성됨
		System.out.println("PI : " + Math.PI);
		System.out.println("원의 면적: " + (5 * 5 * Math.PI));
		System.out.println("-5의 절대값: " + Math.abs(-5));

	} // main

}





