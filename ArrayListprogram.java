import java.util.ArrayList;
public class ArrayListprogram {
	public static void main(String args[]) {
		ArrayList<String>names=new ArrayList<>();
		names.add("Asha");
		names.add("Rahul");
		names.add("Meera");
		names.remove(1);
		names.remove("Meera");
		System.out.println(names);
	}
}
