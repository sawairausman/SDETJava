package class9;

public class T42DArray {
    public static void main(String[] args) {

        String [][] names ={{"American", "German","Korean","Italian"},
                {"Ford","Mercedes","Hyundai","Ferari"}

        };


        for (int col = 0; col < names[0].length; col++) {
            for (int row = 0; row < names.length; row++) {
                System.out.print(names[row][col]+" ");

            }
            System.out.println();

        }

        System.out.println();

        for(String[] cars:names){
            for(String car:cars){
                System.out.print(car+" ");
            }
            System.out.println();
        }
    }
}
