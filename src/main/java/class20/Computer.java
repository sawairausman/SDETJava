package class20;

public abstract class Computer {

    public static String type;
    public String name;
    public int memory;
    String color;

    public Computer(String name, int memory, String color){
        this.name = name;
        this.memory = memory;
        this.color = color;
    }

    public static void playMusic(){
        System.out.println("I can play music on my "+type);
    }


    protected void printInfo(){
        System.out.println("I have "+name+" computer with "+memory+"memory");
    }

    abstract void executeCode();
    abstract void readEmails();
}
abstract class Apple extends Computer{

    public Apple(String name, int memory, String color){
        super(name, memory, color);

    }

    void executeCode(){
        System.out.println("Executing code on"+type+" "+name);
    }

}