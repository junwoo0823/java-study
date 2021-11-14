package java0514;

public class Ex4 {

	public static void main(String[] args) {
		// switch문 연습
		
		// 학점에 따라 메시지 출력하기
		// 'A' - "아주잘함"
		// 'B' - "잘함"
		// 'C' - "보통"
		// 'D' - "노력필요"
		// 'F' - "많은 노력필요"
		// 그외 - "학점이 아닙니다" 
		
		// char형은 정수 호환형이므로 정수형 취급받음. switch문에서 사용가능
		char grade = 'F';
		
		switch (grade) {
		case 'A': System.out.println("아주잘함"); break;
		case 'B': System.out.println("잘함"); break;
		case 'C': System.out.println("보통"); break;
		case 'D': System.out.println("노력필요"); break;
		case 'F': System.out.println("많은 노력필요"); break;
		default: System.out.println("학점이 아닙니다");
		}
		
		System.out.println("============");
		
		String nation = "대한민국";
		
		// nation.equals("대한민국")
		switch (nation) {
		case "대한민국": System.out.println("Korea"); break;
		case "미국" : System.out.println("USA"); break;
		case "일본" : System.out.println("Japan"); break;
		}

	} // main

}




