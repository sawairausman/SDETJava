package class11;

public class E7Methodchaining {
    public static void main(String[] args) {
        String str="  HELLO  ";

        // left to right is answer will be last method
        System.out.println(str.toLowerCase().trim().length());

        // left to right is answer will be last method
        System.out.println(str.toLowerCase().length());


        System.out.println(str.trim().toLowerCase().equals("hello"));
    }
}
