package java0621;

class MethodTest2 {
	// 정수형 1개 받아서 출력
	void printData(int num) {
		System.out.println(num);
	}
	// 정수형 2개 받아서 출력
	void printData(int a, int b) {
		System.out.println(a + "\t" + b);
	}
	// 정수형 3개 받아서 출력
	void printData(int a, int b, int c) {
		System.out.println(a + "\t" + b + "\t" + c);
	}
	// 가변인자(비정형인자) variable arguments
	void printData(int... nums) {
		// int... -> int[] 일차원 배열객체로 전달받음
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
	}
}


public class Ex6 {

	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		mt.printData(10);
		mt.printData(10, 20);
		mt.printData(10, 20, 30);
		mt.printData(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

	} // main

}





