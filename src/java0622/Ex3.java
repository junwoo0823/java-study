package java0622;

import java0622.accesstest.SubAccessTest;

public class Ex3 {

	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		at.showData();
		//System.out.println(at.a); // private 멤버 접근안됨
		
		SubAccessTest sat = new SubAccessTest();
		sat.subShowData();
	}

}
