import java.util.Scanner;

public class ems {
    public static void main(String[] args) {
    	System.out.println("Employee Management System");
    	System.out.println("");
        Scanner sc = new Scanner(System.in);

        String name,choice;
        int age;

        do {
            System.out.print("Enter employee name: ");
            name = sc.nextLine();

            System.out.print("Enter employee age: ");
            age = sc.nextInt();
            sc.nextLine(); // clear input buffer

            System.out.println("Employee created successfully!");

            System.out.print("Continue (yes/no): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Exited from employee creation.");

        sc.close();
    }
}