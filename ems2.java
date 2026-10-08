import java.util.Scanner;

public class ems2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[100];
        String[] designation = new String[100];
        int[] age = new int[100];
        int[] salary = new int[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    do {
                        System.out.print("\nEnter the name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter the age: ");
                        age[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter the Designation: ");
                        designation[count] = sc.nextLine();

                        // Assign salary according to designation
                        if (designation[count].equalsIgnoreCase("programmer")) {
                            salary[count] = 20000;
                        }
                        else if (designation[count].equalsIgnoreCase("manager")) {
                            salary[count] = 30000;
                        }
                        else if (designation[count].equalsIgnoreCase("tester")) {
                            salary[count] = 25000;
                        }
                        else {
                            salary[count] = 0;
                            System.out.println("Invalid designation!");
                        }

                        count++;

                        System.out.print("\nDo you want to continue? (y/n): ");
                        String ans = sc.nextLine();

                        if (ans.equalsIgnoreCase("n")) {
                            break;
                        }

                    } while (count < 100);

                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("\nNo employees found!");
                    }
                    else {
                        System.out.println("\n===== ALL EMPLOYEE DETAILS =====");

                        for (int i = 0; i < count; i++) {
                            System.out.println("\nEmployee " + (i + 1));
                            System.out.println("Your name is: " + name[i]);
                            System.out.println("Your age is: " + age[i]);
                            System.out.println("Your salary is: " + salary[i]);
                            System.out.println("Your designation is: " + designation[i]);
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("\nNo employees found!");
                    }
                    else {
                        System.out.print("\nEnter employee number: ");
                        int empNo = sc.nextInt();

                        if (empNo >= 1 && empNo <= count) {
                            System.out.print("Enter salary raise amount: ");
                            int raise = sc.nextInt();

                            salary[empNo - 1] =
                                    salary[empNo - 1] + raise;

                            System.out.println("Salary raised successfully!");
                            System.out.println("New salary: "
                                    + salary[empNo - 1]);
                        }
                        else {
                            System.out.println("Invalid employee number!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nThank you! Exiting...");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}