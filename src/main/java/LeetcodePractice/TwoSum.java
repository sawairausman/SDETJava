package LeetcodePractice;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr ={3,2,4};
        int sum =6;
        int target;


        for(int i =0; i<arr.length;i++){

            target= sum-arr[i];

            for(int j = i+1; j<arr.length;j++){
                if(target==arr[j]){
                    System.out.println(i+" "+j);
                }
            }

        }
           }

            }

