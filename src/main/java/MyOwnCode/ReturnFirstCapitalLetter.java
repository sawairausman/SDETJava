package MyOwnCode;

public class ReturnFirstCapitalLetter {
    static void capitalizeString(String str) {
        String result = "";
        String[] ar = str.split("\\s");
        for (String s : ar) {
            char c = Character.toUpperCase(s.charAt(0));
            result = result + s.replace(s.charAt(0), c)+" ";


        }
        result.trim();
        System.out.println(result);
    }

    public static void main(String[] args) {
        capitalizeString("sawaira is learning java");
    }
}
