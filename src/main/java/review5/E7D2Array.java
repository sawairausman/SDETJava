package review5;

public class E7D2Array {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {20, 40, 60, 80},
                {30, 60, 90, 120}
        };

        System.out.println(numbers.length);//number of row present in the 2d
        System.out.println(numbers[0].length);//total number of elements in first row 
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print( numbers[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
