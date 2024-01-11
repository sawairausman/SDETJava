package MyOwnCode;

public class SecondLargest {

    public static void main(String[] args) {

        //int[] arr = {30, 20, 25, 5, 88, 77};

        int[] arr ={1,110,-1,90,16,74,89,25,100};
        int lar = 0, seclar = 0;


        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if(ele>lar){
                seclar = lar;
                lar= ele;
            }else if(ele>seclar && ele != lar){
                seclar = ele;
            }
        }
        System.out.println(seclar);


        System.out.println("-----------------------------------------------");

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
