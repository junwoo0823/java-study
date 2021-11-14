package java0623;

public class Ex7 {

	public static void main(String[] args) {
		// 다형성은 상속은 전제로 함
		// 자바는 다중상속을 허용하지 않으며, 단일상속만 허용함.
		Animal animal = new Puppy(); // 업캐스팅
		animal.eat();
		animal.speak();
		
		Puppy puppy = (Puppy) animal; // 다운캐스팅

		System.out.println(IRobot.RED);
		System.out.println(IRobot.BLUE);
		
		IRobot iRobot = puppy; // 업캐스팅
		iRobot.sayHello();
		iRobot.sayGoodbye();
		
	} // main

}
