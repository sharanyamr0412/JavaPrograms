abstract class Atm1 {
	abstract void withdraw();
	abstract void deposit();
}
public class Abstract_program extends Atm1 {
	void withdraw() {
		System.out.println("withdraw");
	}
	void deposit() {
		System.out.println("Deposit");
	}
	public static void main(String[] args) {
		Abstract_program ff = new Abstract_program();
		ff.withdraw();
		ff.deposit();
	}
}