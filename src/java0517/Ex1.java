package java0517;

public class Ex1 {

	public static void main(String[] args) {
		// 중첩 for문
		
		// *****
		// *****
		// *****
		for (int j=1; j<=3; j++) { // 행의 개수 (3행)
			for (int i=1; i<=5; i++) { // 열의 개수 (5열)
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		// *
		// **
		// ***
		// ****
		// *****
		for (int r=1; r<=5; r++) { // 행(row)
			for (int c=1; c<=r; c++) { // 열(column)
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		
		// @@@@*
		// @@@**
		// @@***
		// @****
		// *****
		
		
		// 구구단 2단~9단 전체 출력
		
		// 2*1=2    2*2=4    2*3=6    ...   2*9=18
		// 3*1=3    3*2=6    3*3=9    ...   3*9=27
		// .....
		// 9*1=9    9*2=18   9*3=27   ...   9*9=81
		for (int dan=2; dan<=9; dan++) { // 행
			for (int i=1; i<=9; i++) {  // 열
				System.out.printf("%d * %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		// 2*1=2    3*1=3    4*1=4    ...   9*1=9
		// 2*2=4    3*2=6    4*2=8    ...   9*2=18
		// .....
		// 2*9=18   3*9=27   4*9=36   ...   9*9=81
		for (int i=1; i<=9; i++) { // 행
			for (int dan=2; dan<=9; dan++) {  // 열
				System.out.printf("%d * %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}
		
	} // main

}
