import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bgn=Double.valueOf(scan.nextLine());
        double usd=bgn*1.79549;
        System.out.printf("USD = %.2f BGN",usd);
    }
}
