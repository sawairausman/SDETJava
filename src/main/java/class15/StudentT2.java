package class15;

public class StudentT2 {
     private String student;
     private double math;
     private double english;
     private double science;

     public StudentT2(String dStudent, double dMath, double dEnglish, double dScience ){
         student= dStudent;
         math = dMath;
         english = dEnglish;
         science = dScience;

     }

     public void calculateAverageGrade(){
         double markAvg = (math+english+science)/3;
         System.out.println( student+"'s Avg marks are " +markAvg);


     }

}
