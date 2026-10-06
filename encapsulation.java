class Parent5
{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
class encapsulation extends Parent5
{
	public static void main(String args[]) {
		encapsulation bb=new encapsulation();
		bb.setA(8);
		int ss=bb.getA();
		System.out.println(ss);
	}
}