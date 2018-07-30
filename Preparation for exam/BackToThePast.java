import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money=Double.parseDouble(scan.nextLine());
        int year=Integer.parseInt(scan.nextLine());
        int yers=18;

        for (int i = 1800; i <=year ; i++) {
            double money2=0;
            double money3=0;
            if(i%2==0){
                 money=money-12000;
            }
            else{
                money=money-12000-yers*50;
            }
            yers++;
        }
        if(money<0){
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(money));
        }
        else{
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
        }

    }
}
