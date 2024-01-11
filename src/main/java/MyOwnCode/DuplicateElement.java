package MyOwnCode;

public class DuplicateElement {
    public static void main(String[] args) {

        String [] names = {"Ashar","Sawaira","Usman","Arsal","Ashar","Sawaira","Muneeb","Muneeb","yasir","zeeshan","yasir"};


        for(int i =0; i<names.length; i++){
            for(int j = i+1; j<names.length;j++){
                if(names[i].equals(names[j])){
                    System.out.println(names[j]);
                }
            }
        }


    }

}


