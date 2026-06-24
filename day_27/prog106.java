import java.util.Scanner;

class Employee {
    int empId;
    String name;
    String dept;

    // Function to input employee data
    void inputData(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        dept = sc.nextLine();
    }

    // Function to display employee data
    void displayData() {
        System.out.println("ID: " + empId + " | Name: " + name + " | Dept: " + dept);
    }
}

public class prog106 {
    
    static void addEmployee(Employee[] arr, int n, Scanner sc) {
        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            arr[i] = new Employee();
            arr[i].inputData(sc);
        }
    }

    
    static void displayAll(Employee[] arr, int n) {
        System.out.println("\n--- Employee Records ---");
        for(int i = 0; i < n; i++) {
            arr[i].displayData();
        }
    }

    
    static void searchEmployee(Employee[] arr, int n, int id) {
        for(int i = 0; i < n; i++) {
            if(arr[i].empId == id) {
                System.out.println("Employee Found:");
                arr[i].displayData();
                return;
            }
        }
        System.out.println("Employee not found");
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];
        addEmployee(employees, n, sc);
        displayAll(employees, n);

        System.out.print("\nEnter Employee ID to search: ");
        int searchId = sc.nextInt();
        searchEmployee(employees, n, searchId);

        sc.close();
    }
}