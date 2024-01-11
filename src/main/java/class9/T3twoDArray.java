package class9;

public class T3twoDArray {

    public static void main(String[] args) {
        String [][] names ={{"Ashar","Arsal","Munneb","Sana"},
                            {"A","B","C","B"}
        };


        for(int i=0; i< names[0].length; i++){

            if(names[1][i].equals("A")|| names[1][i].equals("B")) {
                System.out.println(names[0][i] + " " + names[1][i]);
            }


        }

        System.out.println("----------------------------");
        for (int col = 0; col < names[0].length; col++) {
            for (int row = 0; row < names.length; row++) {
                System.out.print(names[row][col]+" ");

            }
            System.out.println();

        }

        }
    }

