import java.util.Scanner;

import java.util.Scanner;

public class Toys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ValueTrip = Double.parseDouble(scan.nextLine());
        double ValuePuzel = Double.parseDouble(scan.nextLine());
        double ValueKukli = Double.parseDouble(scan.nextLine());
        double ValueMeche = Double.parseDouble(scan.nextLine());
        double ValueMinion = Double.parseDouble(scan.nextLine());
        double ValueTruck = Double.parseDouble(scan.nextLine());

        double puzel = 2.60;
        double kukli = 3;
        double meche = 4.10;
        double minion = 8.20;
        double truck = 2;
        double money = puzel * ValuePuzel + kukli * ValueKukli + meche * ValueMeche + minion * ValueMinion + truck * ValueTruck;
        double value = ValueKukli + ValueMeche + ValuePuzel + ValueMinion + ValueTruck;
        double endMoney = money - (money * 0.25);
        if (value >= 50) {
            double naem = endMoney * 0.1;
            double pechalba = endMoney - naem;
            if (pechalba >= ValueTrip) {
                double trip = pechalba - ValueTrip;
                System.out.printf("Yes! %.2f lv left.", trip);
            } else {
                double trip = ValueTrip - pechalba;
                System.out.printf("Not enough money! %.2f lv needed.", trip);
            }
        }
        else{
            double naem = money * 0.1;
            double pechalba = money - naem;
            if (pechalba >= ValueTrip) {
                double trip = pechalba - ValueTrip;
                System.out.printf("Yes! %.2f lv left.", trip);
            } else {
                double trip = ValueTrip - pechalba;
                System.out.printf("Not enough money! %.2f lv needed.", trip);
            }
        }
    }
}