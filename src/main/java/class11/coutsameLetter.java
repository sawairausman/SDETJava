package class11;

public class coutsameLetter {
    public static void main(String[] args) {

        String str ="Java is Fun";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='a'){
              count++;
            }

        }
        System.out.println(count);


    }
}
