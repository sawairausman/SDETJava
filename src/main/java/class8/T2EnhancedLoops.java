package class8;

public class T2EnhancedLoops {
    public static void main(String[] args) {
        int [] numbers = {101,100,25,30,25,50,300};
        //to count how many numbers are divisible by 5
// and how many are divisible by 2

        int count1 =0;
        int count2=0;

        for(int n: numbers){
            if(n%5==0) {
                count1++;
            }
            if(n%2==0){
                count2++;
            }

        }
        System.out.println("Numbers divisible by 5 : " + count1);
        System.out.println("Numbers divisible by 2 : "+ count2);


}
}
