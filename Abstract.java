abstract class Atm01 {
	abstract void withdraw();	
}
abstract class Atm02 extends Atm01{
	abstract void deposit();	
}

public class Abstract extends Atm {
	void withdraw() {
		System.out.println("withdraw");
	}
	void deposit() {
		System.out.println("Deposit");
	}
	public static void main(String[] args) {
		Abstract ff = new Abstract();
		ff.withdraw();
		ff.deposit();
	}
}