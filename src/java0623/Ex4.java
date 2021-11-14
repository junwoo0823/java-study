package java0623;

// 해당 클래스를 상속 못하게 막아줌
/*final*/ class FinalTest {
	// 상수필드는 선언시에 반드시 값을 지정해야 함.
	// public static final로 선언하는게 일반적임
	public static final int MAX_SIZE = 10; // 변수의 상수화. 값 변경 안됨. 인스턴스 상수
	
	// 메소드 오버라이딩(재정의) 못하게 막아줌
	/*final*/ int getMaxSize() {
		final int LV_MAX = MAX_SIZE; // LV_MAX 는 지역상수
		return MAX_SIZE;
	}
}

class FinalSubTest extends FinalTest { // 상속

	@Override
	int getMaxSize() {
		return super.getMaxSize();
	}
}


public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
