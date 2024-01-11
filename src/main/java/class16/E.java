package class16;
//Write program to inherit class E that has method printF which is
//        static and call or reuse that method into class F
public class E {
    static void printF(){
        System.out.println("Print F");
    }
}
class F extends E{

}

class Etester{
    public static void main(String[] args) {
        //calling a method with a class name
        F.printF();

    }
}
