package replit;

public class repl121 {
    public static void main(String[] args) {
        repl121 obj1 = new repl121(10,10.23,'a');
        obj1.printinfo();
        repl121 obj2= new repl121(100,100.23,'s');
        obj2.printinfo();

    }

    int x;
    double y;
    char z;
   repl121(int x, double y, char z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void printinfo(){
        System.out.println(x+" "+y+" "+z);
    }
}
