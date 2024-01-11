package class12;

public class Mypractice {
    public static void main(String[] args) {
        String str = "Its Sunday, i love waking up late on Sunday.";
        System.out.println(str.replace(" ",""));


        String str1= "adfBDIISLkksehnn#$#$^$%^$3mdskfn1234541";
        System.out.println(str1.replaceAll("[^A-Za-z]", " ").replaceAll(" ", "").length());

        String str2 = "Is is saturday? Is it raining? Do we have a Java Class today?";

        String [] str3 = str2.split("[?]");
        System.out.println(str3.length);

    }
}
