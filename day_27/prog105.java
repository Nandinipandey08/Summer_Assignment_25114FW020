import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;

    void inputData(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        name = sc.nextLine(); 

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
        sc.nextLine();
    }

    void displayData() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Marks: " + marks);
    }
}

public class prog105 {
    static void addStudent(Student[] arr, int n, Scanner sc) {
        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            arr[i] = new Student();
            arr[i].inputData(sc);
        }
    }

    static void displayAll(Student[] arr, int n) {
        System.out.println("\n--- Student Records ---");
        for(int i = 0; i < n; i++) {
            arr[i].displayData();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];
        addStudent(students, n, sc);
        displayAll(students, n);
        sc.close();
    }
}