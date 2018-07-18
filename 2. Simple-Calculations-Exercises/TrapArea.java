import java.util.Scanner;

public class TrapArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double b1 = Double.valueOf(scan.nextLine());
        double b2 = Double.valueOf(scan.nextLine());
        double h = Double.valueOf(scan.nextLine());
        System.out.println((b1+b2)*h/2);
    }
}
