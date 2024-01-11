package replit;

public class repl140 {
    /*
   For you to do:

Create the maxLength method that will accept String array of words and return the word with the largest length.

Method should visible only within same package!

**Expected Output:**

```
this is long
```
    */
    public int maxLength(String [] array){
        int length=0;

        for(int i =0; i<array.length; i++){
          for(int j =i+1; j<array.length;j++){
              if(array[i].length()>array[j].length()){
                 length=  array[i].length();
              }else{
                  length = array[j].length();
              }
          }


            }return length;

    }

    public static void main(String[] args) {

        repl140 len = new repl140();
        String [] arr ={"Hello","I", "am","thisislongyoucandoi"};
        int maxLengthis =len.maxLength(arr);
        System.out.println(maxLengthis);


    }
}
