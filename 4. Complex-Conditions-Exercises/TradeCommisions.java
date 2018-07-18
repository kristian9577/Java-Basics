import java.util.Scanner;

public class TradeCommisions {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double com = 0;
        if (town.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                com = 0.05 * sales;
                System.out.printf("%.2f", com);
            } else if (sales > 500 && sales <= 1000) {
                com = 0.07 * sales;
                System.out.printf("%.2f", com);
            } else if (sales > 1000 & sales <= 10000) {
                com = 0.08 * sales;
                System.out.printf("%.2f", com);
            } else if (sales > 10000) {
                com = 0.12 * sales;
                System.out.printf("%.2f", com);
            } else {
                System.out.println("error");
            }

        } else if (town.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                com = 0.045 * sales;
                System.out.printf("%.2f", com);
            } else if (sales > 500 && sales <= 1000) {
                com = 0.075 * sales;
                System.out.printf("%.2f", com);
            } else if (sales > 1000 & sales <= 10000) {
                com = 0.10 * sales;
                System.out.printf("%.2f", com);
            } else if (sales > 10000) {
                com = 0.13 * sales;
                System.out.printf("%.2f", com);
            } else {
                System.out.println("error");
            }

        } else if (town.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                com = 0.055 * sales;
                System.out.printf("%.2f", com);
            } else if (sales > 500 && sales <= 1000) {
                com = 0.08 * sales;
                System.out.printf("%.2f", com);
            } else if (sales > 1000 & sales <= 10000) {
                com = 0.12 * sales;
                System.out.printf("%.2f", com);
            } else if (sales > 10000) {
                com = 0.145 * sales;
                System.out.printf("%.2f", com);
            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }

    }
}