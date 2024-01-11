package MyOwnCode;

public class secondLarges {
    public static void main(String[] args) {
        int[] arr ={1,110,-1,90,16,74,89,25,100,105};
        int temp =0;
        for(int i =0; i<arr.length-1;i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]> arr[j]){
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }

            }
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            //System.out.println(arr[i.length-2]);

        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Second largest number is : "+ arr[arr.length-2]);

    }
}
