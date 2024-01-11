package class15;

public class TeacherT1 {

//    Write a Teacher class   that have instance variables name and address.
//    Create a constructor that will initialize those variables. Print name & address
//    of given  Teacher using displayInfo method.

    private String name;
    private  String address;
    private int age;




    public TeacherT1(String name, String address, int age){
      this(name, address);
        this.age = age;
    }

    public TeacherT1(String name, String address) {
        this.name = name;
        this.address = address;

    }


    public void printAllInfo(){
        System.out.println(name+" "+address+" "+age);
    }
    public void printInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {

                new TeacherT1("Asghar", "Lahore Pakistan",30 ).printAllInfo();
                //t1.printAllInfo();
                new TeacherT1("Moazzam", "Islamabad Pakistan").printInfo();
                //t2.printInfo();

            }
        }




