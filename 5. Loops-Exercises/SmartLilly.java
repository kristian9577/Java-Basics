import java.util.Scanner;

public class SmartLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year=Integer.parseInt(scan.nextLine());
        double priceP=Double.parseDouble(scan.nextLine());
        int priceToy=Integer.parseInt(scan.nextLine());

        int money=10;
        int colectmoney=0;
        int toy=0;
        int moneyToy=0;
        int brother=0;
        int allmoney=0;

        for(int i=1;i<=year;i++){
            if(i%2==0){
                colectmoney+=money;
                money+=10;
                brother++;
            }
            else{
                toy++;
            }
        }
        moneyToy=toy*priceToy;
        allmoney=colectmoney+moneyToy-brother;
        if(priceP<=allmoney){
            System.out.printf("Yes! %.2f",(allmoney-priceP));
        }
        else{
            System.out.printf("No! %.2f",(priceP-allmoney));
        }
    }
}
