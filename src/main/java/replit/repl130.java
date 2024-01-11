package replit;
 /*
    **For you to do:**

Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element based on whether it's even or odd.

 If the number is even, divide it by 2.  If it's odd, multiply it by 10.

**Expected Output:**

```
10 1 30 2 50
```
     */

public class repl130 {
    public int[] mysteryArray(int [] Array){
        for (int i = 0; i < Array.length; i++) {

            if(Array[i]%2==0){
                Array[i]=Array[i]/2;
            }else{
                Array[i]=Array[i]*10;
            }

        }
        return Array;
    }

    public static void main(String[] args) {
        repl130 r = new repl130();
        int[] array = {1,2,3,4,5};
        int [] daray=r.mysteryArray(array);
        for (int i = 0; i < daray.length; i++) {
            System.out.print(daray[i]+" ");

        }

    }
}
