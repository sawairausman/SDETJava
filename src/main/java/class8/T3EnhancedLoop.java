package class8;

public class T3EnhancedLoop {
    public static void main(String[] args) {

        int [] numbers ={10,15,20,18,9,60,22,30};
        //show the sum of even numbers and odd numbers separately

        int sumEven= 0, sumOdd =0;

        for(int n : numbers){
            if(n%2==0){
                sumEven= sumEven+n;
            }
            if(n%2!=0){
                sumOdd= sumOdd+n;
            }
        }
        System.out.println("Sum of Even numbers :" +sumEven);
        System.out.println("Sum of Odd numbers :" +sumOdd);

    }
}
