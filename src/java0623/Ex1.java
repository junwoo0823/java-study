package java0623;


class Parent {
	
	void parentPrn() {
		System.out.println("parentPrn()");
	}
}

class Child extends Parent {
	
	void childPrn() {
		System.out.println("childPrn()");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		// 참조(레퍼런스)형 형변환
		
		Child c = new Child();
		c.parentPrn();
		c.childPrn();
		
		Parent p;
		p = c;  // 부모타입(큰) = 자식타입(작은) : 자동형변환:업캐스팅(up-casting) -> 다형성
		p.parentPrn();
		//p.childPrn();  // 부모타입 참조변수로 자식멤버 접근 못함
		
		System.out.println("=====================");
		
		Parent p2 = new Child(); // 업캐스팅(자동형변환)
		p2.parentPrn();
		
		Child c2 = (Child) p2; // 자식타입(작은) = (형변환) 부모타입(큰) : 다운캐스팅(명시적 형변환)
		c2.parentPrn();
		c2.childPrn();
	} // main
}






