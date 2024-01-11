package class9;

public class E3Arrays {
    public static void main(String[] args) {
        int [][] matrix ={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}

        };

        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
