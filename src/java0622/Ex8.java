package java0622;


class Animal { // 동물 클래스
	
	void eat() {
		System.out.println("먹는다.");
	}
	
	void speak() {
		System.out.println("소리내기");
	}
}

class Puppy extends Animal { // 강아지 클래스

	@Override
	void speak() {
		System.out.println("멍멍~~!!");
	}
	
	void helpOwner() {
		System.out.println("주인 도와주기");
	}
}

class Cat extends Animal { // 고양이 클래스

	@Override
	void speak() {
		System.out.println("야옹~~~");
	}
}

class Vet { // 수의사 클래스
	
	void giveShot(Animal animal) {
		animal.speak();
	}
	
//	void giveShot(Puppy puppy) { // 주사놓기 메소드. 주사맞은 동물은 울기
//		puppy.speak();
//	}
//	
//	void giveShot(Cat cat) {
//		cat.speak();
//	}
}


public class Ex8 {

	public static void main(String[] args) {
		
		// 자료형 형변환 (기본자료형 - 숫자형끼리만 가능)
		//   형변환은 서로 호환되는 자료형끼리만 가능하다.
		
		double d = 3; // double형(큰) = int형(작은)  자동형변환
		System.out.println(d); // 3.0
		
		int a = (int) 3.14; // int형(작은) = double형(큰)  수동형변환
		System.out.println(a); // 3
		
		System.out.println("========================");
		
		Puppy puppy = new Puppy();
		puppy.eat();
		puppy.speak();
		puppy.helpOwner();
		
		System.out.println("========================");
		
		// 자료형 형변환. 참조자료형 - 같은 계열 타입(상속관계)끼리만 가능
		//   형변환은 서로 호환되는 자료형(상속관계)끼리만 가능하다.
		
		Animal ani = new Puppy(); // 부모타입(큰) = 자식타입(작은) : 업캐스팅
		ani.speak(); // 멍멍~~!!
		ani.eat();
		//ani.helpOwner();
		
		Puppy p = (Puppy) ani; // 자식타입(작은) = 부모타입(큰) : 다운캐스팅
		p.helpOwner();
		
		System.out.println("========================");
		
		ani = new Cat();
		ani.speak(); // 야옹~~~
		
		System.out.println("========================");
		
		Vet vet = new Vet();
		vet.giveShot(new Cat());
		vet.giveShot(new Puppy());
		
		System.out.println("========================");
		
		Animal[] aniArr = { new Puppy(), new Cat() };
		
		for (Animal animal : aniArr) {
			animal.speak();
		}
		
		
		// 정적 바인딩: 컴파일 시간에 컴파일러가 메소드 호출 결정(참조변수 타입 기준)
		
		// 동적 바인딩: 실행 시간에 JVM이 메소드 호출 결정(실제 접근하는 객체가 기준)
		//   -> 자식타입 객체를 부모타입 참조변수로 사용할때 발생 
		
		// 자식 타입 객체를 부모 타입 참조변수로 사용하는 상황에서는
		//   정적 바인딩, 동적 바인딩 모두 발생함
		
	} // main

}





