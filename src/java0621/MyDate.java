package java0621;

//접근지정자
//private : 클래스 외부에서의 접근 제한함. 클래스 내부에서만 접근 가능함
//default(생략) : 같은 패키지 안에있는 클래스, 인터페이스끼리는 접근 가능한 구성요소로 지정함
//protected : 
//public : 같은 패키지뿐만 아니라 다른 패키지에 있는 클래스, 인터페이스도 접근 가능한 구성요소로 지정함


//this. : 객체 자기자신을 가리키는 내부 참조변수
//this() : 생성자 오버로딩 시, 다른 생성자를 호출하는 용도로 사용. 첫번째 호출문이 되야함
//       초기화 코드 중복을 최소화


// 접근지정자가 올수 있는 위치: 클래스단위, 생성자/메소드 단위, 멤버변수 단위
// 클래스단위에서 사용가능한 접근지정자는 public, default(생략)
// 클래스단위를 제외하면 접근지정자 4가지 모두 사용가능: public, protected, default(생략), private

public class MyDate {
	// 멤버변수 : 정수형 year, month, date
	private int year;
	private int month;
	private int date;
	
	// 기본생성자.  year 2021  month 1   date 1  로 초기화
	public MyDate() {
		this(2021, 1, 1);
		
//		this.year = 2021;
//		this.month = 1;
//		this.date = 1;
	}
	// 년 값을 받아서 초기화하는 생성자. 월과 일은 1로 초기화
	MyDate(int year) {
		this(year, 1, 1);
	}
	// 년과 월을 받아서 초기화하는 생성자. 일은 1로 초기화
	MyDate(int year, int month) {
		this(year, month, 1);
	}
	// 년, 월, 일 모두 받아서 초기화하는 생성자
	MyDate(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	// year값을 받아서 설정하는 setYear 메소드. 리턴형은 void (setter 메소드 = 쓰기)
	void setYear(int year) {
		this.year = year;
	}
	// month값을 받아서 설정하는 setMonth 메소드. 리턴형은 void
	void setMonth(int month) {
		if (1 <= month && month <= 12) {
			this.month = month;
		}
	}
	// date값을 받아서 설정하는 setDate 메소드. 리턴형은 void
	void setDate(int date) {
		this.date = date;
	}
	// year 값을 리턴해주는 getYear 메소드
	public int getYear() {
		return year;
	}
	// month 값을 리턴해주는 getMonth 메소드
	int getMonth() {
		return month;
	}
	// date 값을 리턴해주는 getDate 메소드
	int getDate() {
		return date;
	}
	// showMyDate() 메소드.  출력 "년-월-일"
	void showMyDate() {
		System.out.println(year + "-" + month + "-" + date);
	}
}
