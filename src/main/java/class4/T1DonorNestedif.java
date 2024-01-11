package class4;

public class T1DonorNestedif {
    public static void main(String[] args) {

//        Create a Java program and call it a Donor.
//                In order to be eligible to donate your blood you have to be 18
//        years old. Also once you identify age eligibility then we have to see if
//        person matches weight requirements. If person weight it more than 110 lbs →
//        then he/she is eligible, otherwise we cannot accept such a patient.

        int age = 18;
        double weight = 110.5;

        if (age >= 18) {

            if (weight > 110) {
                System.out.println("You are eligible for blood donation");
            }else {
                System.out.println("You're not eligible for a blood donation");
            }

        } else {
            System.out.println("We cannot accept such patient");
        }

    }
}