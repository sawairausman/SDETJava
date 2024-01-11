package class14;

public class StudentTesterT2 {
    public static void main(String[] args) {
        StudentT2 s1 = new StudentT2();
        s1.studentId = "10a";
        s1.studentName ="Ali";
        StudentT2.numberOfStudents ++;

        StudentT2 s2 = new StudentT2();
        s2.studentId = "11a";
        s2.studentName ="Anna";
        StudentT2.numberOfStudents ++;

        StudentT2 s3 = new StudentT2();
        s3.studentId = "12a";
        s3.studentName ="Basir";
        StudentT2.numberOfStudents ++;

        System.out.println("Total number of Students :" +StudentT2.numberOfStudents);

        StudentT2.countNumber();







    }
}
