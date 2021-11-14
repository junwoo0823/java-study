package java0624;

import java.util.StringTokenizer;

public class Ex3 {

	public static void main(String[] args) {
		// String은 불변객체이므로 문자열 조작이 빈번할때 쓰레기 객체가 많이 발생됨
		String str = "";
		str += "Java";
		str += " Programming";
		System.out.println(str);
		
		// StringBuffer 클래스
		//  : 가변크기 버퍼를 가지고 있음. 문자열값을 바로 수정가능.
		StringBuffer sb = new StringBuffer();
		sb.append("Java");
		sb.append(" Programming");
		System.out.println(sb.toString());

		sb.replace(0, 4, "JSP");
		System.out.println(sb.toString()); // JSP Programming
		
		sb.insert(3, ",");
		System.out.println(sb.toString()); // JSP, Programming
		
		// StringTokenizer : 문자열을 분리하기 위해 사용
		//                   String 클래스의 split() 메소드와 동일한 기능
		StringTokenizer st = new StringTokenizer("사과#배#수박#감#포도", "#");
		
		System.out.println(st.countTokens()); // 토큰개수 5개
		
		while (st.hasMoreTokens()) { // 다음 토큰이 있으면 true 리턴
			System.out.println(st.nextToken()); // 다음 토큰 꺼내기(꺼낸건 제거됨)
		}
		
		System.out.println(st.countTokens()); // 토큰개수 0개
		
		// 토큰을 다 빼고나면 다시 처음상태로 돌아갈 수 없으므로
		// 필요하다면 새로 객체를 만들어야 함
		
		System.out.println("==================================");
		
		String query = "name=홍길동&addr=busan&age=27";
		StringTokenizer st2 = new StringTokenizer(query, "&="); // &, = 모두 구분문자 됨
		
		while (st2.hasMoreElements()) {
			System.out.println(st2.nextToken());
		}
		
	} // main

}





