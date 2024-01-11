package class5;

public class E4LogicalOperators {
    public static void main(String[] args) {
        boolean bringFlower = true;
        boolean bringChocolates = true;
        boolean allMyMistakes = true;

        if(bringFlower || bringChocolates || allMyMistakes){
            System.out.println("HomeMinister is happy");
        }else {
            System.out.println("HomeMinister is Angry");
        }
    }
}
