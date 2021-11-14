package java0512;

public class Ex2 {

	public static void main(String[] args) {
		// 문자열 간의 비교는 == 가 아닌 equals 메소드로 비교해야 함!
		
		String str1 = "abc";
		String str2 = new String("abc");
		// 참조변수는 객체의 주소를 저장하는 용도이기 때문에
		// 비교연산자를 사용해서 비교하면 주소값 비교가 됨
		// 그러므로 내용비교를 위해서는 equals() 메소드를 사용해야 함
		
		System.out.println(str1 == str2); // false
		
		// 객체 참조 연산자 (.)
		System.out.println(str1.equals(str2)); // true
		System.out.println(str2.equals(str1)); // true
		
		System.out.println(str1.equals("abc")); // true
		System.out.println("abc".equals(str1)); // true
		
		System.out.println(str1.equalsIgnoreCase("AbC")); // true
		
		
		// 특수문자 출력하려면 이스케이프(escape) 문자 \를 먼저 쓰고 사용함
		//   \"   \'   \n   \t    \\
		System.out.println("\"안녕~!\"");
		
		// 논리연산자
		int x = 15;
		// x 는 10보다 크고, 20보다 작다.
		// x > 10 && x < 20
		// true && true
		// true
		System.out.println(x > 10 && x < 20); // true
		
		// x 는 10보다 크고, 20보다 작다.
		// 10 < x < 20
		// true < 20
		// System.out.println(10 < x < 20); // 이렇게 범위 표현은 안됨
		
		System.out.println(10 < x && x < 20);
		
		
		
		x = 100;
		// x 는 10보다 크거나, 20보다 작다.
		// x > 10 || x < 20
		// true || false
		// true
		System.out.println(x > 10 || x < 20); // true
		
		
		// i는 2의 배수 또는 3의 배수이다.
		int i = 24;
		System.out.println(i % 2 == 0  ||  i % 3 == 0); // false
		
		// i는 2의 배수 또는 3의 배수지만 6의 배수는 아니다.
		boolean bVal = (i % 2 == 0  ||  i % 3 == 0)  &&  (i % 6 != 0) ;
		System.out.println("bVal = " + bVal);
		
		// && 가 || 보다 우선순위가 높음에 주의!
		
	} // main

}




