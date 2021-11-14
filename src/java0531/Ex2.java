package java0531;

// 도서관리 프로그램을 가정함

// 클래스 정의 Book
// 책제목 문자열 title
// 책가격 정수형 price
// 책개수 정수형 count

// 책총합계구하기 메소드 sum
//    단위가격*개수  리턴
class Book {
	String title; // 책 제목
	int price; // 책 단위가격
	int count; // 책 개수
	
	int sum() {
		return price * count;
	}
}


public class Ex2 {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.title = "Java";
		book.price = 10000;
		book.count = 30;
		System.out.println("총가격합계 : " + book.sum()); 
		
		Book book2 = new Book();
		book2.title = "HTML";
		book2.price = 20000;
		book2.count = 20;
		System.out.println("총가격합계 : " + book2.sum());
		
		Book book3 = book2;
		System.out.println("총가격합계 : " + book3.sum());
		
		book3 = null; // 참조변수의 주소값을 null로 수정
		book2 = null;
		// 자바에서 객체는 자신을 참조하는 참조변수가 0개가 되면
		// 자동으로 가비지 컬력션 스레드에 의해서 객체가 메모리에서 제거됨
	} // main

}





