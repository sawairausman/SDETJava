package groupEx1Practice;

public class mysteryNum {

    public static void mysteryArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.print(array[i]/2+" ");
            }else{
                System.out.print(array[i]*10+" ");
            }

        }
    }

    public static void main(String[] args) {
        int [] array= {1,2,3,4,5};
        mysteryArray(array);
    }
}
