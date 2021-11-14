package homework;

public class Exercise4_7 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0; // 누적합을 구할 변수는 0으로 초기화

		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			//int num = ch - '0';
			
			String s = ch + ""; // "1"
			int num = Integer.parseInt(s);
			
			System.out.println("num = " + num);
			
			sum += num;
		}
		
		System.out.println("sum = " + sum);
		
	} // main

}
