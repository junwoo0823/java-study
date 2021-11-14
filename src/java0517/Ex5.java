package java0517;

public class Ex5 {

	public static void main(String[] args) {
		// continue문
		//  : 자신을 감싸는 가장 가까운 반복문 블록을 한번 건너뜀(skip)
		
		for (int i=0; i<=10; i++) {
			if (i % 3 == 0) { // 3의 배수면
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("===============");
		
		for (int j=1; j<=10; j++) {
			if (j == 4) {
				continue;
			}
			System.out.println(j);
		}

	} // main

}



