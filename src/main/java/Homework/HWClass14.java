package Homework;

public class HWClass14 {

//    Create a method that will accept an array as parameters
//    and will return a sum of all elements from that array.
//    Method should be visibly only within same package and
//    accessible by the creating an instance/object of the class.

    public  int arrSum(int[] Array){
        int sum=0;

        for (int i = 0; i < Array.length; i++) {
            sum+= Array[i];
        }
        return sum;


    }

    public static void main(String[] args) {
        HWClass14 a = new HWClass14();

        int [] arr = {1,2,3,4};
        System.out.println(a.arrSum(arr));    }


}
