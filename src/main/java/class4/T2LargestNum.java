package class4;

public class T2LargestNum {
    public static void main(String[] args) {

//        Write a program to find largest number among three
//        among three numbers stored in three variables called
//        as num1, num2, num3 using nested if (numbers must be distinct

        double num1= 100;
        double num2 = 200;
        double num3 = 300;

        if(num1>num2){
            if(num1>num3){
                System.out.println("Num1 is largest" + num1);
            }
        }else{
            if(num2>num3){
                System.out.println("Num 2 is largest "+ num2);
            }else{
                System.out.println("Num3 is largest " + num3);
            }
        }


    }
}
