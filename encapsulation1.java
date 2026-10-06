class Parent6
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
class encapsulation1 extends Parent6
{
	public static void main(String args[]) {
		encapsulation1 bb=new encapsulation1();
		bb.setName("smr");
		String ss=bb.getName();
		System.out.println(ss);
	}
}