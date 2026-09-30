

// class and object
// variable method constructor and block
class Parents {
	void peoprty() {
		System.out.println("Property");
	}
	void marry() {
		System.out.println("famaily selection");
	}
}
public class overriding extends Parents {
	void marry() {
		System.out.println(" campus selection");
	}
	public static void main(String[] args) {
		overriding bb = new overriding();
    bb.marry();
    bb.peoprty();
    
	}
}
