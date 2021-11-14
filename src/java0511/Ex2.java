package java0511;

public class Ex2 {

	public static void main(String[] args) {
		// 형변환 연산자 : 명시적(수동) 형변환, 강제 형변환
		//   서로 호환되는 자료형 끼리는 형변환이 가능함
		//   -> 호환: 기본자료형에서는 숫자형(정수형, 실수형)끼리 형변환 가능함
		
		// 실수형은 정수형보다 항상 큰 타입(자료형)이다.
		double dNum = 85; // double형(큰) = int형(작은)	 자동형변환 일어남
		int score = (int) dNum; // int형(작은) = (작게) double형(큰)
		System.out.println("score = " + score);
		
		long bigNum = 200; // long형(큰) = int형(작은)   자동형변환 일어남
		bigNum = 3_000_000_000L;
		System.out.println("bigNum = " + bigNum);
		
		int intNum = (int) bigNum; // int형(작은) = (작게) long형(큰)
		System.out.println("intNum = " + intNum);
		
		// 컴퓨터는 자료형(type)을 일치시킨 후에만 계산이 가능함
		// 자동 형변환
		int a = 10;
		int b = 20;
		int c = a + b; // int형 + int형 -> int형
		
		int d = 30;   // 4byte
		long e = 40L; // 8byte
		long f = d + e; // int형 + long형 -> long형 + long형 -> long형
		
		float g = 1.23f; // 4byte
		double h = 3.14; // 8byte
		double i = g + h; // float형 + double형 -> double형 + double형 -> double형
		
		// 같은 정수형끼리, 또는 같은 실수형끼리 연산에서는
		// 바이트 크기가 큰 쪽으로 자동 형변환된 후 연산이 이루어진다.
		
		// 정수형과 실수형 간에 연산 시에는 바이트 크기가 기준이 아니고
		// 실수형이 정수형보다 항상 크다. (바이트 크기과 관계 없다!)
		
		// long형(8byte) + float형(4byte)
		// -> float형 + float형
		// -> float형
		long lNum = 100L;
		float fNum = 3.14f;
		float result = lNum + fNum; // 100.0f + 3.14f -> 103.14f
		System.out.println("result = " + result); // result = 103.14
		
		// 정수형끼리 나눌때는 몫만 구하는 정수나눗셈을 수행함
		System.out.println(10 / 4); // int형 / int형 -> int형
		
		// 정수형끼리 나눌때 실수나눗셈을 하려면
		// 피연산자 둘중에 한개이상 실수형으로 변환해주면 됨
		System.out.println(10.0 / 4); // 2.5
		
		int num1 = 10;
		int num2 = 4;
		System.out.println((double) num1 / num2);
		// 실수형 나눗셈을 위해 형변환 연산자를 사용할수 있음
		
		int aNum = 1_000_000;
		int bNum = 2_000_000;
		
		long cNum = (long) aNum * bNum; // long형 * int형 -> long형 * long형 -> long형
		System.out.println("cNum = " + cNum);
		
	} // main

}




