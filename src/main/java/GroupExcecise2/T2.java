package GroupExcecise2;

public class T2 {
 //Find out how many alpha characters are present in a string?

    public static void main(String[] args) {
        String str = new String("dfjsl#$RY%%3riejlmahs512");
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
    }
}
