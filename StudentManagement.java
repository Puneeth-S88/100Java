import java.util.*;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("--------------------------------");
    }
}

public class StudentManagement {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

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
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    // Add Student
    static void addStudent() {

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(roll, name, marks);

        students.add(s);

        System.out.println("Student Added Successfully!");
    }

    // View Students
    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    // Search Student
    static void searchStudent() {

        System.out.print("Enter Roll No to Search: ");
        int roll = sc.nextInt();

        for (Student s : students) {

            if (s.rollNo == roll) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Update Student
    static void updateStudent() {

        System.out.print("Enter Roll No to Update: ");
        int roll = sc.nextInt();

        sc.nextLine();

        for (Student s : students) {

            if (s.rollNo == roll) {

                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter New Marks: ");
                s.marks = sc.nextDouble();

                System.out.println("Student Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Delete Student
    static void deleteStudent() {

        System.out.print("Enter Roll No to Delete: ");
        int roll = sc.nextInt();

        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {

            Student s = it.next();

            if (s.rollNo == roll) {
                it.remove();
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }
}