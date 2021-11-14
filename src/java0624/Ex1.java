package java0624;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
    java.lang 패키지 : 자바의 기본 패키지
    
    Object 클래스의 메소드 : toString(), equals()

*/

class ObjectTest /*extends Object*/ {

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}

@Getter @Setter @AllArgsConstructor @ToString
class Puppy {
	private String name;
	private int age;
	
//	@Override
//	public String toString() {
//		return "Puppy [name=" + name + ", age=" + age + "]";
//	}
	
	@Override
	public boolean equals(Object obj) {
		// instanceof 연산자: 실행중에 실제 객체의 타입이 Puppy인지 확인
		// true / false 리턴
		if (!(obj instanceof Puppy)) {
			return false;
		}
		
		boolean result = false;
		Puppy puppy = (Puppy) obj; // 다운캐스팅
		if (name.equals(puppy.name) && age == puppy.age) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		// Object : java.lang.Object
		//          최상위 클래스, 모든 클래스는 Object 상속받음
		//          클래스들의 공통적인 부분을 정의해놓음.
		Object ot = new ObjectTest();
		System.out.println(ot.getClass()); // 현 객체의 런타임 클래스를 리턴
		
		// toString()은 객체의 스트링 표현을 리턴해줌
		System.out.println(ot);  // toString()이 출력문 내에서는 자동호출됨
		System.out.println(ot.toString()); // toString()은 재정의 용도
		
		// equals() 메소드 : 현재객체와 매개변수로 받은 객체가 내용이 같은지 비교
		//                   재정의(오버라이딩)하는 용도.
		int a = 10, b = 10;
		if (a == b) {
			System.out.println("숫자가 서로 같다.");
		} else {
			System.out.println("숫자가 서로 다르다.");
		}
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		if (str1 == str2) {
			System.out.println("참조주소가 서로 같다.");
		} else {
			System.out.println("참조주소가 서로 다르다.");
		}
		// String 클래스는 equals() 가 이미 재정의(오버라이딩) 되어 있음
		if (str1.equals(str2)) {
			System.out.println("문자열 내용이 서로 같다.");
		} else {
			System.out.println("문자열 내용이 서로 다르다.");
		}
		
		Puppy puppy1 = new Puppy("진돗개", 5);
		Puppy puppy2 = new Puppy("진돗개", 5);
		if (puppy1.equals(puppy2)) {
			System.out.println("강아지 두마리 모두 이름과 나이가 같다.");
		} else {
			System.out.println("강아지 두마리가 이름 또는 나이가 다르다.");
		}
		
		System.out.println(puppy1.getName());
		System.out.println(puppy1.toString());
		
		System.out.println("============================");
		
		String str3 = "반가워";
		String str4 = "반가워";
		if (str3 == str4) {
			System.out.println("참조주소가 서로 같다.");
		} else {
			System.out.println("참조주소가 서로 다르다.");
		}
		// String 클래스는 equals() 가 이미 재정의(오버라이딩) 되어 있음
		if (str3.equals(str4)) {
			System.out.println("문자열 내용이 서로 같다.");
		} else {
			System.out.println("문자열 내용이 서로 다르다.");
		}
	} // main

}





