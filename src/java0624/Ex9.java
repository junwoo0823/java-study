package java0624;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex9 {

	public static void main(String[] args) {
		// Map 컬렉션: "키, 값" 쌍으로 데이터를 관리하는 자료구조. 데이터 검색이 월등함.
		
		Map<String, Puppy> puppyMap = new HashMap<>();
		
		// 키, 값 쌍으로 새로운 값 추가
		puppyMap.put("우리집 강아지", new Puppy("포메라니안", 2));
		puppyMap.put("철수네 강아지", new Puppy("진돗개", 1));
		puppyMap.put("영희네 강아지", new Puppy("푸들", 3));
		System.out.println(puppyMap);
		
		// 키로 값 가져오기
		Puppy puppy = puppyMap.get("영희네 강아지");
		System.out.println(puppy);
		
		// 같은 키로 다른 값을 저장하면 값 수정으로 동작함
		puppyMap.put("영희네 강아지", new Puppy("치와와", 4));
		puppy = puppyMap.get("영희네 강아지");
		System.out.println(puppy);
		
		System.out.println("===============================");
		
		// Map 객체의 요소를 하나씩 접근하기
		// 1) keySet 가져오기
		Set<String> keySet = puppyMap.keySet();
		
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			// 2) 키를 꺼내기
			String key = iter.next();
			// 3) 꺼낸 키를 사용해서 값을 가져오기
			Puppy p = puppyMap.get(key);
			System.out.println(p.toString());
		}
		
		System.out.println("===============================");
		
		puppyMap.remove("영희네 강아지");
		System.out.println(puppyMap);
		
		puppyMap.clear();
		System.out.println(puppyMap);
		
	} // main

}




