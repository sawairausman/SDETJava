package class4;

import java.util.Scanner;

public class T4ScanCreditCard {
    public static void main(String[] args) {
        //Create a Java program that will ask if user has a credit card or not.
// If you user does not have a credit card then offer them.
// If they do have one ask what is balance on the card? If balance of the card is
// larger than 1000,
// tell them to pay off immediately,
// otherwise you can tell them that they can spend more.

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a Credit card ? Yes or No");

        String input = sc.next();


        if (input.equals("Yes")){

            System.out.println("What is the balance on the card? ");
            double bal = sc.nextDouble();
            if(bal>1000){
                System.out.println("You have to pay off immediately!");
            }else {
                System.out.println("You can spend more! ");
            }
        } else if(input.equals("No")){

            System.out.println("You can have a new Credit card");

        }



    }
}
