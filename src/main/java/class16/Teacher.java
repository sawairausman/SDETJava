package class16;

//Write a Java program called Teacher.  Identify features and 4 behaviour of
//        that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and
//        PianoTeacher . Test all 4 classes

public class Teacher {

    String name;
    int age;


    void teach(){
        System.out.println("today we will teaching");
    }
    void grade(){
        System.out.println("today we will be grading tests");
    }
}

class MathTeacher extends Teacher {



    void teachMathFormulas() {
        System.out.println("math formulas");

    }
}

class ChemistryTeacher extends Teacher{

    void teachformulas(){
        System.out.println("teach chemistry formulas");
}

}

class PianoTeacher extends Teacher {

    public static void teachpiano() {
        System.out.println("teaching piano");

    }
}
