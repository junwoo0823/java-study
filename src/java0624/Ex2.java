package java0624;


public class Ex2 {

	public static void main(String[] args) {
		// String 클래스
		String str = "Java Programming";
		
		System.out.println(str.length()); // 16   문자열 길이(문자개수)
		
		if (str.equals("Java Programming")) {
			System.out.println("문자열 같음");
		}
		
		System.out.println(str.charAt(5)); // P // 지정된 인덱스에 있는 문자 한개 리턴
		// 부분문자열 가져오기
		System.out.println("부분문자열 인덱스 5부터 끝까지: " + str.substring(5)); // Programming
		System.out.println("부분문자열 인덱스 5이상 8미만: " + str.substring(5, 8)); // Pro
		System.out.println("문자열 연결: " + str.concat("!!!"));
		System.out.println("문자열 교체: " + str.replace("Java", "JSP"));
		System.out.println("문자 인덱스 위치: " + str.indexOf('a')); // 1
		System.out.println("문자 인덱스 위치(뒤에서 찾기): " + str.lastIndexOf('a')); // 10
		System.out.println("문자열 인덱스 위치: " + str.indexOf("gram")); // 8
		System.out.println("대문자로 변환: " + str.toUpperCase());
		System.out.println("소문자로 변환: " + str.toLowerCase());
		
		// 문자열 분리
		String[] strArr = str.split(" ");
		for (String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println(str.contains("Pro")); // true
		System.out.println(str.startsWith("Jav")); // true
		System.out.println(str.endsWith("ing")); // true
		
		String str2 = "  [안  녕]  ";
		System.out.println(str2); // "  [안  녕]  "
		System.out.println(str2.trim()); // "[안  녕]"  좌우 공백문자열 제거
		
		System.out.println("=============================");
		
		// 주민번호  남,여 구분  ->  1,3 남   2,4 여
		String jumin = "981220-4234567";
		
		// 성별구분문자 추출하기   charAt 문자리턴   substring 문자열리턴    indexOf
		int beginIndex = str.indexOf('-') + 1; // 7
		
		char ch = jumin.charAt(beginIndex); // '4'
		String s = jumin.substring(beginIndex, beginIndex + 1); // "4"
		
		// if 비교   char ==     String .equals()
		
		// 남자   여자  출력하기
		if (ch == '1' || ch == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		if (s.equals("1") || s.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		System.out.println(str);
		
	} // main

}




