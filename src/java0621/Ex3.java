package java0621;

import javax.swing.JFrame;

// 상속 활용 예

public class Ex3 extends JFrame {
	
	public Ex3() {
		setTitle("창 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 누를때 프로그램 종료
		
		setSize(500, 400); // 가로세로 크기 지정
		setVisible(true); // 화면에 보이기 설정
	}

	public static void main(String[] args) {
		new Ex3();
	}

}




