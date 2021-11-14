package java0624;

public class Ex4 {

	public static void main(String[] args) {
		// Wrapper 클래스
		//  : 자바는 기본적으로 객체지향언어이므로 객체를 대상으로 처리하는 경우가 많음.
		//    기본자료형의 값을 객체로 만들어서 사용할수 있도록 대응되는 Wrapper 클래스를 제공함

		// 기본자료형    <->    래퍼클래스(객체자료형)
		// byte          <->    Byte
		// short         <->    Short
		// int           <->    Integer
		// long          <->    Long
		// float         <->    Float
		// double        <->    Double
		// char          <->    Character
		// boolean       <->    Boolean
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
		// 문자열 "30" -> 기본자료형 30 바꾸기
		int a = Integer.parseInt("30"); // parse로 시작하는 메소드는 문자열을 처리 대상으로 함
		System.out.println(a);
		
		// int를 Integer 객체로 [박싱]하기
		Integer i1 = Integer.valueOf(20);
		Integer i2 = Integer.valueOf("30");
		
		// Integer 객체를 int로 [언박싱]하기
		int n1 = i1.intValue();
		
		// JDK 5 버전 이전까지는 자동 박싱 언박싱이 지원되지 않았음
		Integer i3 = Integer.valueOf(i1.intValue() + i2.intValue());
		
		// JDK 5 버전 이후에는 자동박싱 자동언박싱이 지원됨 (컴파일러가 위에 코드처럼 번역해줌)
		Integer i4 = i1 + i2;
		System.out.println("i4 = " + i4.toString()); // 출력에서 toString() 생략가능
		
		Integer num = 200; // 자동박싱 Integer.valueOf(200) 로 컴파일됨
		int num2 = num;    // 자동언박싱 num.intValue() 로 컴파일됨
		
		Float fnum = 3.14F;  // 자동박싱  Float.valueOf(3.14F)
		float fnum2 = fnum;  // 자동언박싱  fnum.floatValue()
		
		// 문자열 -> 숫자로 변환
		float fnum3 = Float.parseFloat("3.14");
		System.out.println("fnum3 = " + fnum3);
		
	} // main

}



