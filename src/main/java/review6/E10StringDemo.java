package review6;

public class E10StringDemo {
    public static void main(String[] args) {
        String str ="My name is James my Number is 91245687";
        String number = str.replaceAll("[^0-9]", "");
       // String number = str.replaceAll("[^\d]", "");

        System.out.println(number);

        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder);
    }
}
