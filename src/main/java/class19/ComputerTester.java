package class19;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] c  = {new Lenovo(), new Apple(), new HP(), new Dell()};

        for(Computer arr:c){
            System.out.println();
            arr.playAudio();
            arr.openFile();
        }

    }
}
