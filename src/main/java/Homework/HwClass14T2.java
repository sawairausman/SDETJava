package Homework;

public class HwClass14T2 {
//    Create a method that will take a String as a parameter and returns reversed String.
//    Method should be available to all classes within your project and accessible by class name.



    public  String reverse(String Reverse) {
       String revString = "";

        for (int i = Reverse.length() - 1; i >= 0; i--) {
            revString = revString + Reverse.charAt(i);
        }
        return revString;

    }

    public static void main(String[] args) {

        System.out.println(new HwClass14T2().reverse("My name is sawaira"));
    }

}
