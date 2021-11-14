package java0510;

public class Ex5 {

	public static void main(String[] args) {
		// 연산자의 종류
		
		// 산술연산자   +  -  *  /  %
		// 비교연산자   >  <  >=  <=  ==  !=
		// 논리연산자   &&  ||  !   (and 그리고, or 또는, not 으로 읽음)
		// 대입연산자   =   +=  -=  *=  /=  %= 
		// 조건연산자   (조건식) ? 참값 : 거짓값;
		// 형변환연산자    (자료형)
		// 인스턴스확인연산자   instanceof
		
		System.out.println(5 + 3 * 4); // 17
		System.out.println(-3 - 5); // -8
		
		int x;
		int y;
		x = y = 3;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("=====================");
		
		// 증감 연산자   ++(1 증가)  --(1 감소)
		// 변수++ : 후위형
		// ++변수 : 전위형
		
		int i=5, j=0;
		
		j = i++;
		System.out.println("j = i++; 실행후, i = " + i + ", j = " + j); // i = 6, j = 5
		
		System.out.println("=====================");
		
		i=5;
		j=0;
		
		j = ++i;
		System.out.println("j = ++i; 실행후, i = " + i + ", j = " + j); // i = 6, j = 6
		
		// 부호연산자
		int num = -10; // 음수 부호 표현
		// num = num * -1;
		num = -num; // 부호 반대로 바꾸기
		System.out.println("num = " + num); // num = 10
	} // main

}





