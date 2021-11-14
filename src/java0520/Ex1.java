package java0520;

public class Ex1 {

	public static void main(String[] args) {
		
		int a1, a2, a3, a4, a5; // 정수형 변수 5개 선언
		// System.out.println("a1 = " + a1); // 초기화 되지 않음
		a1 = 0; // 초기화 해줌
		
		// 배열(array): 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		//  자바에서 배열은 String과 같은 객체이다.
		
		String str;  // 문자열 참조변수(4byte) 선언
		str = new String("안녕"); // 참조변수에 생성된 문자열 객체의 주소를 저장
		
		// 객체는 각 변수가 기본값으로 초기화됨
		// 숫자형: 0
		// 참조형: null
		// 논리형: false
		
		int[] arr; // 배열 참조변수(4byte) 선언
		arr = new int[5]; // 참조변수에 생성된 배열객체의 주소를 저장
		
		// 배열의 인덱스 범위는 0 ~ 배열크기-1
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60; // 인덱스 범위를 벗어남!
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
		System.out.println("arr[4] = " + arr[4]);
		
		System.out.println("=========================");
		
		for (int i=0; i<=4; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		System.out.println("=========================");
		
		// 배열선언과 동시에 초기화
		int[] arrB = { 10, 20, 30 };
		//arrB = { 100, 200, 300, 400, 500 }; // 배열변수에 수정이 불가능함
		
		System.out.println("배열의 크기: " + arrB.length); // 3
		
		for (int i=0; i < arrB.length; i++) {
			System.out.println("arrB[" + i + "] = " + arrB[i]);
		}
		
		System.out.println("=========================");
		
		
		int[] arrC = new int[] { 100, 200, 300 };
		arrC = new int[] { 10, 20, 30, 40, 50 };
		
		for (int i=0; i<arrC.length; i++) {
			int num = arrC[i];
			System.out.println("arrC[" + i + "] = " + arrC[i]);
		}
		
		System.out.println("=========================");
		
		// for-each문
		for (int num : arrC) {
			System.out.println("num = " + num);
		}
		
		System.out.println("=========================");
		
		String[] strArr = new String[4];
		
		strArr[0] = "홍길동";
		strArr[1] = "성춘향";
		strArr[2] = "이몽룡";
		
		for (int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("=========================");
		
		for (String name : strArr) {
			System.out.println(name);
		}

	} // main

}



