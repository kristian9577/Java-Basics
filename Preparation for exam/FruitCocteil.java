import java.util.Scanner;

public class FruitCocteil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String type = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        double price = 0;

        if (fruit.equals("Watermelon")) {
            if (type.equals("small")) {
                price = 2 * 56;
            } else if (type.equals("big")) {
                price = 5 * 28.70;
            }
        } else if (fruit.equals("Mango")) {
            if (type.equals("small")) {
                price = 2 * 36.66;
            } else if (type.equals("big")) {
                price = 5 * 19.6;
            }
        } else if (fruit.equals("Pineapple")) {
            if (type.equals("small")) {
                price = 2 * 42.1;
            } else if (type.equals("big")) {
                price = 5 * 24.8;
            }
        } else if (fruit.equals("Raspberry")) {
            if (type.equals("small")) {
                price = 2 * 20;
            } else if (type.equals("big")) {
                price = 5 * 15.2;
            }
        }
        double total = n * price;
        if (total < 400) {

            System.out.printf("%.2f lv.", total);
        } else if (total >= 400 && total <= 1000) {

            double money = total - 0.15 * total;
            System.out.printf("%.2f lv.", money);
        } else if (total > 1000) {

            double money = total - 0.5 * total;
            System.out.printf("%.2f lv.", money);
        }

    }
}
