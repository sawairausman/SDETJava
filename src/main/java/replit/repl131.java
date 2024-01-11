package replit;
    /*
    Write a method header on line two with the following specs:

Returns:
a String
```
Name:

```
thirdLetter``

Parameters:
```
a String called s
```
Then complete the method by programming the following behavior

```
Returns every 3rd letter of the String s,
```
```
starting from the first letter.
See below examples.
```
Examples:

```
thirdLetter("hello there") ==> "hltr"
thirdLetter("technology") ==> "thly"
```
     */


public class repl131 {

    public String thirdLetter(String s){

        String newString="";
        for (int i = 0; i < s.length() ; i+=3) {
           newString = newString + s.charAt(i);

        }return newString;


    }

    public static void main(String[] args) {

        System.out.println(new repl131().thirdLetter("hello there"));
        System.out.println(new repl131().thirdLetter("technology"));
    }
}
