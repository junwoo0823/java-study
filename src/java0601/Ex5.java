package java0601;


import java0621.MyDate;

public class Ex5 {

	public static void main(String[] args) {
		
		//java0621.MyDate md = new java0621.MyDate();
		
		// public 생성자 및 메소드만 다른 패키지에서 접근 가능함
		MyDate md = new MyDate();
		
		System.out.println(md.getYear());

	} // main

}
