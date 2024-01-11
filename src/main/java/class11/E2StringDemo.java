package class11;

public class E2StringDemo {
    public static void main(String[] args) {
        String str ="Batch 18";
        //internally this is happening
        String str2 = new String("Batch 18");
        System.out.println(str.length());
        System.out.println(str2.length());

       boolean isEmpty=  str.isEmpty();
        System.out.println(isEmpty);
    }
}
