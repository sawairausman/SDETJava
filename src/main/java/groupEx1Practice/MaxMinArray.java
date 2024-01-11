package groupEx1Practice;

public class MaxMinArray {

    public static void maxNum(int [] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {


            if(array[i]>max){
                max= array[i];
            }

        }System.out.println("max value in array is "+max);

     }


     public static void minNum(int [] array){
         int min=array[0];
         for (int i = 0; i < array.length; i++) {

             if(array[i]<min){
                 min= array[i];
             }

         }
         System.out.println("min value in array is "+min);
     }



    public static void main(String[] args) {
        int [] temp ={10,22,55,66,33,6,7};
        maxNum(temp);
        minNum(temp);
    }

        }


