package java0621;


public class Ex1 {

	public static void main(String[] args) {
		MyDate md = new MyDate();
		
//		System.out.println(md.year);  // 2021
//		System.out.println(md.month); // 1
//		System.out.println(md.date);  // 1
		
		System.out.println(md.getYear());
		System.out.println(md.getMonth());
		System.out.println(md.getDate());
		
//		md.month = 100;
		md.setMonth(100);

		md.showMyDate();
		
		System.out.println("====================");
		
		MyDate md2 = new MyDate(2020);
		md2.showMyDate();
		
		MyDate md3 = new MyDate(2019, 6);
		md3.showMyDate();
		
		MyDate md4 = new MyDate(2018, 8, 8);
		md4.showMyDate();

	} // main

}






