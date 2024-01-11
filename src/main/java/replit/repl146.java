package replit;
//1. Complete the Employee.java class:
//
//        Include the following class variables:
//
//        * name(String)
//
//        * lastName(String)
//
//        * employeeId(int)
//
//        * startDate(String)
//
//        * salary(int)
//
//        Write two constructors:
//
//        * non-argument constructor
//
//        * parameterized constructor that will initialize all instance variables
//
//        Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
//
//        Output:
//
//
//
//        ```
//        null null 0 null 0
//        ```
//
//        ```
//        Joe Smith 12345 01/01/1970 35000
//        ```
public class repl146 {

    private String name;
    private String lasName;
    private int employeeId;
    private String startDate;
    private int salary;
    repl146(){

    }
    repl146(String name, String lasName, int employeeId, String startDate, int salary){
        this.name=name;
        this.lasName=lasName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }

    public void display(){
        System.out.println(name+" "+lasName+" "+employeeId+" "+startDate+" "+salary );
    }

    public static void main(String[] args) {
        repl146 e1= new repl146();
        e1.display();
        repl146 e2= new repl146("Joe","Smith",12345,"01/01/1970",35000);
        e2.display();
    }

}
