package class9;

public class CountriesTwoArray {
    public static void main(String[] args) {

        String[][] name = {{"Canada", "US", "Mexico"},
                {"Brazil", "Columbia", "Peru", "Chile"},
                {"Germany", "UK", "France", "Russia"},
                {"Ghana", "Nigeria", "SouthAfrica", "Angola"},
                {"Pakistan", "Nepal", "Bangladesh", "Afghanistan"}


        };
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                System.out.print(name[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("--------Enhanced Loop-----------");

        for (String[] row : name) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }
}
