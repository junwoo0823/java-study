package java0622.accesstest;

import java0622.AccessTest;

public class SubAccessTest extends AccessTest {

	public void subShowData() {
		System.out.println("SubAccessTest subShowData()");
		//System.out.println("a = " + a);
		//System.out.println("b = " + b);
		System.out.println("c = " + c); // 다른 패키지에 위치한 자식클래스는 부모의 protected 멤버를 접근 가능함
		System.out.println("d = " + d);
	}
}
