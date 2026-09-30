
public class oop {
	void add(String s) {
		System.out.println("Method 1");
	}
	void add(int a,int b)
	{
		System.out.println("Method 2");
	}
	public static void main(String args[])
	{
		oop address=new oop();
		address.add("Hello");
		address.add(2,4);
	}

}
