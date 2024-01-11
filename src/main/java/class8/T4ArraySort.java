package class8;

public class T4ArraySort {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 18, 9, 60, 22, 30};
        // int [] numbers ={9,10,15,18,20,22,30,60}; // also sort the array

        boolean isSorted = true;

        int a = 0;

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;

                }

            }
        }


        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}

