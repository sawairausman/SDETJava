package replit;
/*1. Complete the Dog.java class:

        Create following class variables.

        dogName

        dogWeight

static dogBreed=Mutt;

        For all methods and variables use proper naming convention.

        Create constructor to initialize instance variables

        2. In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.

        **Expected Output:**

        ```
        Tarzan Mutt 50.0
        Lucy Mutt 10.0
        ```*/
public class repl145 {
    private String name;
    private double dogWeight;
    static String dogBreed = "Mutt";

    repl145(String name,double dogWeight){
        this.name=name;
        this.dogWeight=dogWeight;

    }
    public void display(){
        System.out.println(name+" "+dogBreed+" "+dogWeight);
    }

    public static void main(String[] args) {
        repl145 d1 = new repl145("Tarzan",50.0);
        d1.display();
        repl145 d2 = new repl145("Lucy",10.0);
        d2.display();


    }

}
