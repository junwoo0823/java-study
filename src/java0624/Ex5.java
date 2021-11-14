package java0624;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Ex5 {

	public static void main(String[] args) {
		// Random 클래스: 임의의 값을 생성해주는 클래스
		Random random = new Random();
		System.out.println("0이상 10미만의 임의의 정수: " + random.nextInt(10));

		System.out.println(random.nextBoolean());
		System.out.println(random.nextFloat());
		System.out.println("=========================");
		
		// 날짜와 시간: Date 클래스, Calendar 클래스
		
		Date date = new Date();
		System.out.println(date.toString());
		
  		// yyyy 년도  MM 월  dd 일  a 오전/오후  hh 시 mm 분 ss 초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
		System.out.println("=========================");
		
		Calendar cal = Calendar.getInstance(); // 현재 날짜와 시간정보를 가짐
		
		System.out.println(cal.get(Calendar.YEAR) + "년"); // 2021 현재년도
		// 월은 1월이 0부터 시작
		System.out.println((cal.get(Calendar.MONTH) + 1) + "월");
		System.out.println(cal.get(Calendar.DATE) + "일");
		
		// 시간
		int amPm = cal.get(Calendar.AM_PM);
		System.out.println((amPm == 0) ? "오전" : "오후"); // 0 오전, 1 오후
		
		System.out.println(cal.get(Calendar.HOUR) + "시");
		System.out.println(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");
		
		// 요일은 일요일부터 1번으로 시작
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 5 목요일
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		}
		
		System.out.println("=========================");
		
		// Math : 수학관련    static 멤버로 구성됨
		System.out.println(Math.PI);
		System.out.println(Math.abs(-5)); // 절대값
		System.out.println(Math.max(10, 20)); // 큰수 구하기
		System.out.println(Math.pow(2, 3)); // 2*2*2 = 8
		
		// 소수점 첫째자리 기준으로 반올림 round  올림 ceil  내림 floor
		System.out.println(Math.round(3.5));  // 4
		System.out.println(Math.ceil(3.1));  // 4.0
		System.out.println(Math.floor(3.9)); // 3.0
		
	} // main

}





