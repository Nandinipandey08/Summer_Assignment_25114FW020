import java.util.Scanner;

class SalaryRecord {
    int empId;
    String name;
    double basicSalary;
    double hra;
    double da;
    double totalSalary;

    // Function to input salary details
    void inputData(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    // Function to calculate total salary: Basic + HRA + DA
    void calculateSalary() {
        hra = 0.20 * basicSalary; // 20% HRA
        da = 0.10 * basicSalary; // 10% DA
        totalSalary = basicSalary + hra + da;
    }

    // Function to display salary slip
    void displaySlip() {
        System.out.println("ID: " + empId + " | Name: " + name);
        System.out.println("Basic: " + basicSalary + " | HRA: " + hra + " | DA: " + da);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("-----------------------------");
    }
}

public class prog107{
    // Function to add salary records
    static void addRecords(SalaryRecord[] arr, int n, Scanner sc) {
        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            arr[i] = new SalaryRecord();
            arr[i].inputData(sc);
            arr[i].calculateSalary();
        }
    }

    // Function to display all salary slips
    static void displayAllSlips(SalaryRecord[] arr, int n) {
        System.out.println("\n--- Salary Slips ---");
        for(int i = 0; i < n; i++) {
            arr[i].displaySlip();
        }
    }

    // Function to find highest salary
    static void findHighestSalary(SalaryRecord[] arr, int n) {
        if(n == 0) return;
        int index = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i].totalSalary > arr[index].totalSalary) {
                index = i;
            }
        }
        System.out.println("Employee with Highest Salary:");
        arr[index].displaySlip();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        SalaryRecord[] records = new SalaryRecord[n];
        addRecords(records, n, sc);
        displayAllSlips(records, n);
        findHighestSalary(records, n);

        sc.close();
    }
}