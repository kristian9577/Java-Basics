import java.util.Scanner;

public class Borsa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vegatalePrice=Double.parseDouble(scan.nextLine());
        double fruitsPrie=Double.parseDouble(scan.nextLine());
        int vegatableTotal=Integer.parseInt(scan.nextLine());
        int fruitsTotal=Integer.parseInt(scan.nextLine());

        double vegatable=vegatableTotal*vegatalePrice;
        double fruits=fruitsPrie*fruitsTotal;
        double price=(vegatable+fruits)/1.94;
        System.out.println(price);
    }
}
