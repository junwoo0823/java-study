package java0517;

public class Ex2 {

	public static void main(String[] args) {
		// while문 : 조건식이 참인동안 반복 수행
		
//		while (조건식) {
//			// 반복실행될 문장;
//		}
		
		// for (초기식; 조건식; 증감식)
		for (int i=1; i<=10; i++) { // 10회 반복
			System.out.println(i);
		}
		
		System.out.println("===================");
		
		int i=1; // 초기식
		while (i<=10) { // 조건식
			System.out.println(i);
			
			i++; // 증감식
		}
		
		System.out.println("===================");
		
		i = 5;
		
		while (i != 0) {
			i--;
			
			System.out.println(i + " - I can do it.");
		} // while
		
		System.out.println("===================");
		
		// 1부터 몇까지 더해야 100을 넘지 않는지 알아내는 예제
		int sum = 0; // 누적변수 0으로 초기화
		i = 0;
		
		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			i++;
			sum = sum + i; // sum += i;
		}
		
		System.out.printf("i=%d, sum=%d%n", i, sum);

	} // main

}






