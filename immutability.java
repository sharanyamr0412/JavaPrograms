
public class immutability {
public static void main(String args[]) {
	String s1=new String("Hello");
	String s2=s1.concat("Siri");
	System.out.println(s1);
	System.out.println(s2);
	String s3="hello world";
	System.out.println(s3.length());
	System.out.println(s3.intern());
	System.out.println(s3.lastIndexOf(s3));
	System.out.println(s3.charAt(7));
	System.out.println(s3.compareTo(s2));
	System.out.println(s3.endsWith(s1));
	System.out.println(s3.contains(s1));
	System.out.println(s3.indexOf(8));

  }
}
