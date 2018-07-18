import java.util.Scanner;

public class equalNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());

        if (a == b) {
            if (b == c) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            }
            else System.out.println("no");
        }
    }