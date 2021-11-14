package java0528;

public class Ex3 {
	
	static void showArray(int[] arr) {
		System.out.println("showArray 함수에서 배열요소 출력:");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("showArray 함수에서 배열 0번째 요소 수정 후 출력:");
		arr[1] = 200; // 수정됨
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static void showNumber(int num) {
		System.out.println("showNumber()에서 num 출력: " + num); // 10
		num = 20;
		System.out.println("showNumber()에서 수정된 num 출력: " + num); // 20
	}
	
	public static void main(String[] args) {
		int num = 10; // 기본자료형 변수
		showNumber(num);
		System.out.println("main()에서 num 출력: " + num); // 10
		
		System.out.println("============================");
		
		int[] arr = { 10, 20, 30 };
		showArray(arr);
		System.out.println("main 함수에서 배열요소 출력:");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	} // main

}




