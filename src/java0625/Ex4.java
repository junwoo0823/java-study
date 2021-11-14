package java0625;

class Go {
	
	void methodGo() {
		while (true) {
			System.out.println("go");
		}
	}
}

class Come {
	
	void methodCome() {
		while (true) {
			System.out.println("come");
		}
	}
}


public class Ex4 {

	public static void main(String[] args) {
		Go go = new Go();
		Come come = new Come();
		
		go.methodGo();
		come.methodCome();

	} // main
}










