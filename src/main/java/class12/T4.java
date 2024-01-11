package class12;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Write a program that reads two people's first
//        names and if they expecting boy or girl?
//                Based on the input suggests a name for a baby:
//        Example Output:
//        Mom’s first name? Mary
//        Dad’s first name? Daniel
//        Boy or Girl? boy
//        Suggested baby name: DANRY
//
//        Example Output:
//        Mom’s first name? Mary
//        Dad’s first name? Daniel
//        Boy or Girl? girl
//        Suggested baby name: MAIEL
//        System.out.println("Enter mom's name ");
//        String mom= sc.next();
//        System.out.println("Enter dad's name");
//        String dad= sc.next();
//        System.out.println("Enter the gender of baby: boy or girl?");
//        String gender = sc.next();
//
//        if(gender.equals("boy")){
//            String boyname = dad.substring(0,dad.length()/2)+ mom.substring(mom.length()/2);
//            System.out.println(boyname);
//
//        }else if (gender.equals("girl")){
//            String girlname =mom.substring(0, mom.length()/2)+ dad.substring(dad.length()/2);
//            System.out.println(girlname);
//        }
//        else{
//            System.out.println("invalid name");
//        }
        String fatherName="Carlos";
        String motherName="Ana";
        boolean isBoy=false;

        if(isBoy){
            String fatherFirstPart=fatherName.substring(0,fatherName.length()/2);
            String motherLastPart=motherName.substring(motherName.length()/2,motherName.length());
            System.out.println(fatherFirstPart.trim()+motherLastPart.trim());
        }else {
            String motherFirstPart=motherName.substring(0,motherName.length()/2);
            String fatherLastPart=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());

        }


    }}

