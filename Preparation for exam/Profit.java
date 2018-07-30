import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int coins1Count=Integer.parseInt(scan.nextLine());
        int coins2Count=Integer.parseInt(scan.nextLine());
        int coins5Count=Integer.parseInt(scan.nextLine());
        int money=Integer.parseInt(scan.nextLine());

        for (int coins1Counter = 0; coins1Counter <=coins1Count ; coins1Counter++) {
            for (int coins2Counter = 0; coins2Counter <=coins2Count ; coins2Counter++) {
                for (int coins5Counter = 0; coins5Counter <=coins5Count ; coins5Counter++) {
                    int currentMoney=coins1Counter*1+
                            coins2Counter*2+coins5Counter*5;
                    if(currentMoney==money){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n",coins1Counter,coins2Counter,coins5Counter,money);
                    }
                }
            }
        }
    }
}
