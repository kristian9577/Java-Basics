import java.util.Scanner;

public class Alcoholic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double priceYiski=Double.valueOf(scan.nextLine());
        double beer=Double.valueOf(scan.nextLine());
        double wine=Double.valueOf(scan.nextLine());
        double rakia=Double.valueOf(scan.nextLine());
        double yiski=Double.valueOf(scan.nextLine());


        double r1=priceYiski/2;
        double w1=r1-(0.4*r1);
        double b1=r1-(0.8*r1);

        double priceRakia=rakia*r1;
        double priceBeer=b1*beer;
        double priceYiskii=yiski*priceYiski;
        double priceWine=wine*w1;

        double money=priceBeer+priceRakia+priceWine+priceYiskii;

        System.out.printf("%.2f",money);
    }
}
