package class11;

public class PracticeMock3 {

    public static void minArray(int [] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }


        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int [] temp ={10,22,55,66,33,6,7};
        minArray(temp);
    }
}
