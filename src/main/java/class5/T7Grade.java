package class5;

import java.util.Scanner;

public class T7Grade {

//    Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average,
//    D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was entered by a
//    user with explanation.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade : A, B, C, D, F ");
        char grade = sc.next().charAt(0);
        String c =" ";
        switch(grade){
            case 'A':
                c= "A-Excellent";
                break;
            case 'B':
                c ="B-Good";
                break;
            case 'C':
                c="C-Average";
                break;
            case 'D':
                c ="D-Bad";
                break;
            case 'F':
                c= "F-Fail";
                break;
            default:
                c="Not Aceeptable";
        }
        System.out.println("Your grade "+ c);
    }
}
