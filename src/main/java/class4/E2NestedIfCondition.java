package class4;

public class E2NestedIfCondition {

    public static void main(String[] args) {
        double budget = 18000;
        String enginType = "Petrol";
        if (budget >= 50000) {
            if (enginType.equals("Electric")) {
                System.out.println("I want to buy a tesla");
            } else if (enginType.equals("Hybrid")) {
                System.out.println("I want to buy a toyota");
            } else {
                System.out.println("I want to buy a porche");
            }
        }else if (budget >= 30000) {
                if (enginType.equals("Electric")) {
                    System.out.println("i want to buy byd");
                } else if (enginType.equals("Hybrid")) {
                    System.out.println("i want buy camry");
                } else {
                    System.out.println("hyundai sonata");
                }
        }else if (budget >= 20000) {
                if (enginType.equals("Electric")) {
                    System.out.println("Nissan leaf");
                } else if (enginType.equals("Hybri")) {
                    System.out.println("kia");
                } else {
                    System.out.println("honda civic");
                }
        }else {
            System.out.println("lets save more");
        }
        }
    }


