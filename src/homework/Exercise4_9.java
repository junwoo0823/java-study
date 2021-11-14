package homework;

public class Exercise4_9 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while (num > 0) {
			int n = num % 10; // 나머지 한자리 구하기
			sum += n;
			System.out.println("num="+num+", sum="+sum);
			num = num / 10; // num /= 10;
		}
		System.out.println("sum = " + sum);
	}

}
