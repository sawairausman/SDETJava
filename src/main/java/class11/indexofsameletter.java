package class11;

public class indexofsameletter {
    public static void main(String[] args) {
        //print all the index of letter a from above string
        String str = "Today is Saturday";
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='a'){
                System.out.println((i));

            }
            //System.out.println(str.replace("a","b"));

        }

    }
}
