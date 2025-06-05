import java.util.Scanner;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printDetails() {
        System.out.println("Student Name: " + name + ", ID: " + id);
    }
}

public class Classes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student info from user
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        Student student = new Student(name, id);
        student.printDetails();

        scanner.close();
    }
}
