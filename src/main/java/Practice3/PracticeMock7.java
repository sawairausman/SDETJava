package Practice3;

public class PracticeMock7 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 2, 5, 3, 2, 5, 2, 5, 9};
        int n = arrays.length;
        for (int i = 0; i < n - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < n; j++) {
                if (arrays[i] > arrays[j]) {
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;

                }

            }


        }

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }


    }
}
