import java.util.*;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> students = new Vector<>();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Add
                    String nameAdd = sc.next();
                    students.add(nameAdd);
                    System.out.println("Added");
                    break;

                case 2: // Insert at index (1-based)
                    String nameInsert = sc.next();
                    int index = sc.nextInt();
                    
                    // Convert to 0-based index
                    students.add(index - 1, nameInsert);
                    System.out.println("Inserted");
                    break;

                case 3: // Remove
                    String nameRemove = sc.next();
                    students.remove(nameRemove);
                    System.out.println("Removed");
                    break;

                case 4: // Display
                    System.out.println(students);
                    break;

                case 5: // Exit
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
