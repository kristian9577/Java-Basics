import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleDance=Integer.parseInt(scan.nextLine());
        double points=Double.parseDouble(scan.nextLine());
        String type= scan.nextLine();
        String country=scan.nextLine();
        double money=0;
        double money1=0;
        double moneyForB=0;
        double moneyForP=0;
        double m=0;

        if(type.equals("summer")){
            if(country.equals("Bulgaria")){
                money=peopleDance*points;
                money=money-money*0.05;
                moneyForB=money*0.75;
                moneyForP=money-moneyForB;
                m=moneyForP/peopleDance;
            }
            else if(country.equals("Abroad")){
                money=peopleDance*points;
                money1=money+0.5*money;
                money1=money1-money1*0.1;
                moneyForB=money1*0.75;
                moneyForP=money1-moneyForB;
                m=moneyForP/peopleDance;
            }
        }
        else if(type.equals("winter")){
            if(country.equals("Bulgaria")){
                money=peopleDance*points;
                money=money-money*0.08;
                moneyForB=money*0.75;
                moneyForP=money-moneyForB;
                m=moneyForP/peopleDance;
            }
            else if(country.equals("Abroad")){
                money=peopleDance*points;
                money1=money+0.5*money;
                money1=money1-money1*0.15;
                moneyForB=money1*0.75;
                moneyForP=money1-moneyForB;
                m=moneyForP/peopleDance;
            }
        }
        System.out.printf("Charity - %.2f\n",moneyForB);
        System.out.printf("Money per dancer - %.2f",m);

    }
}
