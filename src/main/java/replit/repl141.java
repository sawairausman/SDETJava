package replit;

public class repl141 {
   /* Create the maxValue method that will accept int array and return return the maximum value in the array.


    Method should visible every class in any package!*/


    public int maxValue(int [] array){
        int maxValue=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    maxValue=array[i];
                }else{
                    maxValue=array[j];
                }

            }

        }
        return maxValue;
    }

    public static void main(String[] args) {
        repl141 a = new repl141();
        int [] arr ={10,30,40,50,11,1000};
        int maxValue = a.maxValue(arr);
        System.out.println(maxValue);
    }
}
