package java0621;

public class MyCar {
	// 멤버변수
	private String color;   // 색상
	private String gearType;   // 기어타입  "auto"(자동)   "manual"(수동)
	private int doorCount;   // 문 개수
	
	public MyCar() {
		this("white", "auto", 4);
	}

	public MyCar(String color) {
		this(color, "auto", 4);
	}

	public MyCar(String color, String gearType) {
		this(color, gearType, 4);
	}

	public MyCar(String color, String gearType, int doorCount) {
		this.color = color;
		this.gearType = gearType;
		this.doorCount = doorCount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public int getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}
	
	public void showCar() {
		System.out.println("자동차 색상: " + color + ", 기어타입: " + gearType + ", 문 개수: " + doorCount);
	}
	
	
	// static 요소는 객체의 구성요소가 아님.
	// 클래스단위로 사용가능한 요소를 지정함.
	public static void main(String[] args) {
		
		MyCar car = new MyCar();
		car.showCar();
		
		car.setColor("blue");
		car.setDoorCount(2);
		car.setGearType("manual");
		car.showCar();
		
		MyCar car2 = new MyCar("red");
		car2.showCar();
		
		MyCar car3 = new MyCar("yellow", "manual");
		car3.showCar();
		
		MyCar car4 = new MyCar("green", "manual", 3);
		car4.showCar();
	}
	
	
	
}




