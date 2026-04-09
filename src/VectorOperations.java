import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> students = new Vector<>();
        int choice;

        do {
            // Menu
            System.out.println("\n1. Add a student name");
            System.out.println("2. Insert a name at specific index");
            System.out.println("3. Remove a name");
            System.out.println("4. Display the list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Add
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    students.add(name);
                    System.out.println("Added");
                    break;

                case 2:
                    // Insert (1-based index)
                    System.out.print("Enter index (1-based): ");
                    int index = sc.nextInt();
                    sc.nextLine(); // consume newline

                    if (index < 1 || index > students.size() + 1) {
                        System.out.println("Invalid index");
                    } else {
                        System.out.print("Enter student name: ");
                        String insertName = sc.nextLine();
                        students.add(index - 1, insertName); // convert to 0-based
                        System.out.println("Inserted");
                    }
                    break;

                case 3:
                    // Remove
                    System.out.print("Enter student name to remove: ");
                    String removeName = sc.nextLine();

                    if (students.remove(removeName)) {
                        System.out.println("Removed");
                    } else {
                        System.out.println("Name not found");
                    }
                    break;

                case 4:
                    // Display
                    System.out.println(students);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}



