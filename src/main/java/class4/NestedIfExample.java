package class4;

public class NestedIfExample {
    public static void main(String[] args) {

        boolean isMainDoorOpened = true;
        boolean isRoom1Opened = true;
        boolean isRoom2Opened = true;


        if(isMainDoorOpened){
            if(isRoom1Opened){
                System.out.println("We are in Room1");
            }else{
                System.out.println("Room 1 is closed");
            }
            if(isRoom2Opened){
                System.out.println("we are in room 2");
            }else{
                System.out.println("room 2 is closed");
            }
        }else{
            System.out.println("Cant Enter the house main door is closed" );
        }
    }
}


