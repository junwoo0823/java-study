package java0621;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @ 애노테이션(annotation) : 기능을 가지는 주석. 자바 프로그램이 사용하는 정보

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	private String name;
	private int age;
	
	public void showPerson() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}





