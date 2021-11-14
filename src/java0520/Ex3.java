package java0520;

public class Ex3 {

	public static void main(String[] args) {
		// 정수형 배열 numArr에 임의의 정수 10개 저장
		int[] numArr = { 79, 88, 91, 33, 100, 55, 95, 81, 75, 64 };
		int evenCnt = 0; // 짝수의 개수
		int oddCnt = 0; // 홀수의 개수
		int evenSum = 0; // 짝수의 합
		int oddSum = 0; // 홀수의 합

		// 짝수 및 홀수의 개수 구하기
		// 짝수 및 홀수의 합 구하기
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] % 2 == 0) { // 짝수
				evenCnt++;
				evenSum += numArr[i]; // evenSum = evenSum + numArr[i];
			} else { // 홀수
				oddCnt++;
				oddSum += numArr[i]; // oddSum = oddSum + numArr[i];
			}
		}

		System.out.println("짝수 개수: " + evenCnt); // 3
		System.out.println("홀수 개수: " + oddCnt); // 7
		System.out.println("짝수 합: " + evenSum); // 252
		System.out.println("홀수 합: " + oddSum); // 509

		System.out.println("============================");

		// 배열 요소중에 최대값 구하기
		int max = numArr[0]; // 배열 첫번째 요소값으로 초기화
		for (int i = 0; i < numArr.length; i++) {
			if (max < numArr[i]) {
				max = numArr[i]; // 최대값을 max에 저장
			}
		}
		System.out.println("numArr배열의 최대값은 " + max);

		// 배열 요소중에 최소값 구하기
		int min = numArr[0];
		for (int i = 0; i < numArr.length; i++) {
			if (min > numArr[i]) {
				min = numArr[i]; // 최소값을 min에 저장
			}
		}
		System.out.println("numArr배열의 최소값은 " + min);

		System.out.println("============================");

		// 값 서로 바꾸기
		int a = 10;
		int b = 20;
		int tmp = 0; // 잠시 저장하는 임시변수

		tmp = a;
		a = b;
		b = tmp;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("============================");

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();

		System.out.println("============================");

		// [79] 88 91 33 100 55 95 81 75 64
		// [88] 79 91 33 100 55 95 81 75 64
		// [91] 79 88 33 100 55 95 81 75 64
		// [100] 79 88 33 91 55 95 81 75 64

		// 내림차순 정렬 과정

		// numArr[0] 최대값
		for (int i = 1; i < numArr.length; i++) {
			// 최대값 구해서 맞바꾸기
			if (numArr[0] < numArr[i]) {
				tmp = numArr[0];
				numArr[0] = numArr[i];
				numArr[i] = tmp;
			}
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();

		System.out.println("============================");

		// numArr[1] 최대값
		for (int i = 2; i < numArr.length; i++) {
			// 최대값 구해서 맞바꾸기
			if (numArr[1] < numArr[i]) {
				tmp = numArr[1];
				numArr[1] = numArr[i];
				numArr[i] = tmp;
			}
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("============================");
		
		// 내림차순 정렬하기
		tmp = 0;
		for (int i=0; i<numArr.length; i++) { // i 기준
			for (int j=i+1; j<numArr.length; j++) {
				if (numArr[i] < numArr[j]) {
					tmp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
	} // main

}
