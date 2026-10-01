

class Atm {
	void withdraw() {
		System.out.println(" withdraw logic");
	}
	void deposit() {
		System.out.println(" deposit logic");
	}
}
public class atm_program extends Atm{

	public static void main(String[] args) {
atm_program  ff = new atm_program();
ff.withdraw();
ff.deposit();
	}
}