package class7;

public class T2NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 7; i >= 1; i--) {

            for (int j = 1; j <=i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
