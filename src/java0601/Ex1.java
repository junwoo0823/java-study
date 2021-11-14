package java0601;

class Tv {
	// 멤버변수
	// : 객체가 생성되면 기본값으로 초기화됨 
	String color;
	boolean power;
	int channel;
	
	// 메소드
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		// Tv 객체 생성
		Tv tv;
		tv = new Tv();
		tv.channel = 7;
		tv.channelDown();
		System.out.println("현재 채널은 " + tv.channel + " 입니다.");
		
		// 객체배열
		String[] strArr = new String[3];
		strArr[0] = "안녕";
		strArr[1] = "Hello";
		strArr[2] = new String("반가워");
		
		Tv[] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		String[] strArr2 = { "안녕", "Hello", new String("반가워") };
		
		Tv[] tvArr2 = { new Tv(), new Tv(), new Tv() };
		
		
	} // main

}





