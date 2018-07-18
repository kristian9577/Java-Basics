import java.util.Scanner;

public class TankfulCampain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days=Integer.parseInt(scan.nextLine());
        int cooker=Integer.parseInt(scan.nextLine());
        int cake=Integer.parseInt(scan.nextLine());
        int gofreti=Integer.parseInt(scan.nextLine());
        int pancake=Integer.parseInt(scan.nextLine());

        double cake1=45;
        double goreta=5.80;
        double pancake1=3.20;

        double c1=cake*cake1;
        double g1=gofreti*goreta;
        double p1=pancake1*pancake;
        double money = (c1+g1+p1)*cooker;
        double moremoney=money*days;
        double clearmoney=moremoney*0.875;
        System.out.printf("%.2f",clearmoney);

    }
}
