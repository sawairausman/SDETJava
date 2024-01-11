package class9;

public class E1Arrays {
    public static void main(String[] args) {
        int [][] matrix ={
                         {10,20,50},
                         {25,35,66},
                         {80,90,78,45},
                         {45,55,66}

        };

        System.out.println(matrix[1][2]);
        System.out.println(matrix[1][1]);//35
        System.out.println(matrix[0][2]);//50
        System.out.println(matrix[3][2]);//66
        // System.out.println(matrix[4][2]);// error because there is no 4th row
        // System.out.println(matrix[3][4]);// error because there is no 4th column on the row3
        System.out.println(matrix.length);// only give number of rows
        System.out.println(matrix[0].length);
    }
}
