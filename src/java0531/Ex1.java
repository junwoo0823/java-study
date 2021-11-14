package java0531;

// 나무 클래스 정의
// 클래스는 객체를 정의하는 역할을 함
class Tree {
	// 멤버변수 (속성, 상태)
	String name;
	int age;
	
	// 메소드 (기능)
	void showTree() {
		System.out.print(age + "살 " + name + "나무가 바람에 ");
		if (age < 10) {
			System.out.println("세게 흔들린다.");
		} else {
			System.out.println("약하게 흔들린다.");
		}
	}
}


public class Ex1 { // 객체 정의

	public static void main(String[] args) {
		// 객체(Object)지향언어
		
		// 변수 (한개의 기억장소)
		// -> 배열 (같은자료형의 기억장소 여러개)
		// -> 구조체 (다른자료형의 기억장소 여러개)
		// -> 클래스 (구조체 + 함수)
		
		int a;
		a = 10;
		
		int[] arr;  // 배열(참조)변수 선언
		arr = new int[5];
		
		// 참조변수 선언
		Tree tree;
		tree = new Tree();
		// new : 객체 생성 연산자
		// tree : 참조변수
		// (.) : 객체 참조 연산자
		
		tree.name = "버드";
		tree.age = 5;
		tree.showTree();
		
		Tree tree2 = new Tree();
		tree2.name = "소"; 
		tree2.age = 50;
		tree2.showTree();
	} // main

}



