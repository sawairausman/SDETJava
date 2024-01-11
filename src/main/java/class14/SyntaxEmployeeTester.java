package class14;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        SyntaxEmployeeT1 emp1= new SyntaxEmployeeT1();
        SyntaxEmployeeT1 emp2 = new SyntaxEmployeeT1();

        emp1.empID= "a1234";
        emp1.salary= 30000;
        emp1.printvalue();
        emp2.empID ="b1234";
        emp2.salary =40000;
        emp2.printvalue();

    }


}
