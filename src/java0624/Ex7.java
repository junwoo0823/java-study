package java0624;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex7 {

	public static void main(String[] args) {
		// List 인터페이스를 구현한 클래스
		//  ArrayList : 가변크기 배열을 구현한 클래스. 스레드 동기화를 지원하지 않음. 
		//  Vector : ArrayList와 동일함. 스레드 동기화를 지원함.
		
		List list = new ArrayList();
		
		// add()는 마지막 위치로 추가
		list.add(10); // 인덱스 0
		list.add(3.14);
		list.add("문자열");
		list.add(true);
		list.add(new Puppy("푸들", 2));
		
		System.out.println(list);
		
		System.out.println(list.get(1)); // 3.14   인덱스 번째의 요소 가져오기
		System.out.println(list.size()); // 5      현재 요소의 개수
		
		list.remove(1);
		System.out.println(list.size()); // 4
		
		System.out.println(list);
		list.add(3, 2.7); // 인덱스번호 3 위치에 2.7 값을 중간에 삽입하기
		System.out.println(list);
		
		System.out.println("=====================");
		
		// Iterator 반복자
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("=====================");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=====================");
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=====================");
		
		list.clear(); // 모든 요소 삭제(비우기)
		System.out.println(list);
		
	} // main

}




