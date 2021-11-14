package java0512;

public class Ex4 {

	public static void main(String[] args) {
		// 논리 부정 연산자   !
		boolean b = true;
		System.out.printf("b = %b%n", b);  // b = true
		System.out.printf("b = %b%n", !b); // b = false
		System.out.printf("b = %b%n", !!b);  // b = true
		System.out.printf("b = %b%n", !!!b); // b = false
		
		int age = 15;
		// 나이가 10대가 아니다. 
		// !(age >= 10  && age <= 19)
		
		// age < 10 || age > 19
		
		System.out.println(age);
		
		
		
	} // main

}
