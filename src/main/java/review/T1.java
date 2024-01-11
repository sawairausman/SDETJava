package review;

public class T1 {

     public static int sum(int [] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];

        }
        return sum;
    }

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        //how to pass the value directly
        //array(new int[]{10,20,56})
        System.out.println("Sum of array is :"+sum(array));
    }
}
