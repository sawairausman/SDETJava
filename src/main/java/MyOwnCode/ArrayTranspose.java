package MyOwnCode;

public class ArrayTranspose {
    public static void main(String[] args) {
        //transpose of an array
        int[][] array = {{1, 2, 3, 5}, {4, 5, 6,7}};
        for (int col = 0; col < array[0].length; col++) {
            for (int row = 0; row < array.length; row++) {
                System.out.print(array[row][col]+" ");

            }
            System.out.println();

        }

    }

}
