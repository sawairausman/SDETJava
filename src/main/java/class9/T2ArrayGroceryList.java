package class9;

public class T2ArrayGroceryList {

    public static void main(String[] args) {
        String[][] List = {
                {"Onions", "Garlic", "Cucumber", "Celery"},
                {"Banana", "Apple", "Guava", "Pineapple"},
                {"Milk", "Yogurt", "Cheese", "Curd"},
                {"Candies", "Chocolates", "Brownies", "Cupcakes"}

        };

        for (int i = 0; i < List.length; i++) {
            for (int j = 0; j < List[i].length; j++) {
                System.out.print(List[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("--------Enhanced Loop-----------");

        for(String [] row:List){
            for(String col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
    }



