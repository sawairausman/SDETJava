package replit;
/*
    **For you to do:**

Declare two static variables to hold

- country name
- continent

Create a method to display the value of static variables in the following format:

____ located on \_\_\_\_ continent

In the main method assign values to a static variable and execute method display

**Expected Output:**

```
Morocco located on Africa continent
```
     */

public class repl129 {
    public static String countryName;
    public static String continent;

    public static void display(String countryName, String continent){
        System.out.println(countryName+" located on "+continent+" continent");
    }

    public static void main(String[] args) {
        repl129.display("Morocco", "Africa");
    }

}
