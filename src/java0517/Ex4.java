package java0517;

public class Ex4 {

	public static void main(String[] args) {
		// break문
		//  : 자신을 감싸는 가장 가까운 switch문, 반복문 코드블록을 빠져나옴

		int sum = 0;
		int i = 0;
		
		while (true) {
			if (sum > 100) {
				break;
			}
			
			i++;
			sum += i;
		} // while
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
		
		
		System.out.println("=====================");
		
		for (int j=1; j<=10; j++) {
			if (j == 4) {
				break;
			}
			System.out.println(j);
		}
	} // main

}



