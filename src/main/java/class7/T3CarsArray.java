package class7;

public class T3CarsArray {
    public static void main(String[] args) {
        String [] cars ={"BMW","Toyota","Honda","Lexus","Acura","Jeep"};

        for(int i =0; i<cars.length; i++){
            System.out.print(cars[i]+ ", ");
        }
        System.out.println();
        System.out.println("------------------");
        for(String i:cars){
            System.out.print(i+ ", ");

        }
    }
}
