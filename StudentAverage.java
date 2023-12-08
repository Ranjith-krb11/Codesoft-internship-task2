//StudentGradeCalculator


import java.util.Scanner;

public class StudentAverage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int maxScore = 100; 
        int passingScore = 60;

        
        System.out.println("Enter the student's score for the exam: ");
        int examScore = scanner.nextInt();

        System.out.println("Enter the student's score for the assignment: ");
        int assignmentScore = scanner.nextInt();

        System.out.println("Enter the student's score for the project: ");
        int projectScore = scanner.nextInt();

        int totalScore = examScore + assignmentScore + projectScore;

        double percentage = (double) totalScore / (3 * maxScore) * 100;

        char grade;
        if (percentage >= passingScore) {
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            } else {
                grade = 'D';
            }
        } else {
            grade = 'F';
        }

        System.out.println("Total Score: " + totalScore);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
