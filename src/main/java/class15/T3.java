package class15;

public class T3 {


   static int age;
    private int weight;
    private int height;
    private String name;

    private T3(int dAge, int dWeight, int dHeight, String dName){
        age = dAge;
        weight = dWeight;
        height= dHeight;
        name = dName;
        System.out.println("1");
    }

    T3(int dAge, String dName ){
        age = dAge;
        name = dName;
        System.out.println("1");
    }

    //static keyword also not allowed with constructor
//    static T3(int dAge){
//        age = dAge;
//        System.out.println("2");
//
//    }
    protected T3(){
        System.out.println("2");
    }
    public T3(int dAge, int dWeight){
        age = dAge;
        weight = dWeight;

        System.out.println("3");

    }

}
