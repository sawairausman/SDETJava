package class5;

import java.util.Scanner;

public class T5LogicalOperator {
    public static void main(String[] args) {

        /*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.

 */
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your birth month :");
        String month = sc.nextLine();
        String season = " ";

        if(month.equalsIgnoreCase("march") ||
                month.equalsIgnoreCase("april")||
                month.equalsIgnoreCase("May")){
            season = "Spring";
        }else if(month.equalsIgnoreCase("June") ||
                 month.equalsIgnoreCase("July") ||
                 month.equalsIgnoreCase("August")) {
            season = "Summer";
        }else if(month.equalsIgnoreCase("September")||
                 month.equalsIgnoreCase("October") ||
                 month.equalsIgnoreCase("November")) {
            season = "Fall";
        }else if(month.equalsIgnoreCase("December") ||
                 month.equalsIgnoreCase("January") ||
                 month.equalsIgnoreCase("Feburary")) {
            season = "Winter";
        }else
        {
            season = "Invalid month";
        }

        System.out.println("You were born in season " +season);
    }
}
