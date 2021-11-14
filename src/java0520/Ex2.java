package java0520;

public class Ex2 {

	public static void main(String[] args) {
		// 점수 배열
		int[] score = { 100, 90, 80, 70, 67 };
		int sum = 0;     // 점수들의 합계 구할 변수
		double avg = 0;  // 점수들의 평균 구할 변수
		
		// 합계구하기
//		for (int i=0; i<score.length; i++) {
//			sum = sum + score[i]; // sum += score[i];
//		}
		
		// for-each문으로 합계 구하기
		for (int num : score) {
			sum += num;
		}
		
		// 평균구하기
		avg = (double) sum / score.length;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	} // main

}
