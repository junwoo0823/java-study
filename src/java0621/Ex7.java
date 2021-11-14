package java0621;

public class Ex7 {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(22);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		p.showPerson();
		
		System.out.println("============================");
		
		Person[] pArr = new Person[3];
		pArr[0] = new Person("마리오", 35);
		pArr[1] = new Person("루이지", 33);
		pArr[2] = new Person("피치공주", 38);
		
		for (int i=0; i<pArr.length; i++) {
			pArr[i].showPerson();
		}
		
		System.out.println("============================");
		
		Person[] pArr2 = {
				new Person("홍길동", 33),
				new Person("이순신", 35),
				new Person("성춘향", 32),
				new Person("이몽룡", 31)
		};
		
		for (Person person : pArr2) {
			person.showPerson();
		}
		
		System.out.println("============================");
		
		String[] strArr = new String[3];
		
		strArr[0] = new String("마리오");
		strArr[1] = "루이지";
		strArr[2] = "피치공주";
		
		for (int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}
		System.out.println();
		
		System.out.println("============================");
		
		String[] strArr2 = { "홍길동", "이순신", "성춘향", "이몽룡" };
		
		for (String s : strArr2) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		System.out.println("============================");
		
		
		

	} // main

}
