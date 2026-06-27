import java.util.Scanner;

public class prog117
{

    private static final int MAX_STUDENTS = 100;
    private static String[] rollNumbers = new String[MAX_STUDENTS];
    private static String[] names = new String[MAX_STUDENTS];
    private static String[] courses = new String[MAX_STUDENTS];
    
    
    private static int studentCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== STUDENT RECORD SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please pick between 1 and 6.");
            }
        } while (choice != 6);
    }

    // Function 1: Add a new student record
    public static void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Error: Database capacity reached!");
            return;
        }

        System.out.print("Enter Roll Number: ");
        String roll = scanner.nextLine().trim();

        // Check for duplicate roll numbers to maintain integrity
        if (findStudentIndex(roll) != -1) {
            System.out.println("Error: A student with this Roll Number already exists!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine().trim();

        // Save inputs into arrays at the current counter index
        rollNumbers[studentCount] = roll;
        names[studentCount] = name;
        courses[studentCount] = course;
        studentCount++;

        System.out.println("Student record added successfully!");
    }

    // Function 2: Display all records
    public static void viewStudents() {
        if (studentCount == 0) {
            System.out.println("No records found in the system.");
            return;
        }

        System.out.printf("\n%-15s %-25s %-20s\n", "Roll No", "Name", "Course");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%-15s %-25s %-20s\n", rollNumbers[i], names[i], courses[i]);
        }
    }

    // Function 3: Search a record by Roll Number
    public static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        String roll = scanner.nextLine().trim();
        int index = findStudentIndex(roll);

        if (index == -1) {
            System.out.println("Student not found.");
        } else {
            System.out.println("\n--- Record Found ---");
            System.out.println("Roll Number: " + rollNumbers[index]);
            System.out.println("Name:        " + names[index]);
            System.out.println("Course:      " + courses[index]);
        }
    }

    // Function 4: Modify an existing record
    public static void updateStudent() {
        System.out.print("Enter Roll Number to update: ");
        String roll = scanner.nextLine().trim();
        int index = findStudentIndex(roll);

        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter New Name (or press Enter to skip): ");
        String newName = scanner.nextLine().trim();
        if (!newName.isEmpty()) {
            names[index] = newName;
        }

        System.out.print("Enter New Course (or press Enter to skip): ");
        String newCourse = scanner.nextLine().trim();
        if (!newCourse.isEmpty()) {
            courses[index] = newCourse;
        }

        System.out.println("Student record updated successfully!");
    }

    // Function 5: Remove a record and fill the array gap
    public static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        String roll = scanner.nextLine().trim();
        int index = findStudentIndex(roll);

        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        // Shift elements down to fill the gap created by deletion
        for (int i = index; i < studentCount - 1; i++) {
            rollNumbers[i] = rollNumbers[i + 1];
            names[i] = names[i + 1];
            courses[i] = courses[i + 1];
        }

        // Clean up the last entry slot
        rollNumbers[studentCount - 1] = null;
        names[studentCount - 1] = null;
        courses[studentCount - 1] = null;
        studentCount--;

        System.out.println("Student record deleted successfully!");
    }

    // Helper Utility Function: Linear Search to fetch an array index
    private static int findStudentIndex(String rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (rollNumbers[i].equalsIgnoreCase(rollNumber)) {
                return i; // Found matching index
            }
        }
        return -1; // Not found
    }
}
