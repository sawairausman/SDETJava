package Homework;

public class HWClass17T1 {

    public int minOfTwoNumber(int num1, int num2){
        if(num1>num2){
            return num2;

        }
            return num1;

    }
    public double minOfTwoNumber(double num1, double num2){
        if(num1>num2){
          return num2;
        }
        return num1;


    }

    public static void main(String[] args) {
        System.out.println(new HWClass17T1().minOfTwoNumber(10,5));
        System.out.println(new HWClass17T1().minOfTwoNumber(2.5,3.5));
    }

}
