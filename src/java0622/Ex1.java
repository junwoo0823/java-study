package java0622;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 클래스 Tv
//   멤버변수  정수형  channel
//   메소드   void channelUp()     channel 1증가
//   메소드   void channelDown()   channel 1감소

@Getter @Setter @NoArgsConstructor
class Tv {
	
	private int channel;
	
	public void channelUp() {
		// channel = channel + 1;
		// channel += 1;
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
}

// 클래스 CaptionTv(자막기능 TV)  상속  Tv
//   멤버변수   boolean isCaptionOn   캡션상태
//   메소드     void showCaption()    출력 "캡션상태: "  true/false
@Getter @Setter @NoArgsConstructor
class CaptionTv extends Tv {
	
	private boolean isCaptionOn;
	
	public void showCaption() {
		System.out.println("자막상태: " + isCaptionOn);
	}
}

public class Ex1 {

	public static void main(String[] args) {
		// CaptionTv 객체 생성
		CaptionTv tv = new CaptionTv();
		// 메소드 호출  channelUp()
		tv.channelUp();
		// 출력 channel
		System.out.println(tv.getChannel());
		// 메소드 호출  showCaption()
		tv.showCaption();
	}
}





