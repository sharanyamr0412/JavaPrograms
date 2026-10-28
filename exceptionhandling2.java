
public class exceptionhandling2 {

	    public static void main(String... args) {

	        System.out.println("start");
	        try {
	            int a = 10/0;
	        } catch (Exception e) {
	            System.out.println("exception handle");
	        }

	        System.out.println("end");
	    }
	}
