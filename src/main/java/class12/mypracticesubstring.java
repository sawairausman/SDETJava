package class12;

import java.util.Scanner;

public class mypracticesubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mom's first Name :");
        String firstMomName = sc.nextLine();
        System.out.println("Enter Dad's first Name :");
        String firstDadName =sc.nextLine();
        System.out.println("Boy or Girl ?");

        String gender = sc.next();
        gender.toLowerCase();

        if(gender.equals("boy")){
            String boyName = firstDadName.substring(0, firstDadName.length()/2)+firstMomName.substring(firstMomName.length()/2);
            System.out.println("Name of Boy is :" +boyName);

        }else if(gender.equals("girl")){
            String girlName = firstMomName.substring(0, firstMomName.length()/2)+firstDadName.substring(firstDadName.length()/2);
            System.out.println("Name of Girl is :" +girlName);

        }else{
            System.out.println("Invalid gender");
        }

    }
}
