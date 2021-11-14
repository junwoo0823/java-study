package java0528;

public class Ex2 {
	
	static void hello() {
		System.out.println("Hello Java");
	}
	
	static void sum(final int a, final int b) {
		if (a < 0 || b < 0) {
			return;
		}
		
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	static int abs(int num) {
		if (num < 0) {
			num = -num;
		}
		return num;
	}
	
	static int max(int x, int y) {
		return  (x > y) ? x : y ;
		
//		if (x > y) {
//			return x;
//		} else { // x <= y
//			return y;
//		}
		
//		int result = 0;
//		if (x > y) {
//			result = x;
//		} else { // x <= y
//			result = y;
//		}
//		return result;
	} // end of max
	
	static int oneToNumSum(int num) {
		if (num < 0) {
			return -1;
		}
		
		int sum = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
	} // end of oneToNumSum
	
	
	static int randomNum(int begin, int end) {
		// begin과 end 사이의 임의의 정수
		int count = end - begin + 1;
		int num = (int) (Math.random() * count) + begin;
		return num;
	} // end of randomNum
	
	
	static int[] getThreeNumbers() {
		int[] arr = new int[3];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = randomNum(1, 10);
		}
		
		return arr;
	}
	
	

	public static void main(String[] args) {
		
		final int MY_NUM = 10; // final 변수. 상수
		//myNum = 20;
		
		// 함수호출
		
		// hello() 호출.  출력  "Hello Java"
		hello();
		
		// sum(10, 20) 호출.  출력  "10 + 20 = 30"
		sum(10, 20);
		
		// abs(-5) 호출.    절대값 구한결과(5)를 리턴해줌
		int num = abs(-5);
		System.out.println("-5의 절대값은 " + num);
		
		// max(10, 20) 호출.   최대값(20) 구해서 리턴해줌
		System.out.println("10과 20 중 최대값은 " + max(10, 20));
		
		// oneToNumSum(10) 호출.  1부터 10까지의 누적합을 구해서 리턴해줌
		System.out.println("1부터 10까지의 누적합은 " + oneToNumSum(10));
		
		// randomNum(1, 10) 호출.  1~10 사이의 임의의 정수를 구해서 리턴해줌
		System.out.println("1~10 사이의 임의의 정수는 " + randomNum(1, 10));
	} // main

}
