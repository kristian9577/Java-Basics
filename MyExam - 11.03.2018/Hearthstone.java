import java.util.Scanner;

public class Hearthstone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        double priceForOne=Double.parseDouble(scan.nextLine());
        double priceForOneAdventure=Double.parseDouble(scan.nextLine());
        double coffe=Double.parseDouble(scan.nextLine());


        int n1=n-5;
        int n2=6;
        int n3=4;
        int time=n1-(n2+n3);
        double money=3*priceForOne;
        double money1=2*priceForOneAdventure;
        double allmoney=money+money1+coffe;
        System.out.printf("%.2f\n",allmoney);
        System.out.println(time);
    }
}
