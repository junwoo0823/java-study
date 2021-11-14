package java0601;

public class Ex4 {

	public static void main(String[] args) {
		// 각 생성자별로 객체 생성후 setter, getter, showAnimal 메소드 호출 연습
		
		Animal ani = new Animal();
		ani.showAnimal();
		
		ani.name = "하마";
		ani.setAge(10);
		ani.showAnimal();
		
		System.out.println(ani.getAge());
		System.out.println(ani.getName());
		
		Animal ani2 = new Animal("토끼");
		ani2.showAnimal();
		
		Animal ani3 = new Animal("기린", 4);
		ani3.showAnimal();
	} // main

}
