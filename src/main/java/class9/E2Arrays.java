package class9;

public class E2Arrays {
    public static void main(String[] args) {
        int [][] matrix ={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}

        };
        int [] row0 =matrix[0]; // copies matrix[0] in row0 variable
        System.out.println(row0[0]);
        for (int j=0; j<3;j++) {
            System.out.print(matrix[j][j] + " ");
        }
        for(int n: row0){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println(matrix[2][2]);

    }
}
