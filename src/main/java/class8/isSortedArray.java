package class8;

public class isSortedArray {

    public static void main(String[] args) {

        int[] numbers = {10, 9, 26, 30, 40, 45, 45};

        boolean isSorted = true;
        int previous = numbers[0];

        for (int current : numbers) {
            if (previous > current) {
                isSorted = false;
                break;

            }
            previous = current;
        }
        System.out.println("is array SOrted "+ isSorted);
    }
}
