import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String town = scan.nextLine();
        double kolichestvo = Double.parseDouble(scan.nextLine());

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(0.5 * kolichestvo);
            } else if (product.equals("water")) {
                System.out.println(0.8 * kolichestvo);
            } else if (product.equals("beer")) {
                System.out.println(1.2 * kolichestvo);
            } else if (product.equals("sweets")) {
                System.out.println(1.45 * kolichestvo);
            } else if (product.equals("peanuts")) {
                System.out.println(1.6 * kolichestvo);
            }

        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(0.4 * kolichestvo);
            } else if (product.equals("water")) {
                System.out.println(0.7 * kolichestvo);
            } else if (product.equals("beer")) {
                System.out.println(1.15 * kolichestvo);
            } else if (product.equals("sweets")) {
                System.out.println(1.3 * kolichestvo);
            } else if (product.equals("peanuts")) {
                System.out.println(1.5 * kolichestvo);
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(0.45 * kolichestvo);
            } else if (product.equals("water")) {
                System.out.println(0.7 * kolichestvo);
            } else if (product.equals("beer")) {
                System.out.println(1.1 * kolichestvo);
            } else if (product.equals("sweets")) {
                System.out.println(1.35 * kolichestvo);
            } else if (product.equals("peanuts")) {
                System.out.println(1.55 * kolichestvo);
            }
        }
    }
}