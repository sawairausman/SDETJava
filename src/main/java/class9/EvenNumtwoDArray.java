package class9;

public interface EvenNumtwoDArray {
    public static void main(String[] args) {
        int [][] num ={{2,5,6,2},
                {14,55,67,22},
                {7,56,22,3},

        };


        for(int i=0; i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                if(num[i][j]%2==0){
                    System.out.print(num[i][j]+ " ");
                }

            }
            System.out.println();
        }
    }
}
