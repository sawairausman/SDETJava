package review3;

public class Switch {
    public static void main(String[] args) {

        int electionYear=2000;

        switch (electionYear) {

            default:
                System.out.println("President is unknown");
                break;
            case 2020:
                System.out.println("President is Biden");
                break;
            case 2016:
                System.out.println("President is Trump");
                break;
            case 2012:
                System.out.println("President is Obama");
                break;
        }

    }
}
