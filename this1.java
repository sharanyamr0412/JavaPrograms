public class this1 {
	int a ;
	int b ;

   void	add(int c , int d)
	{
	      a=c;
	      b=d;
	}
   void	add1()
   {
	   System.out.println(a+b);
   }
	 public static void main(String[] args) {
			this1 ff = new this1();
		   ff.add(2, 3);
		   ff.add1();
		}
	}