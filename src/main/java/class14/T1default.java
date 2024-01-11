package class14;

public class T1default {

//    Create a method that will accept an array as parameters and will return a sum of all elements from that array. Method should be visibly only within same package and accessible by the creating an instance/object of the class.
//    Create a method that will take a String as a parameter and returns reversed String. Method should be available to all classes within your project and accessible by class name.
//


      int sum(int[] array){
        int sum =0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];

        }
        return sum;
    }

    public static void main(String[] args) {

        T1default arr= new T1default();
        int [] a = {1,2,3,5,6,4};
        System.out.println("Sum is :"+arr.sum(a));

        //using static keyword only pass array directly
       // System.out.println(T1default.sum(a));



    }

}
