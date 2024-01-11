package class16;

public class TeacherTester {
    public static void main(String[] args) {
        MathTeacher mt= new MathTeacher();
        ChemistryTeacher ct = new ChemistryTeacher();
        PianoTeacher pt = new PianoTeacher();

        mt.name ="Zozo";
        mt.age =22;
        ct.name="Lolo";
        ct.age =23;
        pt.name="Momo";
        pt.age = 24;

        mt.teach();
        ct.teach();
        pt.teach();

        mt.grade();
        ct.grade();
        pt.grade();

        mt.teachMathFormulas();
        ct.teachformulas();
        PianoTeacher.teachpiano();








    }
}
