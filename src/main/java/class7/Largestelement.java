package class7;

public class Largestelement {
    public static void main(String[] args) {
        int [] arr ={100,55,88,777,99,22,8};
        int lar =0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }

        }
        System.out.println("LargestElement is "+lar);
    }
}
