import java.util.Scanner;

public class MoneyAward {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int partProject = Integer.parseInt(scan.nextLine());
        double moneyFor1part = Double.parseDouble(scan.nextLine());
        int tochki = 0;
        int total = 0;
        for (int i = 1; i <= partProject; i++) {
            int n = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                tochki = n * 2;
            } else {
                tochki = n;
            }
            total = total + tochki;
        }
        System.out.printf("The project prize was %.2f lv.", moneyFor1part * total);
    }
}
