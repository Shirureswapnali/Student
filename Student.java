import java.util.*;

public class Student {
    int roll;
    String name;

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No:");
        roll = sc.nextInt();
        System.out.println("Enter the Name:");
        sc.nextLine(); 
        name = sc.nextLine();
    }

    void display() {
        System.out.println("Student Roll No: " + roll);
        System.out.println("Student Name: " + name);
    }

    void search() {
        int roll1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No to search:");
        roll1 = sc.nextInt();
        if (roll1 == roll) {
            System.out.println("Student is Found: " + name);
        } else {
            System.out.println("Student is Not Found");
        }
    }

    void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No to delete:");
        int rollInput = sc.nextInt();
        if (rollInput == roll) {
            roll = 0;
            name = null;
            System.out.println("Student Information deleted successfully");
        } else {
            System.out.println("Roll number doesn't match, cannot delete.");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int ch;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter the choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    s.add();
                    break;
                case 2:
                    s.display();
                    break;
                case 3:
                    s.search();
                    break;
                case 4:
                    s.delete();
                    break;
                case 5:
                    System.out.println("Thanks For Executing Program");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch != 5);
    }
}
