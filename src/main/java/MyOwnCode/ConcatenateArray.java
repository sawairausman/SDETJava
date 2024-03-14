package MyOwnCode;

public class ConcatenateArray {
    public static void main(String[] args) {

            String[] n1 = {"a", "b", "c"};
            String[] n2 = {"e", "f", "g"};


            String result = String.join("", n1) + String.join("", n2);


            System.out.println(result);
    }
}
