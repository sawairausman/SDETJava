package review6;

public class E2StringDemo {
    public static void main(String[] args) {
        String str =" ";
        //string class gets spcl treatment instead of creating obj we can simply create
        //variable and can start assigning value to that variable

        //it return if there is anything written in the string
        System.out.println(str.isEmpty());//it counts spaces
        System.out.println(str.isBlank());

        //not all the methods can be chained isempty returns
        //boolean, is boolean also give boolean.
        //every method requires input it goes inside method it can or canot
        //produce the output
        //str.isEmpty().isBlank()
        //output of next method should be input of next method
        str.length();
        str.toLowerCase().trim().length();

    }


}
