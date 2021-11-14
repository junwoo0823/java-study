package java0520;

public class Ex6 {

	public static void main(String[] args) {
		// 정수형 2차원 배열 scores
		int[][] scores = {
				{ 85, 60, 70 },
				{ 90, 95, 80 },
				{ 75, 80, 100 },
				{ 80, 75, 95 },
				{ 100, 65, 80 }
		};
		
		// 출력형식
		// 1번학생    85  60  70   총점  평균
		// 2번학생    90  95  80   총점  평균
		// 3번학생    75  80  100  총점  평균
		// 4번학생    80  75  95   총점  평균
		// 5번학생   100  65  80   총점  평균
		int sum = 0;
		double avg = 0;
		for (int r=0; r<scores.length; r++) {
			System.out.print((r + 1) + "번학생: \t");
			sum = 0;
			for (int c=0; c<scores[r].length; c++) {
				System.out.print(scores[r][c] + "\t");
				sum += scores[r][c];
			} // for
			avg = (double) sum / scores[r].length;
			
			System.out.print(sum + "\t");
			System.out.print(avg + "\n");
		} // for
	} // main

}





