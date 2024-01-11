package class8;

public class E6EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers ={-10,-20,-3,0,45,2,6,8,9,54,63};

        for(int n:numbers){
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n: numbers){
            if(n<0){
                n=0;
            }
            System.out.print(n+" ");
        }
    }
}
