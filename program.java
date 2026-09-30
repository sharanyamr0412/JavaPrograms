
public class program {
	void add()
	{
		System.out.println("Method 1");
	}
	void add(int a)
	{
		System.out.println("Method 2");
	}
	public static void main(String args[]) {
	program address=new program();
	address.add();
	address.add(2);
}
}
