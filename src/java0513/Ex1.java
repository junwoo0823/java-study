package java0513;

public class Ex1 {

	public static void main(String[] args) {
		// 조건연산자 (삼항연산자)
		
		// 조건식 ? 참일때 수식 : 거짓일때 수식 ;
		int age = 20;
		String str = "";
		// 나이가 10대 범위에 있으면 str변수에 "10대" 저장
		//                 가 아니면 str변수에 "10대 아님" 저장
		str = (10 <= age && age <= 19) ?  "10대"  :  "10대 아님" ;
		System.out.println(age + "세 -> " + str);
		
		System.out.println("==================");
		
		// 주민등록번호 뒷번호에 첫째자리는 성별정보
		// 1남  2여  3남  4여  (5남  6여)
		int jumin = 4;
		// str 변수에 성별이 남자면 "남자", 여자면 "여자"라고 저장
		// str = (jumin == 1 || jumin == 3) ? "남자" : "여자" ;
		str = (jumin % 2 == 0) ? "여자" : "남자";
		System.out.println(jumin + " -> " + str);
		
		System.out.println("==================");
		
		int kor=85, eng=80, math=40;  // 국어, 영어, 수학 과목별 점수
		int sum = 0;            // 세과목 합계를 구할 변수
		double avg = 0.0;       // 세과목의 평균을 구할 변수. 소수점 이하 둘째자리까지 구하기. 
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		// 출력 형식
		//    국어:      영어:     수학:
		//    합계:      평균:   
		System.out.println("국어: " + kor + "\t영어: " + eng + "\t수학: " + math);
		System.out.printf("합계: %d\t평균: %.2f%n", sum, avg);
		
		// 평균 avg = 68.3333333
		// 68.333333 * 100
		// (int) 6833.3333  // 내림처리
		// 6833 / 100.0
		// 68.33
		avg = ((int) (avg * 100)) / 100.0;
		System.out.println("합계: " + sum + "\t평균: " + avg);
		
		// 평균이 60점 이상이고, 각 과목 점수가 40점 이상이면 str에 "합격"을 저장
		//     아니면  "불합격"을 저장
		//  합격 / 불합격 여부 출력
		str = (avg >= 60 
				&& kor >= 40 
				&& eng >= 40 
				&& math >= 40 ) ? "합격" : "불합격";
		System.out.println("결과: " + str);
		
		System.out.println("=========================");
		
		// 복합대입연산자
		// +=  -=  *=  /=  %=
		int a = 10;
		
		a = a + 1; // a 변수값 1증가
		a += 1;  // a 변수값 1증가
		a++;  // a 변수값 1증가
		
		
		a = 0;
		a = a + 2;
		System.out.println("a = " + a); // 2
		
		a += 2;
		System.out.println("a = " + a); // 4
		
		a = 10;
		a = a / 3;
		a /= 3;
		
	} // main

}



