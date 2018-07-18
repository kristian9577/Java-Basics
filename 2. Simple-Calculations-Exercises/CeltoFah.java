import java.util.Scanner;

public class CeltoFah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cel=Double.valueOf(scan.nextLine());
        double fah=cel*1.8+32;
        System.out.printf("fah = %.2f",fah);
    }
}
