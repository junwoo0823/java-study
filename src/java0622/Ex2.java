package java0622;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Employee {
	
	private String name;
	private int salary;
	
	// 기본생성자
	Employee() {
		super();
	}

	// name, salary 받아서 초기화하는 생성자
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	String getEmployee() {
		return name + ", " + salary;
	}
}

@Getter @Setter
class Manager extends Employee {
	
	private String depart;  // 부서이름

	Manager(String name, int salary, String depart) {
//		super(name, salary);
		setName(name);
		setSalary(salary);
		this.depart = depart;
	}
	
	String getManager() {
		//return getName() + ", " + getSalary() + ", " + depart;
		return getEmployee() + ", " + depart;
	}
}


public class Ex2 {

	public static void main(String[] args) {
		// 객체 생성 Employee emp
		Employee emp = new Employee("홍길동", 10000);
		System.out.println(emp.getEmployee());
		
		// 객체 생성 Manager man
		Manager man = new Manager("성춘향", 20000, "총무부");
		System.out.println(man.getEmployee());
		System.out.println(man.getManager());

	} // main

}






