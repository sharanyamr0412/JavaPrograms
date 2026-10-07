
public class variables {
	int a=10;
	static int b=20;
	void var() 
	{
		int c=30;
		System.out.println(c);
	}
public static void main(String args[]) {
	variables a=new variables();
	
	System.out.println(a.a);
	System.out.println(b);
	a.var();
}
}
