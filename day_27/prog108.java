import java.util.Scanner;

 class Student{
    int rollno;
    String name;
    int[] marks = new int[5];
    int total;
    double percentage;
    char grade;

    void inputdata(Scanner sc){
        System.out.println("enter the roll no");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the name");
        name = sc.nextLine();

        System.out.println("enter the marks of 5 subjects:");
        for(int i=0 ; i<5 ; i++)
        {
          System.out.println("subjects"+ (i + 1)+ ":");
          marks[i] = sc.nextInt();
        }
    }
    void ct(){
        total = 0; 
        for(int i = 0; i < 5 ; i++)
        {
          total+=marks[i];
        }
    }
    void cp()
    {
        percentage = total/5.0;
    }
    void cg()
    {
        if(percentage>=90)
        {
            grade = 'A';
        }
        else if(percentage<90 && percentage>=80)
        {
            grade = 'B';
        }
        else if(percentage<80 && percentage>=70)
        {
            grade = 'C';
        }
        else if(percentage<70 && percentage>=60)
        {
            grade = 'D';
        }
        else if(percentage<60)
        {
            grade = 'E';
        }
    }
    void displaymarksheet()
    {
          System.out.println("\n========= MARKSHEET =========");
          System.out.println("Roll No: " + rollno);
          System.out.println("Name: " + name);
          System.out.println("--- Subject Marks ---");
             for(int i = 0 ; i< 5; i++)
             {
                System.out.println("subject"+(i+1)+"marks[i]");
             }
        System.out.println("-------------------------");
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("==========================");


    }
}
    public class prog108 {

    // Function to process all student data
    static void processStudent(Student s) {
        s.ct();
        s.cp();
        s.cg();
    }

    // Function to display all marksheets
    static void displayAll(Student[] arr, int n) {
        System.out.println("\n--- ALL MARKSHEETS ---");
        for(int i = 0; i < n; i++) {
            arr[i].displaymarksheet();
        }
    }

    // Function to find topper
    static void findTopper(Student[] arr, int n) {
        int index = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i].percentage > arr[index].percentage) {
                index = i;
            }
        }
        System.out.println("\n>>> CLASS TOPPER <<<");
        arr[index].displaymarksheet();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            students[i] = new Student();
            students[i].inputdata(sc);
            processStudent(students[i]);
        }

        displayAll(students, n);
        findTopper(students, n);

        sc.close();
    }
}
 