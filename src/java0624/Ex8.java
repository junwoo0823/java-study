package java0624;

import java.util.ArrayList;
import java.util.List;

// DAO(Data Access Object) : 데이터를 접근할수 있는 클래스. 파일, DB, 네트워크상의 다른 서버 데이터 등 
class PuppyDAO {
	
	List<Puppy> getPuppyList() {
		// 리스트 컬렉션 객체 준비
		
		// 제네릭(Generics) : 타입 매개변수. 타입 한개로 일반화시키기
		List<Puppy> puppyList = new ArrayList<>();
		
		puppyList.add(new Puppy("푸들", 2));
		puppyList.add(new Puppy("포메라니안", 4));
		puppyList.add(new Puppy("진돗개", 1));
		
		return puppyList;
	}
	
}


public class Ex8 {
	
	public static void main(String[] args) {
		
		PuppyDAO dao = new PuppyDAO();
		List<Puppy> list = dao.getPuppyList();

		for (int i=0; i<list.size(); i++) {
			Puppy puppy = list.get(i);
			if (puppy.getName().equals("포메라니안")) {
				System.out.println(puppy);
			}
		}
		
	} // main

}




