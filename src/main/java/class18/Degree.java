package class18;

//Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
//        Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
//        Call the method by creating an object of each of the three classes

public class Degree {

    public void getPreReq(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{
//
    }
//
//}

class Masters extends Degree{
    public void getPrerequisite(){
        super.getPreReq();
        System.out.println("You need Bachelors degree as a prerequiste too");

    }

    public static void main(String[] args) {
        Masters obj = new Masters();
        obj.getPrerequisite();
        Bachelors b = new Bachelors();
        b.getPreReq();
    }

}
