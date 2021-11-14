package java0520;

public class Ex5 {

	public static void main(String[] args) {
		// 비정방형 2차원 배열
		int[][] numArr = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6, 7 }
		};
		
		// 출력
		for (int r=0; r<numArr.length; r++) { // 행
			for (int c=0; c<numArr[r].length; c++) { // 열
				System.out.print(numArr[r][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		String[][] names = {
				{ "홍길동", "이순신" },
				{ "유관순" }
		};
		
		for (int r=0; r<names.length; r++) { // 행
			for (int c=0; c<names[r].length; c++) { // 열
				System.out.print(names[r][c] + "\t");
			}
			System.out.println();
		}
		
	} // main

}





