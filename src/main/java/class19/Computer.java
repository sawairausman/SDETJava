package class19;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//        Define common behavior within and some fields in parent class and override some of the methods in child classes
//        Define some methods specific to child classes
//        Create objects of child classes and store them into array. Loop through each object and execute available methods.
public class Computer{




    public void  playAudio(){
        System.out.println("Computer is playing Audio with ");

    }
    public void openFile(){
        System.out.println("Computer is opening a File");
    }

}

class Apple extends Computer{

    public void playAudio(){
        System.out.println("Apple is playing Audio");

    }
    public void openFile(){
        System.out.println("Apple is opening a File");
    }
}

class Lenovo extends Computer{


    public void playAudio(){
        System.out.println("Lenova is playing Audio");

    }
    public void openFile(){
        System.out.println("Lenova is opening a File");
    }

}
class HP extends Computer{



    public void playAudio(){
        System.out.println("HP is playing Audio");

    }
    public void openFile(){
        System.out.println("HP is opening a File");
    }

}

class Dell extends Computer{


    public void playAudio(){
        System.out.println("Dell is playing Audio");

    }
    public void openFile(){
        System.out.println("Dell is opening a File");
    }


}