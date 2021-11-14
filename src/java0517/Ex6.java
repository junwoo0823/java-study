package java0517;

public class Ex6 {

	public static void main(String[] args) {
		// 이름 붙은 반복문
		Loop1:
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if (j == 5) {
					break Loop1;
				}
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		
		

	} // main

}
