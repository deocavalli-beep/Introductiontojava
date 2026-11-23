import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO STUDENT GRADING MANAGEMENT SYSTEM");

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        Student student = new Student(name);

        System.out.println("1. Enter total score");
        System.out.println("2. Enter test and exam scores");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {

            System.out.print("Enter total score: ");
            double score = input.nextDouble();

            student.calculateScore(score);

        } else if (choice == 2) {

            System.out.print("Enter test score: ");
            double test = input.nextDouble();

            System.out.print("Enter exam score: ");
            double exam = input.nextDouble();

            student.calculateScore(test, exam);

        } else {
            System.out.println("Invalid choice!");
            input.close();
            return;
        }

        System.out.println("\n----- STUDENT RESULT -----");

        student.displayResult();

        input.close();
    }
}