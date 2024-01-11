package class5;

import java.util.Scanner;

public class T6LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;
        System.out.println("Enter your quizScore: ");
        double quiz = sc.nextDouble();
        System.out.println("Enter your midTermScore: ");
        double midTerm = sc.nextDouble();
        System.out.println("Enter your finalScore: ");
        double finalScore = sc.nextDouble();
        double AvgScore = (quiz + midTerm + finalScore) / 3;
        System.out.println("Your AvgScore is : " + AvgScore);

        if (AvgScore >= 90) {
            grade = 'A';
        } else if (AvgScore >= 70) {
            grade = 'B';
        } else if (AvgScore >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println(AvgScore+ " "+grade);
    }
}

