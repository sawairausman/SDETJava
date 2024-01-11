package class9;

public class T12AddArrays {
    public static void main(String[] args) {
        int [][] matrix ={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}

        };
        //sum of all rows


        int sum =0;
        for(int i =0; i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){

                sum= sum+ matrix[i][j];


            }


        }
        System.out.println(sum);
        System.out.println("------------------------");

        for(int i =0; i<matrix.length;i++) {
            int sum1 = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                sum1 = sum1 + matrix[i][j];


            }
            System.out.println("sum of row "+i+" "+sum1);

        }

    }
}
