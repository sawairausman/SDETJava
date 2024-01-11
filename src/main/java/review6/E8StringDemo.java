package review6;

public class E8StringDemo {
    public static void main(String[] args) {

        //input is char and output is index

        String str ="this one should be false";
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("one"));
        System.out.println(str.lastIndexOf("one"));
        System.out.println(str.lastIndexOf("is"));
        //checks from left too right
        System.out.println(str.indexOf('o'));
        //last indexoF of o will give 11 checks from right to left
        System.out.println(str.lastIndexOf('o'));
    }
}
