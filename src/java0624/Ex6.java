package java0624;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex6 {

	public static void main(String[] args) {
		// 배열과 컬렉션의 차이점
		// 배열: 고정크기 이상의 객체를 관리할 수 없음
		//       배열 중간에 객체가 삭제되면 프로그램에서 자리를 옮겨줘야 함
		
		// 컬렉션 : 가변크기로서 객체의 개수를 염려할 필요 없음
		//       컬렉션 내의 한 객체가 삭제되면 컬렉션이 자동으로 자리를 옮겨줌.
		
		// 인터페이스
		// Set(집합) : 순서없는 저장공간. 저장순서 없어서 중복저장 불가.
		//             HashSet
		// List(목록) : 순서있는 저장공간. 저장순서(인덱스번호) 있어서 중복저장 가능.
		//        ArrayList, Vector
		// Map : (키, 값) 쌍으로 저장공간. 키를 이용해서 값을 얻는 자료구조.
		//        HashMap, Hashtable
		
		// 컬렉션은 객체만 구성요소로 저장 가능
		//  기본자료형은 대응되는 Wrapper객체로 박싱되어 저장됨.
		
		Set set = new HashSet(); // 업캐스팅
		set.add("문자열");
		set.add(10);   // set.add(Integer.valueOf(10))  // 오토박싱 적용됨
		set.add(3.14);
		set.add(3.14);
		set.add('A');
		set.add(true);
		set.add(new Puppy("포메", 3));
		System.out.println(set.toString());
		
		// Iterator 반복자로 요소 꺼내기
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("========================");
		
		set.remove('A');
		set.remove(3.14);
		System.out.println(set.toString());
		
		for (Object obj : set) {
			System.out.println(obj);  // obj.toString()
		}
		
		set.clear(); // 요소 모두 삭제(비우기)
		
	} // main

}



