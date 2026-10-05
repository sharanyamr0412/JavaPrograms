
class Parent1{
		int a=10;
		int b=20;
	}
	public class superclass extends Parent1 {
		int a = 5;
		int b = 6;

		void add(int a, int b) {
			System.out.println(a + b);
		//	System.out.println(c + d);
			System.out.println(this.a + this.b);
			System.out.println(super.a+super.b);
			
		}

	public static void main(String[]args) {
			superclass ff = new superclass();
			ff.add(2, 3);
			

		}
	}

