package class6;

public class makeTriangle {
    public static void main(String[] args) {


//        for (int i = 1; i<=6;i++){
//            for(int j = 1; j<=i;j++) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
//
//        }


//        for (int i = 1; i <= 4; i++) {
//
//            {
//                for (int j = 1; j <= i; j++) {
//
//                    System.out.print("*");
//
//
//                }
//                System.out.println("");
//
//
//
//
//            }
//        }

        int max = 7;
        int k=max/2;


        for(int i=k;i>0;i--){

            for(int j=0;j<k+1;j++){

                if(i==j){

                    System.out.print("*");

                }else if(j>i){
                    System.out.print(" ");
                    System.out.print("*");
                }else {
                    System.out.print(" ");

                }

            }
            System.out.print("\n");

        }

    }

}

