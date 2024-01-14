package class23;

import java.util.HashSet;
import java.util.Set;

//Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order. Each student object should have name and studentID. Display name of each student.

public class T4 {

    public static void main(String[] args) {
        Set <Students> student = new HashSet<>();
//directly creating obj on student class and directly storing it.
        student.add(new Students("Ashar","id13"));
        student.add(new Students("James","id23"));
        student.add(new Students("Dan","id33"));
        student.add(new Students("Bob","id34"));

        student.forEach(x->x.printInfo());

    }
}

class Students{

    private String studentId;
    private String studentName;

    public Students(String name, String studentId){
        this.studentName=name;
        this.studentId=studentId;
    }

    public void printInfo() {
        System.out.println("Name: " + studentName);
        System.out.println("StudentId: " + studentId);


    }



}
