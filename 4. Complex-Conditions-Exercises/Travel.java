import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money=Double.parseDouble(scan.nextLine());
        String sezon=scan.nextLine();

        if(money<=100){
            System.out.println("Somewhere in Bulgaria");
            if(sezon.equals("summer")){
                double syma=money*0.3;
                System.out.printf("Camp - %.2f",syma);
            }
            else if(sezon.equals("winter")){
                double syma=money*0.7;
                System.out.printf("Hotel - %.2f",syma);
            }
        }
        else if(money>100 && money<=1000){
            System.out.println("Somewhere in Balkans");
            if(sezon.equals("summer")){
                double syma=money*0.4;
                System.out.printf("Camp - %.2f",syma);
            }
            else if(sezon.equals("winter")){
                double syma=money*0.8;
                System.out.printf("Hotel - %.2f",syma);
            }
        }
        else if(money>1000){
            System.out.println("Somewhere in Europe");
            double syma=money*0.9;
            System.out.printf("Hotel - %.2f",syma);
        }
    }
}
