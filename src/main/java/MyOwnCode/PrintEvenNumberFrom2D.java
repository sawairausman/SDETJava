package MyOwnCode;

public class PrintEvenNumberFrom2D {
    public static void main(String[] args) {
        int [][] arr ={{2,4,6,8,10},{6,5,2,3,5}};
        for(int i =0; i<arr.length;i++){
            for(int j =0; j< arr[i].length;j++){
                if(arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        int sumEven= 0, sumodd =0;
        for(int i =0; i<arr.length;i++){
            for(int j =0; j< arr[i].length;j++){
                if(arr[i][j]%2==0){
                    sumEven=sumEven+arr[i][j];
                }else if (arr[i][j]%2!=0){
                    sumodd = sumodd+arr[i][j];
                }
                }
            }
        System.out.println();

        System.out.println("Sum of Even Numbers :" + sumEven);
        System.out.println("Sum of Odd Numbers :" + sumodd);


    }
}
