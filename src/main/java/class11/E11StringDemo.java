package class11;

public class E11StringDemo {
    public static void main(String[] args) {
        String str = "dDfdfdfRG1235552RGR GDDDGdsss@$#4";
        System.out.println(str.replaceAll("[A-Z]", "x"));
        System.out.println(str.replaceAll("[a-z]","x"));
        System.out.println(str.replaceAll("[0-9]","x"));
        System.out.println(str.replaceAll("[A-Za-z]","x"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","x"));
        //^ dont replace A-Z but replace everything
        System.out.println(str.replaceAll("[^A-Z]","x"));
        System.out.println(str.replaceAll("[^A-Za-z]","x"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","x"));
// if you dont write anything in replace and write "" java remove those other things you can remove
        //unwanted things
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[!-@]",""));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[A-z]",""));
       //any space
        System.out.println(str.replaceAll("[\\s]",""));
       //any digit
        System.out.println(str.replaceAll("[\\d]",""));


       System.out.println((int)'A');
    }


}
