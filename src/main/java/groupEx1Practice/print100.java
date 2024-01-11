package groupEx1Practice;

public class print100 {

    public static void printNum(int num){
        if(num<=100){
            System.out.println(num);
            num++;
            printNum(num);
        }
    }

    public static void main(String[] args) {
        printNum(1);
    }
}
