package class19;

//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//        Define 3 common behavior within parent class and override some of the methods in child classes
//        Define some methods specific to child classes
//        Write example of achieving run time polymorphism

public class Student {
    public void canLearn(){
        System.out.println("Students can learn");
    }
    public void getGrades(){
        System.out.println("Students gets grades");
    }


}

class SyntaxStudent extends Student{
   @Override
    public void canLearn(){
        System.out.println("Syntax Students learn online ");
    }
    @Override
    public void getGrades(){
        System.out.println("Syntax Students get their quiz graded");
    }
    public void learnJava(){
        System.out.println("Syntax Students learn Java");
    }
}

class CollegeStudet extends Student{

   @Override
    public void canLearn(){
        System.out.println("College Students go college to learn");
    }
   @Override
    public void getGrades(){
        System.out.println("College Students get their midterm and final graded");
    }

    public void learnSubjects(){
        System.out.println("College Students can choose to learn whatever he wants");
    }


}

class SchoolStudent extends Student{

   @Override
    public void canLearn(){
        System.out.println("School Student go school to learn");
    }
   @Override
    public void getGrades(){
        System.out.println("School Students get their finals graded");
    }

    public void learnSubjects(){
        System.out.println("School students " +
                "learn English");
    }

}
