package class19;

public class StudentTester {
    public static void main(String[] args) {
        Student [] sd= {new SyntaxStudent(), new CollegeStudet(), new SchoolStudent()};

        for (Student student : sd) {
            System.out.println();
            Student s = student;
            s.canLearn();
            s.getGrades();

            if(student instanceof SyntaxStudent){
                SyntaxStudent ss =(SyntaxStudent)student;
                ss.learnJava();
            }
        }

        }
    }

